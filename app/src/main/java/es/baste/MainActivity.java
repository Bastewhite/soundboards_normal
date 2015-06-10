package es.baste;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.squareup.otto.Subscribe;

import butterknife.ButterKnife;
import butterknife.InjectView;
import es.baste.adapters.MyPagerAdapter;
import es.baste.application.MyApplication;
import es.baste.otto.BusProvider;
import es.baste.otto.events.ChangeBackgroundEvent;

public class MainActivity extends AppCompatActivity {

    public static SharedPreferences prefs;
    private ProgressDialog progressDialog;
    private MyPagerAdapter mAppSectionsPagerAdapter;

    @InjectView(R.id.toolbar)
    Toolbar mToolbar;
    @InjectView(R.id.tabs)
    TabLayout mTabs;
    @InjectView(R.id.viewpager)
    ViewPager mViewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        prefs = PreferenceManager.getDefaultSharedPreferences(this);
        progressDialogLoad(this);
        Utils.salir = false;

        newDesignLoad();
    }

    private void newDesignLoad() {
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);

        setSupportActionBar(mToolbar);

        mAppSectionsPagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
        mViewpager.setAdapter(mAppSectionsPagerAdapter);
        mTabs.setupWithViewPager(mViewpager);

        mViewpager.setBackgroundResource(BuildConfig.DEFAULT_FONDO);

        String fav = prefs.getString("fav", "");
        if (fav.equals(""))
            mViewpager.setCurrentItem(0);
        else
            mViewpager.setCurrentItem(1);

        // Buscar AdView como recurso y cargar una solicitud.
        AdView adView = (AdView) findViewById(R.id.adView);
        adView.loadAd(new AdRequest.Builder().build());
    }

    private void progressDialogLoad(final Context mContext) {
        Runnable showWaitDialog = new Runnable() {
            public void run() {
                UtilesSonidos.sonidos();
                iniciarListaFav();
                if (prefs.getInt("VersionCode", 0) < getVersion()) {
                    SharedPreferences.Editor editor = prefs.edit();
                    editor.remove("nuevos");
                    editor.commit();
                }
                progressDialog.dismiss();
            }
        };
        progressDialog = new ProgressDialog(mContext);
        progressDialog.setMessage("Cargando");
        progressDialog.setCancelable(false);
        progressDialog.show();
        Thread t = new Thread(showWaitDialog);
        t.start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_preferences:
                Intent ii = new Intent(MainActivity.this, SettingsActivity.class);
                startActivityForResult(ii, 1000);
                return true;
            case R.id.menu_share:
                String s = "He estado usando "
                        + getResources().getString(R.string.app_name)
                        + " y creo que te gustará. Pruébalo en tu Android: "
                        + "http://market.android.com/details?id="
                        + getPackageName();
                Intent it = new Intent(Intent.ACTION_SEND);
                it.putExtra(Intent.EXTRA_TEXT, s);
                it.setType("text/plain");
                startActivity(Intent.createChooser(it, "Compartir aplicación"));
                return true;
            case R.id.menu_search:
                onSearchRequested();
                return true;
            case R.id.menu_random:
                Sound so = UtilesSonidos.getListaTodos().get((int) (Math.random()
                        * UtilesSonidos.getListaTodos().size() + 0));
                Utils.reproducir(getApplicationContext(), so);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private int getVersion() {
        int version = -1;
        try {
            PackageInfo pInfo = getPackageManager().getPackageInfo(
                    getPackageName(), PackageManager.GET_META_DATA);
            version = pInfo.versionCode;
        } catch (NameNotFoundException e1) {
            Log.e(this.getClass().getSimpleName(), "Name not found", e1);
        }
        return version;
    }

    private void iniciarListaFav() {
        if(Utils.getListaFavoritos().isEmpty()){
            String fav = prefs.getString("fav", "");
            String data[] = fav.split("-");
            for (String ss : data) {
                for(Sound so:UtilesSonidos.getListaTodos())
                    if(so.getNombre().equals(ss))
                        Utils.getListaFavoritos().add(so);
            }}
    }

    @Override
    public void onBackPressed() {
        if(Utils.onBackPressed(this))
            super.onBackPressed();
    }

    @Override
    protected void onStart() {
        super.onStart();
        // Send a screen view.
        ((MyApplication) getApplication()).setTrackerScreenName(this.getClass().getName());
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        for (int i = 0; i < mAppSectionsPagerAdapter.getCount(); i++) {
            Fragment fragment = mAppSectionsPagerAdapter.getItem(i);
            if (fragment != null) {
                fragment.onActivityResult(requestCode, resultCode, data);
            }
        }
    }

    @Subscribe
    public void changeBackground(ChangeBackgroundEvent event) {
        if (event.getSound().getImage() != 0) {
            mViewpager.setBackgroundResource(event.getSound().getImage());
        }
    }

    @Override
    public void onResume() {
        super.onResume();

        BusProvider.getInstance().register(this);
    }

    @Override
    public void onPause() {
        super.onPause();

        BusProvider.getInstance().unregister(this);
    }

}

package es.baste;

import android.app.SearchManager;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;
import es.baste.adapters.MyRecyclerViewAdapter;
import es.baste.application.MyApplication;

public class SearchableActivity extends AppCompatActivity {

    @InjectView(R.id.recyclerview)
    RecyclerView mRecyclerview;
    @InjectView(R.id.tvListaVacia)
    TextView mTvListaVacia;

    @Override
    protected void onStart() {
        super.onStart();
        // Send a screen view.
        ((MyApplication) getApplication()).setTrackerScreenName(this.getClass().getName());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_search);
        ButterKnife.inject(this);

        String query = getIntent().getStringExtra(SearchManager.QUERY);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setSubtitle("Resultados de la búsqueda: " + query);

        setVolumeControlStream(AudioManager.STREAM_MUSIC);
        final List<Sound> l = new ArrayList<Sound>();

        // Get the intent, verify the action and get the query
        if (Intent.ACTION_SEARCH.equals(getIntent().getAction())) {
            // doMySearch(query);
            for (Sound s : UtilesSonidos.getListaTodos()) {
                if (limpiarString(s.getNombre()).contains(limpiarString(query)))
                    l.add(s);
            }
        }

        mRecyclerview.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL_LIST));
        mRecyclerview.setLayoutManager(new LinearLayoutManager(mRecyclerview.getContext()));
        mRecyclerview.setAdapter(new MyRecyclerViewAdapter(this, l));

        if (l.isEmpty()) {
            mTvListaVacia.setVisibility(View.VISIBLE);
        }
    }

    public String limpiarString(String input) {
        // Cadena de caracteres original a sustituir.
        String original = "áéíóúÁÉÍÓÚABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // Cadena de caracteres ASCII que reemplazarán los originales.
        String ascii = "aeiouaeiouabcdefghijklmnopqrstuvwxyz";
        String output = input;
        for (int i = 0; i < original.length(); i++) {
            // Reemplazamos los caracteres especiales.
            output = output.replace(original.charAt(i), ascii.charAt(i));
        }// for i
        return output;
    }

    public boolean onSearchRequested() {
        return false;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
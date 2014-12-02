package es.baste.views;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import es.baste.MainActivity;
import es.baste.R;
import es.baste.Sonido;
import es.baste.Utiles;
import es.baste.otto.BusProvider;
import es.baste.otto.events.UpdateEvent;

/**
 * Created by Fran on 12/06/2014.
 */
public class SonidoItemController {

    @InjectView(R.id.icon_new)
    ImageView nuevo;
    @InjectView(R.id.TodtvMail)
    TextView mTodtvMail;
    @InjectView(R.id.TodbtnRemove)
    CheckBox btnRemove;
    @InjectView(R.id.video)
    Button mVideo;

    private Sonido mSonido;

    public static SonidoItemController get(View view) {
        SonidoItemController controller = (SonidoItemController) view.getTag();
        if (controller == null) {
            controller = new SonidoItemController();
            ButterKnife.inject(controller, view);
            view.setTag(controller);
        }

        return controller;
    }

    public SonidoItemController configure(Sonido sonido) {
        this.mSonido = sonido;

        //Texto
        mTodtvMail.setText(sonido.getNombre());

        //Checkbox
        btnRemove.setChecked(Utiles.getListaFavoritos().contains(sonido));

        //Icono nuevo
        boolean vnuevos = MainActivity.prefs.getBoolean("nuevos", true);
        if (sonido.isNuevo() && vnuevos)
            nuevo.setVisibility(View.VISIBLE);
        else
            nuevo.setVisibility(View.GONE);

        //Video
        mVideo.setVisibility(sonido.getVideoUrl()!= null ? View.VISIBLE : View.GONE);
        if(sonido.getVideoUrl() == null) {
            mVideo.setVisibility(View.GONE);
        }
        else {
            mVideo.setBackgroundResource(sonido.getVideoUrl().contains("youtube") ? R.drawable.youtube : R.drawable.play);
            mVideo.setVisibility(View.VISIBLE);
        }

        return this;
    }

    public static int getLayoutResource() {
        return R.layout.todos_row;
    }

    @OnClick(R.id.TodbtnRemove)
    public void onFavoritesClick(View view) {
        if (btnRemove.isChecked()) {
            anadirFavorito(view.getContext(), mSonido);
        } else {
            eliminarFavorito(view.getContext(), mSonido);
        }
        BusProvider.getInstance().post(new UpdateEvent());
    }

    @OnClick(R.id.video)
    public void onVideoClick(View view) {
        if (Utiles.getMediaPlayer().isPlaying())
            Utiles.getMediaPlayer().stop();

        Context context = view.getContext();
        if (mSonido.getVideoUrl().contains("dropbox")) {
            Intent intent = new Intent();
            intent.setAction(android.content.Intent.ACTION_VIEW);
            intent.setDataAndType(Uri.parse(mSonido.getVideoUrl()), "video/*");
            List<ResolveInfo> intents = context.getPackageManager()
                    .queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY);
            if (intents != null && intents.size() > 0) {
                context.startActivity(intent);
            }
            else {
                openVideoUrl(context);
            }
        }
        else {
            openVideoUrl(context);
        }
    }

    private void openVideoUrl(Context context) {
        Intent i = new Intent("android.intent.action.VIEW", Uri
                .parse(mSonido.getVideoUrl()));
        context.startActivity(i);
    }

    private void anadirFavorito(Context context, Sonido aux) {
        SharedPreferences prefs = MainActivity.prefs;
        Utiles.getListaFavoritos().add(aux);
        String fav = prefs.getString("fav", "");
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("fav", fav + "-" + aux.getNombre());
        editor.commit();
        Toast.makeText(context, R.string.anadido,
                Toast.LENGTH_SHORT).show();
    }


    private void eliminarFavorito(Context context, Sonido aux) {
        SharedPreferences prefs = MainActivity.prefs;
        Utiles.getListaFavoritos().remove(aux);
        String s = "";
        for (Sonido sss : Utiles.getListaFavoritos()) {
            s = s + "-" + sss.getNombre();
        }
        SharedPreferences.Editor editor = prefs.edit();
        editor.remove("fav");
        editor.putString("fav", s);
        editor.commit();
        Toast.makeText(context, R.string.eliminado, Toast.LENGTH_SHORT).show();
    }

}

package es.baste.views;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Vibrator;
import android.support.v7.widget.RecyclerView;
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
import es.baste.R;
import es.baste.Sound;
import es.baste.Utils;
import es.baste.application.SharedPreferencesManager;
import es.baste.otto.BusProvider;
import es.baste.otto.events.UpdateEvent;

/**
 * Created by Fran on 12/06/2014.
 */
public class SoundItemController extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {

    @InjectView(R.id.icon_new)
    ImageView nuevo;
    @InjectView(R.id.TodtvMail)
    TextView mTodtvMail;
    @InjectView(R.id.TodbtnRemove)
    CheckBox btnRemove;
    @InjectView(R.id.video)
    Button mVideo;

    private Sound mSound;

    public SoundItemController(View itemView) {
        super(itemView);

        ButterKnife.inject(this, itemView);
        itemView.setOnClickListener(this);
        itemView.setOnLongClickListener(this);
    }

    public SoundItemController configure(Sound sound) {
        this.mSound = sound;

        //Texto
        mTodtvMail.setText(sound.getNombre());

        //Checkbox
        btnRemove.setChecked(Utils.getListaFavoritos().contains(sound));

        //Icono nuevo
        if (sound.isNuevo() && SharedPreferencesManager.getInstance(mTodtvMail.getContext()).isShowNews())
            nuevo.setVisibility(View.VISIBLE);
        else
            nuevo.setVisibility(View.GONE);

        //Video
        mVideo.setVisibility(sound.getVideoUrl()!= null ? View.VISIBLE : View.GONE);
        if(sound.getVideoUrl() == null) {
            mVideo.setVisibility(View.GONE);
        }
        else {
            mVideo.setBackgroundResource(sound.getVideoUrl().contains("youtube") ? R.drawable.youtube : R.drawable.play);
            mVideo.setVisibility(View.VISIBLE);
        }

        return this;
    }

    public static int getLayoutResource() {
        return R.layout.view_sound_item;
    }

    @OnClick(R.id.TodbtnRemove)
    public void onFavoritesClick(View view) {
        if (btnRemove.isChecked()) {
            anadirFavorito(view.getContext(), mSound);
        } else {
            eliminarFavorito(view.getContext(), mSound);
        }
        BusProvider.getInstance().post(new UpdateEvent());
    }

    @OnClick(R.id.video)
    public void onVideoClick(View view) {
        if (Utils.getMediaPlayer().isPlaying())
            Utils.getMediaPlayer().stop();

        Context context = view.getContext();
        if (mSound.getVideoUrl().contains("dropbox")) {
            Intent intent = new Intent();
            intent.setAction(android.content.Intent.ACTION_VIEW);
            intent.setDataAndType(Uri.parse(mSound.getVideoUrl()), "video/*");
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
                .parse(mSound.getVideoUrl()));
        context.startActivity(i);
    }

    private void anadirFavorito(Context context, Sound aux) {
        Utils.getListaFavoritos().add(aux);
        SharedPreferencesManager.getInstance(context).addFav(aux.getNombre());
        Toast.makeText(context, R.string.anadido, Toast.LENGTH_SHORT).show();
    }


    private void eliminarFavorito(Context context, Sound aux) {
        Utils.getListaFavoritos().remove(aux);
        SharedPreferencesManager.getInstance(context).reloadFavs();
        Toast.makeText(context, R.string.eliminado, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        Utils.reproducir(v.getContext(), mSound);
    }

    @Override
    public boolean onLongClick(View v) {
        Vibrator vv = (Vibrator) v.getContext().getSystemService(Context.VIBRATOR_SERVICE);
        vv.vibrate(25);
        Utils.subMenu(mSound, v.getContext());
        return false;
    }
}

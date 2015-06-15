package es.baste;

import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;

import es.baste.otto.BusProvider;
import es.baste.otto.events.ChangeBackgroundEvent;

public class Utils {

    private static List<Sound> favoritos = new ArrayList<Sound>();
    private static MediaPlayer mp = new MediaPlayer();

    private static Sound anterior;
    private static boolean sonido = false;

    public static String nombre = BuildConfig.FOLDER_NAME;
    private static String PATH = Environment.getExternalStorageDirectory() + File.separator + nombre + File.separator;

    public static MediaPlayer getMediaPlayer() {
        return mp;
    }

    public static List<Sound> getListaFavoritos() {
        return favoritos;
    }

    public static void reproducir(Context cont, Sound s) {
        if (s.equals(anterior) && sonido && mp.isPlaying()) {
            mp.stop();
            sonido = false;
        } else {
            anterior = s;
            sonido = true;
            if (mp != null)
                mp.reset();
            int repro = 0;
            if (UtilesSonidos.getListaTodos().contains(s))
                repro = s.getArchivo();
            if (repro == 0) {
                Toast.makeText(cont, "Error", Toast.LENGTH_SHORT).show();
            } else {
                try {
                    AssetFileDescriptor afd = cont.getResources()
                            .openRawResourceFd(repro);
                    mp.setDataSource(afd.getFileDescriptor(),
                            afd.getStartOffset(), afd.getLength());
                    mp.prepare();
                } catch (IllegalStateException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                mp.start();
            }
        }
        BusProvider.getInstance().post(new ChangeBackgroundEvent(s));
    }

    public static void nomedia(Context mContext) {
        byte[] buffer = null;
        InputStream fIn = mContext.getResources()
                .openRawResource(R.raw.nomedia);
        int size = 0;

        try {
            size = fIn.available();
            buffer = new byte[size];
            fIn.read(buffer);
            fIn.close();
        } catch (IOException e) {
        }

        String filename = ".nomedia";

        FileOutputStream save;
        try {
            save = new FileOutputStream(PATH + filename);
            save.write(buffer);
            save.flush();
            save.close();
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }

        mContext.sendBroadcast(new Intent(
                Intent.ACTION_MEDIA_SCANNER_SCAN_FILE, Uri.parse("file://"
                + PATH + filename)));

        new File(PATH, filename);
    }

    static boolean salir = false;

    public static boolean onBackPressed(Context mContext) {
        if (!salir) {
            salir = true;
            Toast.makeText(mContext, "Pulse otra ver para salir",
                    Toast.LENGTH_SHORT).show();
            return false;
        } else {
            if (MainActivity.prefs.getInt("VersionCode", 0) < getVersion(mContext)) {
                SharedPreferences.Editor editor = MainActivity.prefs.edit();
                editor.putBoolean("nuevos", false);
                editor.putInt("VersionCode", getVersion(mContext));
                editor.commit();
            }
            if (mp.isPlaying())
                mp.stop();
            return true;
        }
    }

    private static int getVersion(Context mContext) {
        int version = -1;
        try {
            PackageInfo pInfo = mContext.getPackageManager().getPackageInfo(
                    mContext.getPackageName(), PackageManager.GET_META_DATA);
            version = pInfo.versionCode;
        } catch (NameNotFoundException e1) {
            // Log.e(this.getClass().getSimpleName(), "Name not found", e1);
        }
        return version;
    }

    /**
     * @param aux
     * @param mContext
     */
    public static void subMenu(final Sound aux, final Context mContext) {
        final CharSequence[] items = {"Asignar como...", "Compartir...",
                "Copiar a SD"};

        AlertDialog.Builder builder = new AlertDialog.Builder(mContext);
        builder.setItems(items, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int item) {
                if (item == 0) {
                    asignarComo(aux, mContext);
                } else if (item == 1 && compartir(aux, mContext)) {
                } else if (item == 2 && save(aux, mContext)) {
                    Toast.makeText(mContext, "Copiado en: '" + nombre + "'",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(mContext, "Upsss, algo ha ido mal :(",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        AlertDialog alert = builder.create();
        alert.setTitle(aux.getNombre());
        alert.show();
    }

    public static void asignarComo(final Sound aux, final Context mContext) {
        final CharSequence[] items = {"Tono", "Notificación", "Alarma"};

        AlertDialog.Builder builder = new AlertDialog.Builder(mContext);
        builder.setItems(items, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int item) {
                if (item == 0 && save(aux, mContext)
                        && saveAsRingtone(aux.getNombre(), mContext)) {
                    Toast.makeText(mContext, "Asignado como tono",
                            Toast.LENGTH_SHORT).show();
                } else if (item == 1 && save(aux, mContext)
                        && saveAsNotification(aux.getNombre(), mContext)) {
                    Toast.makeText(mContext, "Asignado como notificación",
                            Toast.LENGTH_SHORT).show();
                } else if (item == 2 && save(aux, mContext)
                        && saveAsAlarm(aux.getNombre(), mContext)) {
                    Toast.makeText(mContext, "Asignado como alarma",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(mContext, "Upsss, algo ha ido mal :(",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        AlertDialog alert = builder.create();
        alert.setTitle(aux.getNombre());
        alert.show();
    }

    public static boolean saveAsRingtone(String s, Context mContext) {
        File k = new File(PATH + normalizeString(s) + ".mp3");

        ContentValues values = new ContentValues();
        values.put(MediaStore.MediaColumns.DATA, k.getAbsolutePath());
        values.put(MediaStore.MediaColumns.TITLE, normalizeString(s));
        values.put(MediaStore.MediaColumns.MIME_TYPE, "audio/mp3");
        values.put(MediaStore.Audio.Media.ARTIST, "cssounds ");
        values.put(MediaStore.Audio.Media.IS_RINGTONE, true);
        values.put(MediaStore.Audio.Media.IS_NOTIFICATION, false);
        values.put(MediaStore.Audio.Media.IS_ALARM, false);
        values.put(MediaStore.Audio.Media.IS_MUSIC, false);

        // Insert it into the database
        Uri newUri = mContext.getContentResolver()
                .insert(MediaStore.Audio.Media.getContentUriForPath(k
                        .getAbsolutePath()), values);

        RingtoneManager.setActualDefaultRingtoneUri(mContext,
                RingtoneManager.TYPE_RINGTONE, newUri);
        return true;
    }

    public static boolean saveAsNotification(String s, Context mContext) {
        File k = new File(PATH + normalizeString(s) + ".mp3");

        ContentValues values = new ContentValues();
        values.put(MediaStore.MediaColumns.DATA, k.getAbsolutePath());
        values.put(MediaStore.MediaColumns.TITLE, normalizeString(s));
        values.put(MediaStore.MediaColumns.MIME_TYPE, "audio/mp3");
        values.put(MediaStore.Audio.Media.ARTIST, "cssounds ");
        values.put(MediaStore.Audio.Media.IS_RINGTONE, false);
        values.put(MediaStore.Audio.Media.IS_NOTIFICATION, true);
        values.put(MediaStore.Audio.Media.IS_ALARM, false);
        values.put(MediaStore.Audio.Media.IS_MUSIC, false);

        // Insert it into the database
        Uri newUri = mContext.getContentResolver()
                .insert(MediaStore.Audio.Media.getContentUriForPath(k
                        .getAbsolutePath()), values);

        RingtoneManager.setActualDefaultRingtoneUri(mContext,
                RingtoneManager.TYPE_NOTIFICATION, newUri);
        return true;
    }

    public static boolean saveAsAlarm(String s, Context mContext) {
        File k = new File(PATH + normalizeString(s) + ".mp3");

        ContentValues values = new ContentValues();
        values.put(MediaStore.MediaColumns.DATA, k.getAbsolutePath());
        values.put(MediaStore.MediaColumns.TITLE, normalizeString(s));
        values.put(MediaStore.MediaColumns.MIME_TYPE, "audio/mp3");
        values.put(MediaStore.Audio.Media.ARTIST, "cssounds ");
        values.put(MediaStore.Audio.Media.IS_RINGTONE, false);
        values.put(MediaStore.Audio.Media.IS_NOTIFICATION, false);
        values.put(MediaStore.Audio.Media.IS_ALARM, true);
        values.put(MediaStore.Audio.Media.IS_MUSIC, false);

        // Insert it into the database
        Uri newUri = mContext.getContentResolver()
                .insert(MediaStore.Audio.Media.getContentUriForPath(k
                        .getAbsolutePath()), values);

        RingtoneManager.setActualDefaultRingtoneUri(mContext,
                RingtoneManager.TYPE_ALARM, newUri);
        return true;
    }

    public static String normalizeString(String unicodeName) {
        return Normalizer.normalize(unicodeName.toLowerCase(), Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
    }

    public static boolean save(Sound s, Context mContext) {
        byte[] buffer;
        InputStream fIn = mContext.getResources().openRawResource(
                s.getArchivo());
        int size;

        try {
            size = fIn.available();
            buffer = new byte[size];
            fIn.read(buffer);
            fIn.close();
        } catch (IOException e) {
            return false;
        }

        String filename = normalizeString(s.getNombre()) + ".mp3";

        boolean exists = (new File(PATH)).exists();
        if (!exists) {
            new File(PATH).mkdirs();
            nomedia(mContext);
        }

        FileOutputStream save;
        try {
            save = new FileOutputStream(PATH + filename);
            save.write(buffer);
            save.flush();
            save.close();
        } catch (FileNotFoundException e) {
            return false;
        } catch (IOException e) {
            return false;
        }

        mContext.sendBroadcast(new Intent(
                Intent.ACTION_MEDIA_SCANNER_SCAN_FILE, Uri.parse("file://"
                + PATH + filename)
        ));
        return true;
    }

    public static boolean compartir(Sound s, Context mContext) {
        save(s, mContext);
        Intent it = new Intent(Intent.ACTION_SEND);
        it.putExtra(
                Intent.EXTRA_STREAM,
                Uri.parse("file://" + PATH + normalizeString(s.getNombre())
                        + ".mp3")
        );
        it.setType("audio/mp3");
        mContext.startActivity(Intent.createChooser(it, "Compartir " + s));
        return true;
    }

}

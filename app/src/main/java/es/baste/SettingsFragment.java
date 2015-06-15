package es.baste;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import android.preference.PreferenceFragment;
import android.widget.Toast;

public class SettingsFragment extends PreferenceFragment {
    /**
     * Called when the activity is first created.
     */
    private SharedPreferences prefs;

    private boolean isUpdateNeeded = false;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
        prefs = MainActivity.prefs;

        Preference version = findPreference("version");
        if (version != null) {
            version.setSummary(getVersionName());
        }

        Preference correo = findPreference("correo");
        if (correo != null) {
            correo.setOnPreferenceClickListener(new OnPreferenceClickListener() {
                public boolean onPreferenceClick(Preference preference) {
                    Intent sendIntent = new Intent(Intent.ACTION_SEND);
                    String[] destino = {"bastewhite@gmail.com"};
                    sendIntent.putExtra(Intent.EXTRA_EMAIL, destino);
                    sendIntent.putExtra(Intent.EXTRA_SUBJECT, getResources()
                            .getString(R.string.app_name));
                    String versionName = getVersionName();
                    sendIntent.putExtra(Intent.EXTRA_TEXT, "\n\n"
                            + "API Level: " + Build.VERSION.SDK_INT
                            + "\nVersión aplicación: " + versionName
                            + "\nEnviado desde " + android.os.Build.MODEL);
                    sendIntent.setType("message/rfc822");
                    startActivity(Intent.createChooser(sendIntent, "Titulo:"));
                    return true;
                }

            });
        }

        Preference twitter = findPreference("twitter");
        if (twitter != null) {
            twitter.setOnPreferenceClickListener(new OnPreferenceClickListener() {
                public boolean onPreferenceClick(Preference preference) {
                    Intent iii = new Intent("android.intent.action.VIEW", Uri
                            .parse("http://twitter.com/#!/bastewhite"));
                    startActivity(iii);
                    return true;
                }

            });
        }

        Preference otros = findPreference("otros");
        if (otros != null) {
            otros.setOnPreferenceClickListener(new OnPreferenceClickListener() {
                public boolean onPreferenceClick(Preference preference) {
                    Intent i = new Intent("android.intent.action.VIEW", Uri
                            .parse("http://bastewhite.aptoide.com"));
                    startActivity(i);
                    return true;
                }

            });
        }

        Preference borrartodos = findPreference("borrartodos");
        if (borrartodos != null) {
            borrartodos.setOnPreferenceClickListener(new OnPreferenceClickListener() {
                        public boolean onPreferenceClick(Preference preference) {
                            borrarTODOS();
                            return true;
                        }

                    });
        }

        Preference nuevos = findPreference("nuevos");
        if (nuevos != null) {
            nuevos.setOnPreferenceClickListener(new OnPreferenceClickListener() {
                public boolean onPreferenceClick(Preference preference) {
                    if (prefs.getBoolean("nuevos", true)) {
                        Toast.makeText(getActivity(), "Sí",
                                Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getActivity(), "No",
                                Toast.LENGTH_SHORT).show();
                    }
                    isUpdateNeeded = true;
                    return true;
                }

            });
        }
    }

    public void borrarTODOS() {
        AlertDialog.Builder alt_bld = new AlertDialog.Builder(getActivity());
        alt_bld.setCancelable(false);
        alt_bld.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                Utils.getListaFavoritos().clear();
                isUpdateNeeded = true;
                SharedPreferences.Editor editor = prefs.edit();
                editor.remove("fav");
                editor.commit();
                Toast.makeText(getActivity(), "Lista vacía",
                        Toast.LENGTH_SHORT).show();
                dialog.cancel();
            }
        });
        alt_bld.setNegativeButton("Nooo",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                }
        );
        AlertDialog alert = alt_bld.create();
        alert.setTitle("¿Estás seguro?");
        alert.setMessage("Se borrara toda la lista de favoritos.");
        alert.show();
    }

    private String getVersionName() {
        try {
            PackageInfo pinfo = getActivity().getPackageManager().getPackageInfo(getActivity().getPackageName(), 0);
            return pinfo.versionName;
        } catch (NameNotFoundException e) {
            return "";
        }
    }

    public boolean isUpdateNeeded() {
        return isUpdateNeeded;
    }
}
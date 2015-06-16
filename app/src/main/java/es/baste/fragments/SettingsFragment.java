package es.baste.fragments;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import android.preference.PreferenceFragment;
import android.widget.Toast;

import es.baste.BuildConfig;
import es.baste.R;
import es.baste.Utils;
import es.baste.application.SharedPreferencesManager;

public class SettingsFragment extends PreferenceFragment {

    private boolean isUpdateNeeded = false;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);

        Preference version = findPreference("version");
        if (version != null) {
            version.setSummary(BuildConfig.VERSION_NAME);
        }

        Preference correo = findPreference("correo");
        if (correo != null) {
            correo.setOnPreferenceClickListener(new OnPreferenceClickListener() {
                public boolean onPreferenceClick(Preference preference) {
                    Intent sendIntent = new Intent(Intent.ACTION_SEND);
                    String[] destino = {getString(R.string.my_email)};
                    sendIntent.putExtra(Intent.EXTRA_EMAIL, destino);
                    sendIntent.putExtra(Intent.EXTRA_SUBJECT, getResources()
                            .getString(R.string.app_name));
                    sendIntent.putExtra(Intent.EXTRA_TEXT, getString(R.string.extra_email_text, Build.VERSION.SDK_INT, BuildConfig.VERSION_NAME, android.os.Build.MODEL));
                    sendIntent.setType("message/rfc822");
                    startActivity(Intent.createChooser(sendIntent, null));
                    return true;
                }

            });
        }

        Preference twitter = findPreference("twitter");
        if (twitter != null) {
            twitter.setOnPreferenceClickListener(new OnPreferenceClickListener() {
                public boolean onPreferenceClick(Preference preference) {
                    startActivity(new Intent("android.intent.action.VIEW", Uri.parse(getString(R.string.my_twitter_url))));
                    return true;
                }

            });
        }

        Preference otros = findPreference("otros");
        if (otros != null) {
            otros.setOnPreferenceClickListener(new OnPreferenceClickListener() {
                public boolean onPreferenceClick(Preference preference) {
                    startActivity(new Intent("android.intent.action.VIEW", Uri.parse(getString(R.string.my_others_url))));
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
                    if (SharedPreferencesManager.getInstance(getActivity()).isShowNews()) {
                        Toast.makeText(getActivity(), R.string.si, Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getActivity(), R.string.no, Toast.LENGTH_SHORT).show();
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
        alt_bld.setPositiveButton(R.string.ok,
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Utils.getListaFavoritos().clear();
                        isUpdateNeeded = true;
                        SharedPreferencesManager.getInstance(getActivity()).removeAllFavs();
                        Toast.makeText(getActivity(), R.string.empty_list, Toast.LENGTH_SHORT).show();
                        dialog.cancel();
                    }
                });
        alt_bld.setNegativeButton(R.string.nooo,
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                }
        );
        AlertDialog alert = alt_bld.create();
        alert.setTitle(R.string.delete_all_fav_title);
        alert.setMessage(getString(R.string.delete_all_fav));
        alert.show();
    }

    public boolean isUpdateNeeded() {
        return isUpdateNeeded;
    }
}
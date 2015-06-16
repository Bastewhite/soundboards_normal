package es.baste.application;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import es.baste.Sound;
import es.baste.Utils;

public class SharedPreferencesManager {

    private static volatile SharedPreferencesManager mPreferences;
    private static SharedPreferences mSharedPreferences;

    //KEYS
    private static final String KEY_FAV = "fav";
    private static final String KEY_NEWS = "nuevos";
    private static final String KEY_VERSION_CODE = "VersionCode";

    public static SharedPreferencesManager getInstance(Context context) {
        SharedPreferencesManager result = mPreferences;
        if (result == null) {
            synchronized (SharedPreferencesManager.class) {
                result = mPreferences;
                if (result == null) {
                    mPreferences = result = new SharedPreferencesManager(context);
                }
            }
        }
        return result;
    }

    private SharedPreferencesManager(Context context) {
        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public boolean haveFavSounds() {
        return !mSharedPreferences.getString(KEY_FAV, "").equals("");
    }

    public String[] getFavStrings() {
        return mSharedPreferences.getString(KEY_FAV, "").split("-");
    }

    public void removeAllFavs() {
        mSharedPreferences.edit().remove(KEY_FAV).commit();
    }

    public void addFav(String newFav) {
        String fav = mSharedPreferences.getString(KEY_FAV, "");
        mSharedPreferences.edit().putString(KEY_FAV, fav + "-" + newFav).commit();
    }

    public void reloadFavs() {
        String s = "";
        for (Sound sss : Utils.getListaFavoritos()) {
            s = s + "-" + sss.getNombre();
        }
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.remove(KEY_FAV);
        editor.putString(KEY_FAV, s);
        editor.commit();
    }

    public boolean isShowNews() {
        return mSharedPreferences.getBoolean(KEY_NEWS, true);
    }

    public void setShowNews(boolean isShowNews) {
        mSharedPreferences.edit().putBoolean(KEY_NEWS, isShowNews);
    }

    public void removeShowNews() {
        mSharedPreferences.edit().remove(KEY_NEWS).commit();
    }

    public int getVersionCode() {
        return mSharedPreferences.getInt(KEY_VERSION_CODE, 0);
    }

    public void setVersionCode(int versionCode) {
        mSharedPreferences.edit().putInt(KEY_VERSION_CODE, versionCode).commit();
    }
}

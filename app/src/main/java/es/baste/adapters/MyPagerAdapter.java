package es.baste.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import es.baste.BuildConfig;
import es.baste.fragments.InfoFragment;
import es.baste.fragments.SoundsListFragment;

public class MyPagerAdapter extends FragmentPagerAdapter {

    private String[] mTitles;
    private SoundsListFragment mAllSoundsFragment;
    private SoundsListFragment mFavSoundsFragment;
    private InfoFragment mInfoFragment;

    public MyPagerAdapter(FragmentManager fragmentManager, String[] titles) {
        super(fragmentManager);
        mTitles = titles;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles[position];
    }

    @Override
    public int getCount() {
        return BuildConfig.MY_PAGER_ADAPTER_COUNT;
    }

    private Fragment getAllSoundsFragment() {
        if (mAllSoundsFragment == null) {
            mAllSoundsFragment = SoundsListFragment.newInstance(SoundsListFragment.SoundsListFragmentType.ALL, null);
        }
        return mAllSoundsFragment;
    }

    private Fragment getFavSoundsFragment() {
        if (mFavSoundsFragment == null) {
            mFavSoundsFragment = SoundsListFragment.newInstance(SoundsListFragment.SoundsListFragmentType.FAV, null);
        }
        return mFavSoundsFragment;
    }

    private Fragment getInfoFragment() {
        if (mInfoFragment == null) {
            mInfoFragment = new InfoFragment();
        }
        return mInfoFragment;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return getAllSoundsFragment();
            case 1:
                return getFavSoundsFragment();
            case 2:
                return getInfoFragment();
            default:
                return null;
        }
    }
}

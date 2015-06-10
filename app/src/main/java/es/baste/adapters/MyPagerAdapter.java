package es.baste.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import es.baste.BuildConfig;
import es.baste.fragments.FavoritosFragment;
import es.baste.fragments.InfoFragment;
import es.baste.fragments.SoundsListFragment;

public class MyPagerAdapter extends FragmentPagerAdapter {

	private final String[] TITLES = { "TODOS", "FAVORITOS", "INFO" };
	private SoundsListFragment todosFragment;
	private FavoritosFragment favoritosFragment;
	private InfoFragment infoFragment;
	
	public MyPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public CharSequence getPageTitle(int position) {
		return TITLES[position];
	}

	@Override
	public int getCount() {
		return BuildConfig.MY_PAGER_ADAPTER_COUNT;
	}
	
	private Fragment getTodosFragment() {
		if (todosFragment == null) {
			todosFragment = new SoundsListFragment();
		}
		return todosFragment;
	}
	
	private Fragment getFavoritosFragment() {
		if (favoritosFragment == null) {
			favoritosFragment = new FavoritosFragment();
		}
		return favoritosFragment;
	}
	
	private Fragment getInfoFragment() {
		if (infoFragment == null)
			infoFragment = new InfoFragment();
		return infoFragment;
	}

	@Override
	public Fragment getItem(int position) {
		switch (position) {
		case 0:
			return getTodosFragment();
		case 1:
			return getFavoritosFragment();
		case 2:
			return getInfoFragment();
		default:
			return null;
		}
	}
	
//	public void update() {
//		if (todosFragment != null)
//			todosFragment.update();
//		if (favoritosFragment != null)
//			favoritosFragment.update();
//	}

}

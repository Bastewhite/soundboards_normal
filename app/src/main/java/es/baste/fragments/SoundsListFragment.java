package es.baste.fragments;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.squareup.otto.Subscribe;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import es.baste.DividerItemDecoration;
import es.baste.R;
import es.baste.Sound;
import es.baste.UtilesSonidos;
import es.baste.Utils;
import es.baste.adapters.MyRecyclerViewAdapter;
import es.baste.otto.BusProvider;
import es.baste.otto.events.UpdateEvent;

public class SoundsListFragment extends Fragment {

    private static final String KEY_BUNDLE_TYPE = "keyBundleType";
    private static final String KEY_BUNDLE_QUERY = "keyBundleQuery";

    @Bind(R.id.tvEmpty)
    protected TextView mTvEmpty;
    @Bind(R.id.recyclerview)
    protected RecyclerView mRecyclerView;

    private MyRecyclerViewAdapter mAdapter;
    private SoundsListFragmentType mType;

    public enum SoundsListFragmentType {
        ALL, FAV, SEARCH
    }

    public static SoundsListFragment newInstance(SoundsListFragmentType type, String query) {
        SoundsListFragment fragment = new SoundsListFragment();
        Bundle args = new Bundle();
        args.putSerializable(KEY_BUNDLE_TYPE, type);
        args.putString(KEY_BUNDLE_QUERY, query);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getActivity().setVolumeControlStream(AudioManager.STREAM_MUSIC);

        updateList();
    }

    private void updateList() {
        mType = (SoundsListFragmentType) getArguments().getSerializable(KEY_BUNDLE_TYPE);
        switch (mType) {
            case ALL:
                mAdapter = new MyRecyclerViewAdapter(getActivity(), UtilesSonidos.getListaTodos());
                break;
            case FAV:
                mAdapter = new MyRecyclerViewAdapter(getActivity(), Utils.getListaFavoritos());
                break;
            case SEARCH:
                String query = getArguments().getString(KEY_BUNDLE_QUERY);
                List<Sound> sounds = new ArrayList<>();
                for (Sound s : UtilesSonidos.getListaTodos()) {
                    if (Utils.normalizeString(s.getNombre()).contains(Utils.normalizeString(query)))
                        sounds.add(s);
                }
                mAdapter = new MyRecyclerViewAdapter(getActivity(), sounds);
                break;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        ButterKnife.bind(this, view);
        setupRecyclerView();
        return view;
    }

    private void setupRecyclerView() {
        if (getActivity().getResources().getBoolean(R.bool.isTablet) && mType == SoundsListFragmentType.ALL) {
            mRecyclerView.setLayoutManager(new GridLayoutManager(mRecyclerView.getContext(), 2));
//            mRecyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL_LIST));
//            mRecyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.HORIZONTAL_LIST));
        } else {
            mRecyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL_LIST));
            mRecyclerView.setLayoutManager(new LinearLayoutManager(mRecyclerView.getContext()));
        }
        mRecyclerView.setAdapter(mAdapter);

        switch (mType) {
            case FAV:
                mTvEmpty.setText(R.string.lista_fav_vacia);
                break;
            case SEARCH:
                mTvEmpty.setText(R.string.lista_vacia_search);
                break;
        }

        if (mAdapter.getItemCount() == 0) {
            mTvEmpty.setVisibility(View.VISIBLE);
        }
    }

    @Subscribe
    public void update(UpdateEvent event) {
        mTvEmpty.setVisibility(mAdapter.getItemCount() == 0 ? View.VISIBLE : View.GONE);
        mAdapter.notifyDataSetChanged();
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

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1000 && resultCode == Activity.RESULT_OK) {
            update(null);
        }
    }
}

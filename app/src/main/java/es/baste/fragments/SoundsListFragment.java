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

import com.squareup.otto.Subscribe;

import butterknife.ButterKnife;
import butterknife.InjectView;
import es.baste.DividerItemDecoration;
import es.baste.R;
import es.baste.UtilesSonidos;
import es.baste.adapters.MyRecyclerViewAdapter;
import es.baste.otto.BusProvider;
import es.baste.otto.events.UpdateEvent;

public class SoundsListFragment extends Fragment {

    @InjectView(R.id.recyclerview)
    RecyclerView mRecyclerView;

    private MyRecyclerViewAdapter mAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getActivity().setVolumeControlStream(AudioManager.STREAM_MUSIC);

        updateList();
    }

    private void updateList() {
        mAdapter = new MyRecyclerViewAdapter(getActivity(), UtilesSonidos.getListaTodos());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        ButterKnife.inject(this, view);
        setupRecyclerView();
        return view;
    }

    private void setupRecyclerView() {
        if (getActivity().getResources().getBoolean(R.bool.isTablet)) {
            mRecyclerView.setLayoutManager(new GridLayoutManager(mRecyclerView.getContext(), 2));
//            mRecyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL_LIST));
//            mRecyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.HORIZONTAL_LIST));
        }
        else {
            mRecyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL_LIST));
            mRecyclerView.setLayoutManager(new LinearLayoutManager(mRecyclerView.getContext()));
        }
        mRecyclerView.setAdapter(mAdapter);
    }

    @Subscribe
    public void update(UpdateEvent event) {
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
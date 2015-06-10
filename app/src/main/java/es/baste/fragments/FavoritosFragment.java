package es.baste.fragments;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.squareup.otto.Subscribe;

import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;
import es.baste.DividerItemDecoration;
import es.baste.R;
import es.baste.Sound;
import es.baste.Utils;
import es.baste.adapters.MyRecyclerViewAdapter;
import es.baste.otto.BusProvider;
import es.baste.otto.events.UpdateEvent;

public class FavoritosFragment extends Fragment {

    @InjectView(R.id.tvEmpty)
    TextView mTvEmpty;
    @InjectView(R.id.recyclerview)
    RecyclerView mRecyclerview;

    private MyRecyclerViewAdapter adapterfav;
	private List<Sound> aver;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_list_fav, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

		getActivity().setVolumeControlStream(AudioManager.STREAM_MUSIC);
        ButterKnife.inject(this, view);

		aver = Utils.getListaFavoritos();
        if (aver.isEmpty()) {
            mTvEmpty.setVisibility(View.VISIBLE);
        }

        mRecyclerview.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL_LIST));
        mRecyclerview.setLayoutManager(new LinearLayoutManager(mRecyclerview.getContext()));
		adapterfav = new MyRecyclerViewAdapter(getActivity(), aver);
        mRecyclerview.setAdapter(adapterfav);
	}


    @Subscribe
    public void update(UpdateEvent event) {
        mTvEmpty.setVisibility(aver.isEmpty() ? View.VISIBLE : View.GONE);
        adapterfav.notifyDataSetChanged();
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
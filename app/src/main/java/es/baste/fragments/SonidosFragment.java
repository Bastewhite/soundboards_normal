package es.baste.fragments;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;

import com.squareup.otto.Subscribe;

import es.baste.R;
import es.baste.Utiles;
import es.baste.UtilesSonidos;
import es.baste.adapters.MyListAdapter;
import es.baste.otto.BusProvider;
import es.baste.otto.events.UpdateEvent;

public class SonidosFragment extends Fragment implements AbsListView.OnItemClickListener,
        AbsListView.OnItemLongClickListener {

    /**
     * The Adapter which will be used to populate the ListView/GridView with
     * Views.
     */
    private MyListAdapter mAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getActivity().setVolumeControlStream(AudioManager.STREAM_MUSIC);

        updateList();
    }

    private void updateList() {
        mAdapter = new MyListAdapter(getActivity(), UtilesSonidos.getListaTodos());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Set the adapter
        // The fragment's ListView/GridView.
        AbsListView mListView = (AbsListView) view.findViewById(android.R.id.list);
        ((AdapterView<ListAdapter>) mListView).setAdapter(mAdapter);

        // Set OnItemClickListener so we can be notified on item clicks
        mListView.setOnItemClickListener(this);
        mListView.setOnItemLongClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        // Reproducir
        Utiles.reproducir(view.getContext(), mAdapter.getItem(position));
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
        Vibrator vv = (Vibrator) getActivity().getSystemService(Context.VIBRATOR_SERVICE);
        vv.vibrate(25);
        Utiles.subMenu(mAdapter.getItem(i), getActivity());
        return false;
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

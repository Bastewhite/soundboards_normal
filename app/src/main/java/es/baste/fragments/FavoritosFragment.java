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
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;

import com.squareup.otto.Subscribe;

import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;
import es.baste.R;
import es.baste.Sonido;
import es.baste.Utiles;
import es.baste.adapters.MyListAdapter;
import es.baste.otto.BusProvider;
import es.baste.otto.events.UpdateEvent;

public class FavoritosFragment extends Fragment {

    @InjectView(R.id.tvEmpty)
    TextView mTvEmpty;
    @InjectView(R.id.ListView)
    ListView lv;

    private MyListAdapter adapterfav;
	private List<Sonido> aver;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main_fav, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

		getActivity().setVolumeControlStream(AudioManager.STREAM_MUSIC);
        ButterKnife.inject(this, view);

		aver = Utiles.getListaFavoritos();
        if (aver.isEmpty()) {
            mTvEmpty.setVisibility(View.VISIBLE);
        }


		adapterfav = new MyListAdapter(getActivity(), aver);
		lv.setAdapter(adapterfav);

		lv.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Utiles.reproducir(view.getContext(), aver.get(position));
			}
		});

		lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
			public boolean onItemLongClick(AdapterView<?> av, View v, int pos,
					long id) {
				Vibrator vv = (Vibrator) getActivity().getSystemService(Context.VIBRATOR_SERVICE);
				vv.vibrate(25);
				Utiles.subMenu(aver.get(pos), av.getContext());
				return false;
			}
		});

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
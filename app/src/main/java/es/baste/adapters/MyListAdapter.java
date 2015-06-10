package es.baste.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

import es.baste.Sonido;
import es.baste.views.SoundItemController;

public class MyListAdapter extends BaseAdapter {
	private Context context;
	private List<Sonido> sonidos;

	public MyListAdapter(Context context, List<Sonido> listPhonebook) {
		this.context = context;
		this.sonidos = listPhonebook;
	}

	public int getCount() {
		return sonidos.size();
	}

	public Sonido getItem(int position) {
		return sonidos.get(position);
	}

	public long getItemId(int position) {
		return position;
	}

	public View getView(final int position, View convertView,
			ViewGroup viewGroup) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(
                    SoundItemController.getLayoutResource(), viewGroup, false);
        }

//        SonidoItemController.get(convertView).configure(getItem(position));

        return convertView;
	}

    public void updateList(List<Sonido> sonidos) {
        this.sonidos.clear();
        this.sonidos.addAll(sonidos);
        notifyDataSetChanged();
    }

}

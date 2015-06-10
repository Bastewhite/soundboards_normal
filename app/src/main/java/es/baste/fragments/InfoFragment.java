package es.baste.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import es.baste.R;
import es.baste.UtilesSonidos;
import es.baste.Utils;

public class InfoFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_info, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView textview = (TextView) view.findViewById(R.id.helpWelcome);
        textview.setText(getString(R.string.info_text, getString(R.string.app_name), UtilesSonidos.getListaTodos().size(), Utils.nombre, Utils.nombre));
    }
}

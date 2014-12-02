package es.baste;

import android.annotation.SuppressLint;
import android.app.SearchManager;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import es.baste.adapters.MyListAdapter;
import es.baste.application.MyApplication;

public class SearchableActivity extends ActionBarActivity {

    @Override
    protected void onStart() {
        super.onStart();
        // Send a screen view.
        ((MyApplication) getApplication()).setTrackerScreenName(this.getClass().getName());
    }

    @SuppressLint("NewApi")
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_search);

        String query = getIntent().getStringExtra(SearchManager.QUERY);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setSubtitle("Resultados de la búsqueda: " + query);

        setVolumeControlStream(AudioManager.STREAM_MUSIC);
        final List<Sonido> l = new ArrayList<Sonido>();

        // Get the intent, verify the action and get the query
        if (Intent.ACTION_SEARCH.equals(getIntent().getAction())) {
            // doMySearch(query);
            for (Sonido s : UtilesSonidos.getListaTodos()) {
                if (limpiarString(s.getNombre()).contains(limpiarString(query)))
                    l.add(s);
            }
        }

        ListView lv = (ListView) findViewById(R.id.ListView);
        lv.setAdapter(new MyListAdapter(this, l));
        lv.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                    long arg3) {
                Utiles.reproducir(arg1.getContext(), l.get(arg2));
            }
        });

        if (l.isEmpty()) {
            TextView tvListaVacia = (TextView) findViewById(R.id.tvListaVacia);
            tvListaVacia.setVisibility(View.VISIBLE);
        }
    }

    public String limpiarString(String input) {
        // Cadena de caracteres original a sustituir.
        String original = "áéíóúÁÉÍÓÚABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // Cadena de caracteres ASCII que reemplazarán los originales.
        String ascii = "aeiouaeiouabcdefghijklmnopqrstuvwxyz";
        String output = input;
        for (int i = 0; i < original.length(); i++) {
            // Reemplazamos los caracteres especiales.
            output = output.replace(original.charAt(i), ascii.charAt(i));
        }// for i
        return output;
    }

    public boolean onSearchRequested() {
        return false;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
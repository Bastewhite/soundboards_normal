package es.baste;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import es.baste.application.MyApplication;
import es.baste.fragments.SoundsListFragment;

public class SearchableActivity extends AppCompatActivity {

    @Override
    protected void onStart() {
        super.onStart();
        // Send a screen view.
        ((MyApplication) getApplication()).setTrackerScreenName(this.getClass().getName());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String query = getIntent().getStringExtra(SearchManager.QUERY);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setSubtitle("Resultados de la búsqueda: " + query);

        // Get the intent, verify the action and get the query
        if (Intent.ACTION_SEARCH.equals(getIntent().getAction())) {
            getSupportFragmentManager().beginTransaction().replace(android.R.id.content, SoundsListFragment.newInstance(SoundsListFragment.SoundsListFragmentType.SEARCH, query)).commit();
        }
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
package es.baste;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import es.baste.application.MyApplication;

public class SettingsActivity extends AppCompatActivity {

    private SettingsFragment mSettingsFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setSubtitle(R.string.action_settings);
        }
        else {
            setTitle(getString(R.string.app_name) + ": " + getString(R.string.action_settings));
        }

        mSettingsFragment = new SettingsFragment();
        getFragmentManager().beginTransaction().replace(android.R.id.content, mSettingsFragment).commit();
    }

    @Override
    public void onBackPressed() {
        if (mSettingsFragment.isUpdateNeeded()) {
            setResult(RESULT_OK);
        }
        super.onBackPressed();
    }

    @Override
    protected void onStart() {
        super.onStart();

        // Send a screen view.
        ((MyApplication) getApplication()).setTrackerScreenName(this.getClass().getName());
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
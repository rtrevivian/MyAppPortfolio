package com.richardtrevivian.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onPopularMoviesButtonClicked(View view) {
        toast(R.string.popular_movies);
    }

    public void onStockHawkButtonClicked(View view) {
        toast(R.string.capstone);
    }

    public void onBuildItBiggerButtonClicked(View view) {
        toast(R.string.build_it_bigger);
    }

    public void onMakeYourAppMaterialButtonClicked(View view) {
        toast(R.string.make_your_app_material);
    }

    public void onGoUbiquitousButtonClicked(View view) {
        toast(R.string.go_ubiquitous);
    }

    public void onCapstoneButtonClicked(View view) {
        toast(R.string.capstone);
    }

    private void toast(int id) {
        CharSequence text = String.format(getString(R.string.coming_soon), getString(id));
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(getApplicationContext(), text, duration);
        toast.show();
    }

    /*
    private void showSnackbar(View view, String string) {
        String comingSoon = string + " " + getString(R.string.coming_soon);
        Snackbar.make(view, comingSoon, Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }
    */

}

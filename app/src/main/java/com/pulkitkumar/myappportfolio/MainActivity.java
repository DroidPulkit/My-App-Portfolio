package com.pulkitkumar.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "pulkitkumar190@gmail.com", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
            //return true;
            Toast.makeText(getApplicationContext(), "Settings feature will be enabled shortly", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }

    /** Called when the user touches the button */
    public void sendMessage1(View view) {

        // Do something in response to button click
        Toast.makeText(getApplicationContext(), "This button will launch Spotify Streamer", Toast.LENGTH_SHORT).show();

    }
    public void sendMessage2(View view) {

        // Do something in response to button click
        Toast.makeText(getApplicationContext(), "This button will launch Scores App", Toast.LENGTH_SHORT).show();

    }
    public void sendMessage3(View view) {

        // Do something in response to button click
        Toast.makeText(getApplicationContext(), "This button will launch Library App", Toast.LENGTH_SHORT).show();

    }
    public void sendMessage4(View view) {

        // Do something in response to button click
        Toast.makeText(getApplicationContext(), "This button will launch Buid It Bigger App", Toast.LENGTH_SHORT).show();

    }
    public void sendMessage5(View view) {

        // Do something in response to button click
        Toast.makeText(getApplicationContext(), "This button will launch XYZ Reader App", Toast.LENGTH_SHORT).show();

    }
    public void sendMessage6(View view) {

        // Do something in response to button click
        Toast.makeText(getApplicationContext(), "This button will launch my Capstone App", Toast.LENGTH_SHORT).show();

    }
}


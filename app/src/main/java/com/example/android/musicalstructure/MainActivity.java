package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Find the View that shows each category
        Button discover = (Button) findViewById(R.id.discover_text_view);
        Button playlist = (Button) findViewById(R.id.playlist_text_view);
        Button radio = (Button) findViewById(R.id.radio_text_view);

        if (discover != null) {
            // Set a click listener on that View
            discover.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@Link NumbersActivity}
                    Intent discoverIntent = new Intent(MainActivity.this, Discover.class);
                    // Start the new activity
                    startActivity(discoverIntent);
                }
            });
        }

        if (playlist != null) {
            // Set a click listener on that View
            playlist.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@Link NumbersActivity}
                    Intent playlistIntent = new Intent(MainActivity.this, Playlist.class);
                    // Start the new activity
                    startActivity(playlistIntent);
                }
            });
        }

        if (radio != null) {
            // Set a click listener on that View
            radio.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@Link NumbersActivity}
                    Intent radioIntent = new Intent(MainActivity.this, Radio.class);
                    // Start the new activity
                    startActivity(radioIntent);
                }
            });
        }

    }
}

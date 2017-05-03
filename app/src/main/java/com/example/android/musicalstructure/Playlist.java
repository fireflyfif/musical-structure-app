package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Playlist extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        // Find the View that shows each category
        TextView playlist1 = (TextView) findViewById(R.id.playlist_1);
        TextView playlist2 = (TextView) findViewById(R.id.playlist_2);
        TextView playlist3 = (TextView) findViewById(R.id.playlist_3);
        TextView playlist4 = (TextView) findViewById(R.id.playlist_4);

        if (playlist1 != null) {
            // Set a click listener on that View
            playlist1.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@Link NumbersActivity}
                    Intent playlistIntent = new Intent(Playlist.this, NowPlaying.class);
                    // Start the new activity
                    startActivity(playlistIntent);
                }
            });
        }

        if (playlist2 != null) {
            // Set a click listener on that View
            playlist2.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@Link NumbersActivity}
                    Intent playlistIntent = new Intent(Playlist.this, NowPlaying.class);
                    // Start the new activity
                    startActivity(playlistIntent);
                }
            });
        }

        if (playlist3 != null) {
            // Set a click listener on that View
            playlist3.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@Link NumbersActivity}
                    Intent playlistIntent = new Intent(Playlist.this, NowPlaying.class);
                    // Start the new activity
                    startActivity(playlistIntent);
                }
            });
        }

        if (playlist4 != null) {
            // Set a click listener on that View
            playlist4.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@Link NumbersActivity}
                    Intent playlistIntent = new Intent(Playlist.this, NowPlaying.class);
                    // Start the new activity
                    startActivity(playlistIntent);
                }
            });
        }

    }
}

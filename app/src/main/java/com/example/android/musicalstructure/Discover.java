package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class Discover extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discover);


        // Find the View that shows each category
        ImageView albumMusic1 = (ImageView) findViewById(R.id.album_1);
        ImageView albumMusic2 = (ImageView) findViewById(R.id.album_2);
        ImageView albumMusic3 = (ImageView) findViewById(R.id.album_3);
        ImageView albumMusic4 = (ImageView) findViewById(R.id.album_4);
        ImageView albumMusic5 = (ImageView) findViewById(R.id.album_5);
        ImageView albumMusic6 = (ImageView) findViewById(R.id.album_6);

        if (albumMusic1 != null) {
            // Set a click listener on that View
            albumMusic1.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@Link NumbersActivity}
                    Intent popIntent = new Intent(Discover.this, NowPlaying.class);
                    // Start the new activity
                    startActivity(popIntent);
                }
            });
        }

        if (albumMusic2 != null) {
            // Set a click listener on that View
            albumMusic2.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@Link NumbersActivity}
                    Intent popIntent = new Intent(Discover.this, NowPlaying.class);
                    // Start the new activity
                    startActivity(popIntent);
                }
            });
        }

        if (albumMusic3 != null) {
            // Set a click listener on that View
            albumMusic3.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@Link NumbersActivity}
                    Intent rockIntent = new Intent(Discover.this, NowPlaying.class);
                    // Start the new activity
                    startActivity(rockIntent);
                }
            });
        }

        if (albumMusic4 != null) {
            // Set a click listener on that View
            albumMusic4.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@Link NumbersActivity}
                    Intent rockIntent = new Intent(Discover.this, NowPlaying.class);
                    // Start the new activity
                    startActivity(rockIntent);
                }
            });
        }

        if (albumMusic5 != null) {
            // Set a click listener on that View
            albumMusic5.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@Link NumbersActivity}
                    Intent chillIntent = new Intent(Discover.this, NowPlaying.class);
                    // Start the new activity
                    startActivity(chillIntent);
                }
            });
        }

        if (albumMusic6 != null) {
            // Set a click listener on that View
            albumMusic6.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@Link NumbersActivity}
                    Intent chillIntent = new Intent(Discover.this, NowPlaying.class);
                    // Start the new activity
                    startActivity(chillIntent);
                }
            });
        }


    }


}

package com.example.android.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        // Create a list of songs
        ArrayList<String> songs = new ArrayList<>();
        songs.add("Artist Name \nSong Name");
        songs.add("Artist Name \nSong Name");
        songs.add("Artist Name \nSong Name");
        songs.add("Artist Name \nSong Name");
        songs.add("Artist Name \nSong Name");
        songs.add("Artist Name \nSong Name");
        songs.add("Artist Name \nSong Name");
        songs.add("Artist Name \nSong Name");


        ArrayAdapter<String> songsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, songs);

        ListView songList = (ListView) findViewById(R.id.songs_list);

        songList.setAdapter(songsAdapter);


    }
}

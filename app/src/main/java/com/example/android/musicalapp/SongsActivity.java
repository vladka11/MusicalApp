package com.example.android.musicalapp;

import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.os.Bundle;
import java.util.ArrayList;
/**
 * Created by vladislavakopalova on 5.4.18.
 */

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.song_list);

    ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Next To Me", "Imagine Dragons"));
        songs.add(new Song("Lonely Boy", "The Black Keys"));
        songs.add(new Song("Intro ", "The XX"));
        songs.add(new Song("Agape", "Bears Den"));
        songs.add(new Song("Zombie", "Bad Wolves"));
        songs.add(new Song("Look Like You Know", "Royal Blood"));
        songs.add(new Song("Simple Pleasure", "Jake Bugg"));
        songs.add(new Song("Taro", "alt-J"));

       SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
}
}

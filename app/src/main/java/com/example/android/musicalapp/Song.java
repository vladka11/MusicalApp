package com.example.android.musicalapp;

/**
 * Created by vladislavakopalova on 5.4.18.
 */

public class Song {
    private String songName;
    private String songAuthor;

    public Song(String name, String author){
        songName=name;
        songAuthor=author;
    }

    public String getName(){return songName;}
    public String getAuthor(){return songAuthor;}

}

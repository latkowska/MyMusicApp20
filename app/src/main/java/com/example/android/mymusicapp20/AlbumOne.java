package com.example.android.mymusicapp20;

public class AlbumOne {

    //Song title
    private String tTitle;

    //Track number
    private String tTrack;

    /**
     * Create a new AlbumOne object.
     */
    public AlbumOne(String title, String track) {
        tTitle = title;
        tTrack = track;
    }

    //Get the title of the song
    public String getTitle() {
        return tTitle;
    }

    //Get the track number of the song.
    public String getTrack() {
        return tTrack;
    }
}
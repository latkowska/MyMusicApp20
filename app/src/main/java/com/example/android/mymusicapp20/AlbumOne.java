package com.example.android.mymusicapp20;

public class AlbumOne {

    //Song title
    private String tTitle;

    //Track number
    private String tTrack;

    /**
     * Create a new AlbumOne object.
     *
     * @param title is title of the song
     * @param track is the number of song in album
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


package com.example.android.mymusicapp20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumOneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_one);

        //ArrayList of songs at album one - Nina Simone "I put a Spell on you"

        ArrayList<AlbumOne> songs = new ArrayList<AlbumOne>();
        songs.add(new AlbumOne("I Put a Spell on You", "track 1"));
        songs.add(new AlbumOne("Tomorrow Is My Turn", "track 2"));
        songs.add(new AlbumOne("Ne me quitte pas", "track 3"));
        songs.add(new AlbumOne("Marriage Is for Old Folks", "track 4"));
        songs.add(new AlbumOne("July Tree", "track 5"));
        songs.add(new AlbumOne("Gimme Some", "track 6"));
        songs.add(new AlbumOne("Feeling Good", "track 7"));
        songs.add(new AlbumOne("One September Day", "track 8"));
        songs.add(new AlbumOne("Blues on Purpose", "track 9"));
        songs.add(new AlbumOne("Beautiful Land", "track 10"));
        songs.add(new AlbumOne("You've Got to Learn", "track 11"));
        songs.add(new AlbumOne("Take Care of Business", "track 12"));


        //Create an adapter
        AlbumOneAdapter adapter = new AlbumOneAdapter(this, songs);

        //Finding list view in xmlfile
        ListView listView = (ListView) findViewById(R.id.listao);

        //setting adapter on the list
        listView.setAdapter(adapter);

        //setting onClickListener on items of ArrayList <AlbumOne>
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent nowPlaying = new Intent(getBaseContext(), NowPlayingActivity.class);
                startActivity(nowPlaying);
            }
        });

        // Find the View "back to main menu" in now playing
        Button backToMainFromAlbum = (Button) findViewById(R.id.backToMainFromAlbum);

        // Set a click listener on that View
        backToMainFromAlbum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backToMainFromAlbumIntent = new Intent(AlbumOneActivity.this, MainActivity.class);
                startActivity(backToMainFromAlbumIntent);
            }
        });
    }
}



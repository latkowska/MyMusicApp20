package com.example.android.mymusicapp20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the Nina Simone "I put a spell on you" album
        TextView nsAlbum = (TextView) findViewById(R.id.NS_textView);

        // Set a click listener on that View
        nsAlbum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nsAlbumIntent = new Intent(MainActivity.this, AlbumOneActivity.class);
                startActivity(nsAlbumIntent);
            }
        });

        // Find the View that shows the Nina Simone "I put a spel on you" album
        ImageButton nsAlbumPlay = (ImageButton) findViewById(R.id.NS_imageView);

        // Set a click listener on that View
        nsAlbumPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nsAlbumPlayIntent = new Intent(MainActivity.this, AlbumOneActivity.class);
                startActivity(nsAlbumPlayIntent);
            }
        });

        // Find the View "Skip to now playing...
        Button skipButtonNP = (Button) findViewById(R.id.skip_button);

        // Set a click listener on that View
        skipButtonNP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent skipButtonNPIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(skipButtonNPIntent);
            }
        });
    }
}

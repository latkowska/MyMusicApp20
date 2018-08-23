package com.example.android.mymusicapp20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        // Find the View "back to main menu" in now playing
        Button backToMain = (Button) findViewById(R.id.backToMain);

        // Set a click listener on that View
        backToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backToMainIntent = new Intent(NowPlayingActivity.this, MainActivity.class);
                startActivity(backToMainIntent);
            }
        });

        // Find the View "back to album" in now playing
        Button backToAlbum = (Button) findViewById(R.id.backToAlbum);

        // Set a click listener on that View
        backToAlbum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backToMainIntent = new Intent(NowPlayingActivity.this, AlbumOneActivity.class);
                startActivity(backToMainIntent);
            }
        });
    }
}

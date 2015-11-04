package com.example.yura.youtubedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
    }

    public void onClick(View v) {
//        Toast.makeText(this, "Clicked", LENGTH_SHORT).show();
        Intent i = new Intent(MusicActivity.this, SideMenActivity.class);
        startActivity(i);
    }
}

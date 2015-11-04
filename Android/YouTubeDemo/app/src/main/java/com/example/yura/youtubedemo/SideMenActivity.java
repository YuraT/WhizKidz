package com.example.yura.youtubedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SideMenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_side_men);
    }

    public void onClick(View v) {
//        Toast.makeText(this, "Clicked", LENGTH_SHORT).show();
        Intent i = new Intent(SideMenActivity.this, MyHomeActivity.class);
        startActivity(i);
    }
}

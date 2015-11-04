package com.example.yura.youtubedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginTwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_two);
    }

    public void onClick(View v) {
//        Toast.makeText(this, "Clicked", LENGTH_SHORT).show();
        Intent i = new Intent(LoginTwoActivity.this, LoginThreeActivity.class);
        startActivity(i);
    }
}

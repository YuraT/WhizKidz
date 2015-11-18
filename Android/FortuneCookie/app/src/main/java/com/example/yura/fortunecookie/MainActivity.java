package com.example.yura.fortunecookie;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView tvMsg;
    RelativeLayout llLayout;


    List<String> fortuneCookieList;
    List<String> fortuneColorList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMsg = (TextView) findViewById(R.id.tvMsg);
        llLayout = (RelativeLayout) findViewById(R.id.llLayout);

        fortuneCookieList = new ArrayList<String>();
        fortuneCookieList.add("Today it's up to you to create the peacefulness you long for.");
        fortuneCookieList.add("A friend asks only for your time not your money.");
        fortuneCookieList.add("A good way to keep healthy is to eat more Chinese food.");
        fortuneCookieList.add("Your high-minded principles spell success.");
        fortuneCookieList.add("People are naturally attracted to you.");
        fortuneCookieList.add("Enjoy the good luck a companion brings you.");
        fortuneCookieList.add("Change can hurt, but it leads a path to something better.");
        fortuneCookieList.add("A chance meeting opens new doors to success and friendship.");

        fortuneColorList = new ArrayList<String>();
        fortuneColorList.add("#DEF2C8");
        fortuneColorList.add("#C5DAC1");
        fortuneColorList.add("#BCD0C7");
        fortuneColorList.add("#A9B2AC");
        fortuneColorList.add("#898980");
    }

    public void onChange(View v) {
        Random randomNumberGenerator = new Random();
        int randomFact = randomNumberGenerator.nextInt(8);

        tvMsg.setText(fortuneCookieList.get(randomFact));

        Random randomColorGenerator = new Random();
        int randomColor = randomColorGenerator.nextInt(5);

        llLayout.setBackgroundColor(Color.parseColor(fortuneColorList.get(randomColor)));

    }
}
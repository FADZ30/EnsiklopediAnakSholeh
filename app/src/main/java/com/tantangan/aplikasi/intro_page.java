package com.tantangan.aplikasi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class intro_page extends AppCompatActivity {

    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_page);

        viewPager = findViewById(R.id.viewPager);

        IntroAdpter adapter = new IntroAdpter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
    }
}
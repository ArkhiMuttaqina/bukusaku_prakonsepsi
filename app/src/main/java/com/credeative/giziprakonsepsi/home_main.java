package com.credeative.giziprakonsepsi;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class home_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_main);
        getSupportActionBar().hide();
    }
}
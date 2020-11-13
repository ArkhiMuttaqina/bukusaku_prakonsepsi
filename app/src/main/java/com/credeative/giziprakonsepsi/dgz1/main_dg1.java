package com.credeative.giziprakonsepsi.dgz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.credeative.giziprakonsepsi.R;
import com.credeative.giziprakonsepsi.home_main;
import com.credeative.giziprakonsepsi.kzgp1.main_kzgp1;

public class main_dg1 extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dg1);
        getSupportActionBar().hide();
        ImageButton kembali = findViewById(R.id.kembali);
        TextView link1 = findViewById(R.id.link1);
        TextView link2 = findViewById(R.id.link2);
        link1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(main_dg1.this, main_kzgp1.class);
                startActivity(myIntent);
                main_dg1.this.finish();
            }
        });
        link2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(main_dg1.this, home_main.class);
                startActivity(myIntent);
                main_dg1.this.finish();
            }
        });

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
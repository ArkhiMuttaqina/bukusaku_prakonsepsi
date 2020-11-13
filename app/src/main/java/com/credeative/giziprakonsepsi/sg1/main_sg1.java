package com.credeative.giziprakonsepsi.sg1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.credeative.giziprakonsepsi.R;
import com.credeative.giziprakonsepsi.hitung_gizi;
import com.credeative.giziprakonsepsi.home_main;
import com.credeative.giziprakonsepsi.kzgp1.main_kzgp1;
import com.credeative.giziprakonsepsi.mg1.main_mg1;

public class main_sg1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_sg1);
        getSupportActionBar().hide();
        ImageButton kembali = findViewById(R.id.kembali);
        Button Faktor_Gizi = findViewById(R.id.Faktor_Gizi);
        Button go_to_mslhgz = findViewById(R.id.go_to_mslhgz);

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        Faktor_Gizi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(main_sg1.this, sg1_faktor.class);
                startActivity(goToX);
                main_sg1.this.onPause();            }
        });
        go_to_mslhgz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(main_sg1.this, main_mg1.class);
                startActivity(goToX);
                main_sg1.this.onPause();            }
        });

        TextView link1 = findViewById(R.id.link1);
        TextView link2 = findViewById(R.id.link2);
        link1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(main_sg1.this, main_mg1.class);
                startActivity(myIntent);
                main_sg1.this.finish();
            }
        });
        link2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(main_sg1.this, hitung_gizi.class);
                startActivity(myIntent);
                main_sg1.this.finish();
            }
        });

    }
    }

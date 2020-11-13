package com.credeative.giziprakonsepsi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.credeative.giziprakonsepsi.dgz1.main_dg1;
import com.credeative.giziprakonsepsi.gp1.main_gp1;
import com.credeative.giziprakonsepsi.kzgp1.main_kzgp1;
import com.credeative.giziprakonsepsi.mg1.main_mg1;
import com.credeative.giziprakonsepsi.sg1.main_sg1;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class home_main extends AppCompatActivity {
    public ImageButton btn_giziprakon,
            btn_statusgizi, btn_maslahgizi, btn_kebuthgizi, btn_dietgizi, tentang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_main);
        getSupportActionBar().hide();
        initaja();
    }

    public void initaja() {
    btn_giziprakon = findViewById(R.id.gizi_ps);
    btn_maslahgizi = findViewById(R.id.masalah_gizi);
    btn_statusgizi = findViewById(R.id.status_giz);
    btn_kebuthgizi = findViewById(R.id.kebutuhan_gizi);
    btn_dietgizi = findViewById(R.id.diet_g);
        tentang = findViewById(R.id.tentang);

        btn_dietgizi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(home_main.this, main_dg1.class);
                startActivity(goToX);
                home_main.this.onPause();
            }
        });
        btn_kebuthgizi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(home_main.this, main_kzgp1.class);
                startActivity(goToX);
                home_main.this.onPause();
            }
        });
        btn_maslahgizi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(home_main.this, main_mg1.class);
                startActivity(goToX);
                home_main.this.onPause();
            }
        });
        btn_giziprakon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(home_main.this, main_gp1.class);
                startActivity(goToX);
                home_main.this.onPause();
            }
        });

        btn_statusgizi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(home_main.this, main_sg1.class);
                startActivity(goToX);
                home_main.this.onPause();
            }
        });
        tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(home_main.this, tentang_aplikasi.class);
                startActivity(goToX);
                home_main.this.onPause();
            }
        });

        FloatingActionButton floatingActionButton=findViewById(R.id.fab1);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToX = new Intent(home_main.this, hitung_gizi.class);
                startActivity(goToX);
                home_main.this.onPause();
            }
        });
    }
    }



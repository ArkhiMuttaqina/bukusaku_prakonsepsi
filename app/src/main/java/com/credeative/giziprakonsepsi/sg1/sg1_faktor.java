package com.credeative.giziprakonsepsi.sg1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.credeative.giziprakonsepsi.R;
import com.credeative.giziprakonsepsi.dgz1.main_dg1;
import com.credeative.giziprakonsepsi.hitung_gizi;
import com.credeative.giziprakonsepsi.kzgp1.main_kzgp1;
import com.credeative.giziprakonsepsi.mg1.main_mg1;

public class sg1_faktor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sg1_faktor);
        getSupportActionBar().hide();
        ImageButton kembali = findViewById(R.id.kembali);
        Button go_to_mslhgza = findViewById(R.id.go_to_mslhgza);

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        go_to_mslhgza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(sg1_faktor.this, main_mg1.class);
                startActivity(goToX);
                sg1_faktor.this.onPause();
            }
        });
        TextView link1 = findViewById(R.id.link1);
        TextView link2 = findViewById(R.id.link2);
        link1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(sg1_faktor.this, main_dg1.class);
                startActivity(myIntent);
                sg1_faktor.this.finish();
            }
        });
        link2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(sg1_faktor.this, main_mg1.class);
                startActivity(myIntent);
                sg1_faktor.this.finish();
            }
        });
    }
    }

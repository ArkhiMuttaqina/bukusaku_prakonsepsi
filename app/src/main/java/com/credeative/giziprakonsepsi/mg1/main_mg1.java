package com.credeative.giziprakonsepsi.mg1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.credeative.giziprakonsepsi.R;
import com.credeative.giziprakonsepsi.gp1.main_gp1;
import com.credeative.giziprakonsepsi.hitung_gizi;
import com.credeative.giziprakonsepsi.home_main;
import com.credeative.giziprakonsepsi.kzgp1.main_kzgp1;
import com.credeative.giziprakonsepsi.sg1.main_sg1;

public class main_mg1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_mg1);
        getSupportActionBar().hide();

        ImageButton kembali = findViewById(R.id.kembali);
        Button goto_kebuthgizi = findViewById(R.id.goto_kebuthgizi);

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        goto_kebuthgizi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(main_mg1.this, main_kzgp1.class);
                startActivity(goToX);
                main_mg1.this.onPause();
            }
        });

        TextView link1 = findViewById(R.id.link1);
        TextView link2 = findViewById(R.id.link2);
        link1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(main_mg1.this, main_sg1.class);
                startActivity(myIntent);
                main_mg1.this.finish();
            }
        });
        link2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(main_mg1.this, main_gp1.class);
                startActivity(myIntent);
                main_mg1.this.finish();
            }
        });
    }
}
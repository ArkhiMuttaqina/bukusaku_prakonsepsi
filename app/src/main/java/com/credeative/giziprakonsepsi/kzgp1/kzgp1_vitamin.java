package com.credeative.giziprakonsepsi.kzgp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.credeative.giziprakonsepsi.R;
import com.credeative.giziprakonsepsi.dgz1.main_dg1;

public class kzgp1_vitamin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kzgp1_vitamin);
        getSupportActionBar().hide();
        ImageButton kembali = findViewById(R.id.kembali);
        Button go_to_digizi = findViewById(R.id.go_to_digizi);

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        go_to_digizi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(kzgp1_vitamin.this, main_dg1.class);
                startActivity(goToX);
                kzgp1_vitamin.this.onPause();
            }
        });

    }
}
package com.credeative.giziprakonsepsi.gp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.credeative.giziprakonsepsi.R;
import com.credeative.giziprakonsepsi.home_main;
import com.credeative.giziprakonsepsi.mg1.main_mg1;
import com.credeative.giziprakonsepsi.sg1.main_sg1;

public class main_gp1 extends AppCompatActivity {

    ImageButton kembali;
    Button go_to_statussgizi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_gp1);
        getSupportActionBar().hide();

        kembali = findViewById(R.id.kembali);
        go_to_statussgizi = findViewById(R.id.go_to_statussgizi);

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              finish();
            }
        });
        go_to_statussgizi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(main_gp1.this, main_sg1.class);
                startActivity(goToX);
                main_gp1.this.onPause();
            }
        });


    }
}
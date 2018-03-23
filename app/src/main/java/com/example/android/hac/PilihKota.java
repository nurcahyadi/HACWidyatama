package com.example.android.hac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class PilihKota extends AppCompatActivity {

    ImageButton mButtonJakarta;
    ImageButton mButtonBandung;
    ImageButton mButtonSurabaya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih_kota);

        mButtonJakarta = findViewById(R.id.button_jakarta);
        mButtonBandung = findViewById(R.id.button_bandung);
        mButtonSurabaya = findViewById(R.id.button_surabaya);


        mButtonJakarta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahkemenuUtama1 = new Intent(PilihKota.this,NavigationDrawerJakarta.class);
                startActivity(pindahkemenuUtama1);
            }
        });
        mButtonBandung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahkemenuUtama2 = new Intent(PilihKota.this,NavigationDrawerBandung.class);
                startActivity(pindahkemenuUtama2);
            }
        });
        mButtonSurabaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahkemenuUtama3 = new Intent(PilihKota.this,NavigationDrawerSurabaya.class);
                startActivity(pindahkemenuUtama3);
            }
        });
    }
}

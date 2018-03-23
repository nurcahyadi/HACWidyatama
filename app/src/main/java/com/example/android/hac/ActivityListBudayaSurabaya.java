package com.example.android.hac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.android.hac.Bandung.ListviewBajudaerahBandung;
import com.example.android.hac.Bandung.ListviewBatikBandung;
import com.example.android.hac.Bandung.ListviewMakananBandung;
import com.example.android.hac.Bandung.ListviewTarianBandung;
import com.example.android.hac.Surabaya.ListviewBajudaerahSurabaya;
import com.example.android.hac.Surabaya.ListviewBatikSurabaya;
import com.example.android.hac.Surabaya.ListviewMakananSurabaya;
import com.example.android.hac.Surabaya.ListviewTarianSurabaya;

public class ActivityListBudayaSurabaya extends AppCompatActivity {

    private ImageButton mButtonBatikSurabaya,mButtonMakananSurabaya,mButtonTarianSurabaya,mButtonBajudaerahSurabaya;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_budaya_surabaya);
        mButtonBatikSurabaya = findViewById(R.id.button_batik);
        mButtonMakananSurabaya = findViewById(R.id.button_makanan);
        mButtonTarianSurabaya = findViewById(R.id.button_tarian);
        mButtonBajudaerahSurabaya = findViewById(R.id.button_bajudaerah);


        mButtonBatikSurabaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(ActivityListBudayaSurabaya.this,ListviewBatikSurabaya.class);
                startActivity(a);
            }
        });
        mButtonMakananSurabaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahkemenuUtama2 = new Intent(ActivityListBudayaSurabaya.this,ListviewMakananSurabaya.class);
                startActivity(pindahkemenuUtama2);
            }
        });
        mButtonTarianSurabaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahkemenuUtama3 = new Intent(ActivityListBudayaSurabaya.this,ListviewTarianSurabaya.class);
                startActivity(pindahkemenuUtama3);
            }
        });
        mButtonBajudaerahSurabaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahkemenuUtama3 = new Intent(ActivityListBudayaSurabaya.this,ListviewBajudaerahSurabaya.class);
                startActivity(pindahkemenuUtama3);
            }
        });
    }
}

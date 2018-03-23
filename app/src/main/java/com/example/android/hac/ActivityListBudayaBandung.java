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
import com.example.android.hac.Jakarta.ListviewBajudaerahJakarta;
import com.example.android.hac.Jakarta.ListviewBatikJakarta;
import com.example.android.hac.Jakarta.ListviewMakananJakarta;
import com.example.android.hac.Jakarta.ListviewTarianJakarta;

public class ActivityListBudayaBandung extends AppCompatActivity {

    private ImageButton mButtonBatikBandung, mButtonMakananBandung, mButtonTarianBandung,mButtonBajudaerahBandung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_budaya_bandung);
        mButtonBatikBandung = findViewById(R.id.button_batik);
        mButtonMakananBandung = findViewById(R.id.button_makanan);
        mButtonTarianBandung = findViewById(R.id.button_tarian);
        mButtonBajudaerahBandung = findViewById(R.id.button_bajudaerah);


        mButtonBatikBandung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(ActivityListBudayaBandung.this,ListviewBatikBandung.class);
                startActivity(a);
            }
        });
        mButtonMakananBandung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahkemenuUtama2 = new Intent(ActivityListBudayaBandung.this,ListviewMakananBandung.class);
                startActivity(pindahkemenuUtama2);
            }
        });
        mButtonTarianBandung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahkemenuUtama3 = new Intent(ActivityListBudayaBandung.this,ListviewTarianBandung.class);
                startActivity(pindahkemenuUtama3);
            }
        });
        mButtonBajudaerahBandung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahkemenuUtama3 = new Intent(ActivityListBudayaBandung.this,ListviewBajudaerahBandung.class);
                startActivity(pindahkemenuUtama3);
            }
        });
    }
}

package com.example.android.hac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.android.hac.Jakarta.ListviewBajudaerahJakarta;
import com.example.android.hac.Jakarta.ListviewBatikJakarta;
import com.example.android.hac.Jakarta.ListviewMakananJakarta;
import com.example.android.hac.Jakarta.ListviewTarianJakarta;

public class ActivityListBudayaJakarta extends AppCompatActivity {

    private ImageButton mButtonBatikJakarta, mButtonMakananJakarta, mButtonTarianJakarta, mButtonBajudaerahJakarta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_budaya_jakarta);

        mButtonBatikJakarta = findViewById(R.id.button_batik);
        mButtonMakananJakarta = findViewById(R.id.button_makanan);
        mButtonTarianJakarta = findViewById(R.id.button_tarian);
        mButtonBajudaerahJakarta = findViewById(R.id.button_bajudaerah);


        mButtonBatikJakarta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(ActivityListBudayaJakarta.this,ListviewBatikJakarta.class);
                startActivity(a);
            }
        });
        mButtonMakananJakarta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahkemenuUtama2 = new Intent(ActivityListBudayaJakarta.this,ListviewMakananJakarta.class);
                startActivity(pindahkemenuUtama2);
            }
        });
        mButtonTarianJakarta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahkemenuUtama3 = new Intent(ActivityListBudayaJakarta.this,ListviewTarianJakarta.class);
                startActivity(pindahkemenuUtama3);
            }
        });
        mButtonBajudaerahJakarta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahkemenuUtama3 = new Intent(ActivityListBudayaJakarta.this,ListviewBajudaerahJakarta.class);
                startActivity(pindahkemenuUtama3);
            }
        });
    }
}

package com.example.android.hac.Store;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.android.hac.PaymentPaypal;
import com.example.android.hac.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentInfoStoreBatikJalakharupat extends Fragment {

    private TextView mTextView;
    Button mButtonbeli;
    public FragmentInfoStoreBatikJalakharupat() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_info_store, container, false);



    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        mTextView = (TextView) view.findViewById(R.id.Text);
        mButtonbeli = view.findViewById(R.id.btn_beli);

        mButtonbeli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getContext(), PaymentPaypal.class);
                startActivity(a);
            }
        });
        mTextView.setText("Motif-motif batik Bandung berkaitan erat dengan kerajaan Pajajaran. Konon dalam naskah kuno Siksa " +
                "Kanda Ing Karesian, telah dikenal berbagai motif batik di Rakean Darma siksa (1175-1297). Motif-motif batiknya " +
                "antara lain motif Ragen Penganten, Kampuh Jayati, dan lain sebagainya. Namun motif-motif ini hilang bersamaan " +
                "dengan lenyapnya kerajaan Pakuan Pajajaran sekitar tahun 1579. Ada beberapa motif yang berhasil direka ulang, " +
                "yakni motif Ragen Penganten, kembang Muncang Jayanti, dan Banyak Ngantrang, yang kemudian dikenal sebagai motif " +
                "batik Pakuan Pajajaran. Motif-motif inilah yang diterapkan pada Batik " +
                "Kabupaten Bandung." +
                "" +
                "Harga : $ 7,00");

    }




}

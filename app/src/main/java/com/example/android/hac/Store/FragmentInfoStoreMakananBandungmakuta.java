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
public class FragmentInfoStoreMakananBandungmakuta extends Fragment {

    private TextView mTextView;
    Button mButtonbeli;

    public FragmentInfoStoreMakananBandungmakuta() {
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
        mTextView.setText("Dengan hadirnya Bandung Makuta juga diharapkan dapat meningkatkan ketertarikan masyarakat " +
                "luas akan kota Bandung, baik itu dari aspek wisata, kuliner, atau budaya. Bandung Makuta hingga " +
                "saat ini memiliki produk kue dengan komponen: puff pastry, sponge cake, jam/ filling, dan " +
                "cream cheese dengan varian rasa yang beragam, yaitu Makuta Caramel, Makuta Cokelat, " +
                "Makuta Cheese, Makuta Extra Cheese, Makuta Lemon, dan Makuta Blueberry. Seiring berjalannya waktu, " +
                "kini Makuta juga menambahkan dua rasa baru dalam varian Gold Series, yaitu peuyeum dan choco cheese " +
                "yang cocok sebagai pelengkap acara-acara besar, seperti wedding atau pesta lain." +
                "" +
                "" +
                "" +
                "Harga : $ 7,00");
    }




}

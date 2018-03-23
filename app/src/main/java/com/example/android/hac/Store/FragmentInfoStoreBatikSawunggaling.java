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
public class FragmentInfoStoreBatikSawunggaling extends Fragment {

    private TextView mTextView;
    Button mButtonbeli;
    public FragmentInfoStoreBatikSawunggaling() {
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
        mTextView.setText("Batik Surabaya motif Sawunggaling, motif ini berasal dari kisah Joko Berek yang suka adu ayam, Joko " +
                "Berek sendiri adalah nama asli Sawunggaling. Motif ini menggambarkan ayam jago dengan paduan warna-warna modern " +
                "seperti ungu, Osaka atau warna-warna lain yang jarang ada di pasaran." +
                "" +
                "Harga : $ 7,00");

    }




}

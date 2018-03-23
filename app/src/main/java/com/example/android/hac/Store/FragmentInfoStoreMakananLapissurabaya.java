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
public class FragmentInfoStoreMakananLapissurabaya extends Fragment {

    private TextView mTextView;
    Button mButtonbeli;

    public FragmentInfoStoreMakananLapissurabaya() {
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
        mTextView.setText("Lapis surabaya atau biasa juga di sebut Spekkoek atau lapis legit, merupakan roti lapis yang " +
                "biasanya terdiri dari 2 lapisan atau 3 lapisan dengan warna kuning, coklat, kuning. Untuk lapis " +
                "legit sendiri adonan yang selain menggunakan tepung terigu dan telur juga menggunakan kayu manis, " +
                "cengkeh, cardamon yang berarama cengkeh. Ini yang membuat banyak orang Eropa menyukainya. " +
                "Dengan berkembangnya kulturasi budaya, Spekkoek ini dibuat sesuai dengan citarasa orang " +
                "Indonesia." +
                "" +
                "" +
                "Harga : $ 7,00");
    }




}

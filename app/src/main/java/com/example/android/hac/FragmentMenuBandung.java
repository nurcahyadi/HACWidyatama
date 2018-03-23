package com.example.android.hac;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.android.hac.Bandung.ListviewBatikBandung;
import com.example.android.hac.Bandung.ListviewSejarahBandung;
import com.example.android.hac.Bandung.ListviewTarianBandung;
import com.example.android.hac.Event.ListviewEvent;
import com.example.android.hac.Store.TablayoutStore;


public class FragmentMenuBandung extends Fragment {
    private ImageButton mButtonSejarahBandung,mButtonStoreBandung,mButtonBudayaBandung,mButtonEventBandung;


    public FragmentMenuBandung() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu_bandung, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mButtonSejarahBandung = (ImageButton) view.findViewById(R.id.ButtonSejarahBdg);
        mButtonStoreBandung = (ImageButton) view.findViewById(R.id.ButtonStoreBdg);
        mButtonBudayaBandung = (ImageButton) view.findViewById(R.id.ButtonBudayaBdg);
        mButtonEventBandung = (ImageButton) view.findViewById(R.id.ButtonEventBdg);

        mButtonSejarahBandung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ListviewSejarahBandung.class);
                getActivity().startActivity(intent);
            }
        });
        mButtonStoreBandung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), TablayoutStore.class);
                getActivity().startActivity(intent);
            }
        });
        mButtonBudayaBandung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ActivityListBudayaBandung.class);
                getActivity().startActivity(intent);
            }
        });
        mButtonEventBandung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ListviewEvent.class);
                getActivity().startActivity(intent);
            }
        });


    }
}

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

import com.example.android.hac.Event.ListviewEvent;
import com.example.android.hac.Store.TablayoutStore;
import com.example.android.hac.Surabaya.ListviewBatikSurabaya;
import com.example.android.hac.Surabaya.ListviewMakananSurabaya;
import com.example.android.hac.Surabaya.ListviewSejarahSurabaya;
import com.example.android.hac.Surabaya.ListviewTarianSurabaya;

public class FragmentMenuSurabaya extends Fragment {
    private ImageButton mButtonSejarahSurabaya,mButtonStoreSurabaya,mButtonBudayaSurabaya,mButtonEventSurabaya;

    public FragmentMenuSurabaya() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu_surabaya, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mButtonSejarahSurabaya = (ImageButton) view.findViewById(R.id.ButtonSejarahSby);
        mButtonStoreSurabaya = (ImageButton) view.findViewById(R.id.ButtonStoreSby);
        mButtonBudayaSurabaya = (ImageButton) view.findViewById(R.id.ButtonBudayaSby);
        mButtonEventSurabaya = (ImageButton) view.findViewById(R.id.ButtonEventSby);

        mButtonSejarahSurabaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ListviewSejarahSurabaya.class);
                getActivity().startActivity(intent);
            }
        });
        mButtonStoreSurabaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), TablayoutStore.class);
                getActivity().startActivity(intent);
            }
        });
        mButtonBudayaSurabaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ActivityListBudayaSurabaya.class);
                getActivity().startActivity(intent);
            }
        });
        mButtonEventSurabaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ListviewEvent.class);
                getActivity().startActivity(intent);
            }
        });


    }
}

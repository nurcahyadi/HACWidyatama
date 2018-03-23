package com.example.android.hac;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.android.hac.Event.ListviewEvent;
import com.example.android.hac.Jakarta.ListviewSejarahJakarta;
import com.example.android.hac.Store.TablayoutStore;


public class FragmentMenuJakarta extends Fragment {
    private ImageButton mButtonStoreJakarta,mButtonSejarahJakarta,mButtonBudayaJakarta,mButtonEventJakarta;

    public FragmentMenuJakarta() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu_jakarta, container, false);

    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mButtonSejarahJakarta = (ImageButton) view.findViewById(R.id.ButtonSejarahJkt);
        mButtonStoreJakarta = (ImageButton) view.findViewById(R.id.ButtonStoreJkt);
        mButtonBudayaJakarta = (ImageButton) view.findViewById(R.id.ButtonBudayaJkt);
        mButtonEventJakarta = (ImageButton) view.findViewById(R.id.ButtonEventJkt);

        mButtonSejarahJakarta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ListviewSejarahJakarta.class);
                getActivity().startActivity(intent);
            }
        });
        mButtonStoreJakarta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), TablayoutStore.class);
                getActivity().startActivity(intent);
            }
        });
        mButtonBudayaJakarta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ActivityListBudayaJakarta.class);
                getActivity().startActivity(intent);
            }
        });
        mButtonEventJakarta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ListviewEvent.class);
                getActivity().startActivity(intent);
            }
        });


    }
}

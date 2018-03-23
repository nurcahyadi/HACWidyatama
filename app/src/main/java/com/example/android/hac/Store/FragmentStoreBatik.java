package com.example.android.hac.Store;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.android.hac.R;
import com.example.android.hac.SejarahSurabaya.TablayoutInfoSejarahSurabaya1;
import com.example.android.hac.SejarahSurabaya.TablayoutInfoSejarahSurabaya2;
import com.example.android.hac.SejarahSurabaya.TablayoutInfoSejarahSurabaya3;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentStoreBatik extends Fragment {


    public FragmentStoreBatik() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_fragment_store_batik, container, false);
        ListView listview =(ListView) rootView.findViewById(R.id.list);
        final String[] items = new String[] {"Batik Ondel-Ondel", "Batik jalak Harupat", "Batik Semanggi"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, items);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               if (i == 0){
                   Intent myIntent = new Intent(view.getContext(), TablayoutInfoStoreBatikOndelOndel.class);
                   startActivityForResult(myIntent, 0);
               } if (i == 1) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoStoreBatikJalakharupat.class);
                    startActivityForResult(myIntent, 1);
                }
                if (i == 2) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoStoreBatikSawunggaling.class);
                    startActivityForResult(myIntent, 2);
                }

                }
        });
        return rootView;
    }

}

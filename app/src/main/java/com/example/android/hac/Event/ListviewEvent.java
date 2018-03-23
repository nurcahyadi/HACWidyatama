package com.example.android.hac.Event;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.hac.AdapterListview;
import com.example.android.hac.R;
import com.example.android.hac.SejarahSurabaya.TablayoutInfoSejarahSurabaya1;
import com.example.android.hac.SejarahSurabaya.TablayoutInfoSejarahSurabaya2;
import com.example.android.hac.SejarahSurabaya.TablayoutInfoSejarahSurabaya3;
import com.example.android.hac.SejarahSurabaya.TablayoutInfoSejarahSurabaya4;

/**
 * Created by nurcahyadiperdana on 11/28/17.
 */

public class ListviewEvent extends Activity {

    ListView list;

    String[] itemname = {
            "Festival Budaya Borneo",
            "Festival Budaya Nusantara",
            "Festival Budaya Indonesia",
    };

    Integer[] imgid = {
            R.mipmap.festivalbudayaborneo,
            R.mipmap.festivalbudayanusantara,
            R.mipmap.festivalbudayaindonesia

    };

    String[] textname = {
            "Taman Mini Indonesia Indah",
            "Jogjakarta",
            "Jakarta"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        AdapterListview adapter = new AdapterListview(this, itemname, imgid, textname);
        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                //String Slecteditem = itemname[+position];
                // Toast.makeText(getApplicationContext(), "selamat datang", Toast.LENGTH_SHORT).show();
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoEvent1.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoSejarahSurabaya2.class);
                    startActivityForResult(myIntent, 1);
                }
                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoSejarahSurabaya3.class);
                    startActivityForResult(myIntent, 2);
                }
                if (position == 3) {
//                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoSejarahSurabaya4.class);
//                    startActivityForResult(myIntent, 3);
                }
                if (position == 4) {
//                    Intent myIntent = new Intent(view.getContext(), infoBatik5.class);
//                    startActivityForResult(myIntent, 4);
                }

            }
        });
    }

}
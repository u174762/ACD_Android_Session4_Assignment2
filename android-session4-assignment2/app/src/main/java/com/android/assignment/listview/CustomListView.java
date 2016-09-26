package com.android.vicky.listviewcustom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class CustomListView extends AppCompatActivity {
    ListView listViewCustom;
    String[] itemname ={
            "Rohit",
            "Sekhar",
            "Rahul",
            "Sanjay",
            "Kohli",
            "Pawan",
            "Asish",
    };
    /*Integer[] imgid={
            R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic3,
            R.drawable.trn,
    };*/
    String[] phNO={
            "9898586859",
            "9797456859",
            "9625255636",
            "9563632656",
            "8987456585",
            "9685526354",
            "9563626586",
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);
        CustomAdapter adapter=new CustomAdapter(this, itemname, phNO);

        listViewCustom=(ListView)findViewById(R.id.listViewCustom);
        listViewCustom.setAdapter(adapter);

        listViewCustom.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String SelectedName = itemname[+position];
                String SelectedPhNumber = phNO[+position];
                Toast.makeText(getApplicationContext(), "You Selected : "+SelectedName+" ("+SelectedPhNumber+")", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

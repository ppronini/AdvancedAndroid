package com.example.advancedandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView=findViewById(R.id.myListView);

        ArrayList<String> myFamily = new ArrayList<String>();

        myFamily.add("Armana");
        myFamily.add("Ratmir");
        myFamily.add("Pasha");
        myFamily.add("Yaser");


        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,myFamily);

        myListView.setAdapter(arrayAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Log.i("Name logges is",myFamily.get(position));

                Toast.makeText(getApplicationContext(),myFamily.get(position),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
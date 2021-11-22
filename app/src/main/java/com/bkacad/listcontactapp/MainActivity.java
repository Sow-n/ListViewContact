package com.bkacad.listcontactapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lv;

    private void initUI(){
        lv = findViewById(R.id.lv);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        ArrayList<String> data = new ArrayList<>();

        data.add("Contact1-0962027911");
        data.add("Contact2-0962027912");
        data.add("Contact3-0962027913");
        data.add("Contact4-0962027914");
        data.add("Contact5-0962027915");
        data.add("Contact6-0962027916");
        data.add("Contact7-0962027917");
        data.add("Contact8-0962027918");
        data.add("Contact9-0962027919");
        data.add("Contact10-0962027910");

        //su dung adapter
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,data);

        //set adapter cho listview
        lv.setAdapter(myAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String itemChosen = (String) lv.getAdapter().getItem(position);
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("contact", itemChosen);
                startActivity(intent);
            }
        });
    }
}
package com.firstapp.projectgold;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listview = findViewById(R.id.listview);
        List<String> option=new ArrayList<>();
        option.add("Gold price calculation");
        option.add("Silver price calculation");
        option.add("Interest rate calculation");
        option.add("Actual gold price");

        ArrayAdapter arrayAdapter=new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, option);
        listview.setAdapter(arrayAdapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                if (position==0){
                    startActivity(new Intent(MainActivity.this,orangeactivity.class));
                }else if (position==1){
                    startActivity(new Intent(MainActivity.this,silver.class));
                }else if(position==2){
                    startActivity(new Intent(MainActivity.this,intrest.class));
                }else if(position==3){
                    startActivity(new Intent(MainActivity.this,intrest.class));
                }
            }
        });
    }
}
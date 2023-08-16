package com.firstapp.projectgold;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class numb extends AppCompatActivity {
    RecyclerView recycle;
    int pos=1;
    ArrayList<Integer> var=new ArrayList<Integer>();
    butnumadapater adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numb);
        var.add(0);
        recycle=findViewById(R.id.recycle);
        adapter=new butnumadapater(this, var);
        recycle.setAdapter(adapter);
    }
    public void num_inc(View v){
        pos++;
        var.add(pos);
        Toast.makeText(this,var.toString() , Toast.LENGTH_SHORT).show();

        adapter.notifyDataSetChanged();
    }
}
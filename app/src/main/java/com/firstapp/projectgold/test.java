package com.firstapp.projectgold;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class test extends AppCompatActivity {
    RecyclerView re;
    String[] list= new String[]{"sai", "chin","nishanth"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        re=findViewById(R.id.rec);
        profilesadapter adapter=new profilesadapter(this,list);
        re.setAdapter(adapter);
        list[2]="nis";
        adapter.notifyDataSetChanged();

    }
}
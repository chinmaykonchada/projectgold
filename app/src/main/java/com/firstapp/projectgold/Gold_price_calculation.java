package com.firstapp.projectgold;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Gold_price_calculation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appleactivity);
    }
    public void gold_price(View v){
        EditText et_w1=(EditText) findViewById(R.id.et_w);
        EditText et_p1=(EditText) findViewById(R.id.et_p);
        EditText et_r1=(EditText) findViewById(R.id.et_r);
        float w = Float.parseFloat(et_w1.getText().toString());
        float p = Float.parseFloat(et_p1.getText().toString());
        float result=w*p;
        et_r1.setText("ok: "+result);
    }
}
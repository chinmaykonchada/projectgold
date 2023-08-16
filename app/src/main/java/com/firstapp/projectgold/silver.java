package com.firstapp.projectgold;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class silver extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silver);
    }
    public void silver_price(View v){
        EditText et_w1=(EditText) findViewById(R.id.et_w);
        EditText et_p1=(EditText) findViewById(R.id.et_p);
        EditText et_r1=(EditText) findViewById(R.id.et_r);
        EditText et_mc1=(EditText) findViewById(R.id.et_mc);
        float w = Float.parseFloat(et_w1.getText().toString());
        float p = Float.parseFloat(et_p1.getText().toString());
        float mc = Float.parseFloat(et_mc1.getText().toString());
        float result=w*p+mc;
        et_r1.setText(""+result);
    }

}
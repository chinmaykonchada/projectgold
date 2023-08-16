package com.firstapp.projectgold;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class orangeactivity extends AppCompatActivity {// here orange refers to gold chinna pilla nibba yasalu vesa le lite tesko

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orangeactivity);
    }
    public void gold_price(View v){
        EditText et_w1=(EditText) findViewById(R.id.et_w);
        EditText et_p1=(EditText) findViewById(R.id.et_p);
        EditText et_r1=(EditText) findViewById(R.id.et_r);
        EditText et_mc1=(EditText) findViewById(R.id.et_mc);
        EditText editwastage=(EditText) findViewById(R.id.editwastage);

        float p = Float.parseFloat(et_p1.getText().toString());
        float mc = Float.parseFloat(et_mc1.getText().toString());
        float wastage = Float.parseFloat(editwastage.getText().toString());
        float w;
//        Log.i("display", String.valueOf(et_w1.getText()));

        if (!editwastage.getText().toString().equals("")){
            w = Float.parseFloat(et_w1.getText().toString());
        }
        else{
//            Toast.makeText(orangeactivity.this, "fjmcfktcmyofocoy", Toast.LENGTH_SHORT).show();
            w = 0;
        }
        float wt_wastage=w*wastage/100;

        float result=(w+wt_wastage)*p+mc;

        et_r1.setText(""+result);
    }
}
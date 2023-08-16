package com.firstapp.projectgold;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Scanner;

public class intrest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intrest);
    }
    public void intest_rate(View v){
        EditText editamt=(EditText) findViewById(R.id.editamt);
        EditText editrate=(EditText) findViewById(R.id.editrate);
        EditText editnewdate=(EditText) findViewById(R.id.editnewdate);
        EditText editolddate=(EditText) findViewById(R.id.editolddate);
        EditText editintresult=(EditText) findViewById(R.id.editintresult);
        EditText edittotresult=(EditText) findViewById(R.id.edittotresult);
        EditText edittime=(EditText) findViewById(R.id.edittime);
        float amt = Float.parseFloat(editamt.getText().toString());
        float rate = Float.parseFloat(editrate.getText().toString());
        String[] oldDateInput = editolddate.getText().toString().split("/");
        int[] oldDate = new int[3];
        for (int i = 0; i < 3; i++) {
            oldDate[i] = Integer.parseInt(oldDateInput[i]);
        }
        String[] newDateInput = editnewdate.getText().toString().split("/");
        int[] newDate = new int[3];
        for (int i = 0; i < 3; i++) {
            newDate[i] = Integer.parseInt(newDateInput[i]);
        }
        if (newDate[0] - oldDate[0] < 0) {
            newDate[0] = newDate[0] + 30;
            newDate[1] = newDate[1] - 1;
        }
        if (newDate[1] - oldDate[1] < 0) {
            newDate[1] = newDate[1] + 12;
            newDate[2] = newDate[2] - 1;
        }
        int d = newDate[0] - oldDate[0];
        int m = newDate[1] - oldDate[1];
        int y = newDate[2] - oldDate[2];
        int y_m = y * 12;
        double d_m = (double) d / 30;
        double t_m = m + y_m + d_m;

        double amt_m = amt*rate/100;
        double interestAmt = t_m * amt_m;
        double totalAmount = amt + interestAmt;
        editintresult.setText(""+interestAmt);
        edittotresult.setText(""+totalAmount);
        edittime.setText("y:"+y+"  m:"+m+"  d:"+d);
    }
}
package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private EditText et2;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        tv = (TextView) findViewById(R.id.tv);

    }

    public void btn_add_func(View view) {
        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());

        int sum = n1+n2;
        tv.setText(String.valueOf(sum));
    }
    public void btn_sub_func(View view) {
        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());

        int sub = n1-n2;
        tv.setText(String.valueOf(sub));
    }
    public void btn_mul_func(View view) {
        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());

        int mul = n1*n2;
        tv.setText(String.valueOf(mul));
    }
    public void btn_div_func(View view) {
        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());

        int div = n1/n2;
        tv.setText(String.valueOf(div));
    }
}
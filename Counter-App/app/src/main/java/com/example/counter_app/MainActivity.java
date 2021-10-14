package com.example.counter_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int counters = 0;
    Button btn;
    TextView txtv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //variables to take
        btn = (Button) findViewById(R.id.btn);
        txtv = (TextView) findViewById(R.id.tv);

        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                counters++;
                txtv.setText(Integer.toString(counters));

            }
        });
    }
}
package com.example.class_practice_problems;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CenToMeter extends AppCompatActivity {

    EditText enterNumber1;
    TextView result;
    Button Meter,Kmeter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cen_to_meter);

        enterNumber1 = findViewById(R.id.enterNumber1);
        result = findViewById(R.id.result);
        Meter = findViewById(R.id.Meter);
        Kmeter = findViewById(R.id.Kmeter);

        Meter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(enterNumber1.getText().toString());
                result.setText("In Meter: " + (num1/100));
            }
        });

        Kmeter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(enterNumber1.getText().toString());
                result.setText("In Kilo Meter: " + (num1/1000));
            }
        });


    }
}
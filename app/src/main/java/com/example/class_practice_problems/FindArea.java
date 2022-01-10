package com.example.class_practice_problems;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FindArea extends AppCompatActivity {

    EditText enterNumber;
    TextView result;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_area);

        enterNumber = findViewById(R.id.enterNumber);
        result = findViewById(R.id.result);
        submit = findViewById(R.id.submit);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num = Double.parseDouble(enterNumber.getText().toString());

                double area = 3.1416 * (num*num);
//                double area = (Math.PI * (Math.sqrt(num)));

                result.setText("Area of Circle: "+area);

            }
        });
    }
}
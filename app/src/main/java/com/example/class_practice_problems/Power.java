package com.example.class_practice_problems;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Power extends AppCompatActivity {

    EditText enterNumber1, enterNumber2;
    TextView result;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_power);

        enterNumber1 = findViewById(R.id.enterNumber1);
        enterNumber2 = findViewById(R.id.enterNumber2);
        result = findViewById(R.id.result);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(enterNumber1.getText().toString());
                double num2 = Double.parseDouble(enterNumber2.getText().toString());
                double power=1;
                for (double i=1 ; i<=num2 ; i++){
                         power = power * num1;
                }
                result.setText(""+num1 +" power of "+num2+" is: "+ power);
            }
        });

    }
}
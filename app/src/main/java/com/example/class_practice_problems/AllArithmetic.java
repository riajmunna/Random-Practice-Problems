package com.example.class_practice_problems;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AllArithmetic extends AppCompatActivity {

    EditText enterNumber1, enterNumber2;
    TextView result;
    Button submit, Add, Sub, Mul, Div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_arithmetic);

        enterNumber1 = findViewById(R.id.enterNumber1);
        enterNumber2 = findViewById(R.id.enterNumber2);
        result = findViewById(R.id.result);
        submit = findViewById(R.id.submit);
        Add = findViewById(R.id.Add);
        Sub = findViewById(R.id.Sub);
        Mul = findViewById(R.id.Mul);
        Div = findViewById(R.id.Div);


        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(enterNumber1.getText().toString());
                double num2 = Double.parseDouble(enterNumber2.getText().toString());
                double temp = (num1 + num2);
                result.setText("Addition: " + temp);
            }
        });

        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(enterNumber1.getText().toString());
                double num2 = Double.parseDouble(enterNumber2.getText().toString());
                double temp = (num1 - num2);
                result.setText("Subtraction: " + temp);
            }
        });

        Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(enterNumber1.getText().toString());
                double num2 = Double.parseDouble(enterNumber2.getText().toString());
                double temp = (num1*num2);
                result.setText("Multiplication: " + temp);
            }
        });

        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                try{
                    double num1 = Double.parseDouble(enterNumber1.getText().toString());
                    double num2 = Double.parseDouble(enterNumber2.getText().toString());
                    double temp = (num1/num2);
                    result.setText("Division: " + temp);
                }
                catch (ArithmeticException e){
                    result.setText("Can't not divided by 0");
                }
                
            }
        });
    }
}
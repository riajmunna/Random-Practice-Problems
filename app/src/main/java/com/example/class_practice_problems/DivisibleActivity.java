package com.example.class_practice_problems;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DivisibleActivity extends AppCompatActivity {

    EditText enterNumber;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divisible);

        enterNumber = findViewById(R.id.enterNumber);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num = Double.parseDouble(enterNumber.getText().toString());

                if(num%3==0 && num%5==0){
                    Toast.makeText(getApplicationContext(), "Divisible By 3 and 5 both", Toast.LENGTH_SHORT).show();
                }

                if(num%3==0){
                    Toast.makeText(getApplicationContext(), "Divisible By 3", Toast.LENGTH_SHORT).show();
                }

                if(num%5==0){
                    Toast.makeText(getApplicationContext(), "Divisible By 5", Toast.LENGTH_SHORT).show();
                }


                else {
                    Toast.makeText(DivisibleActivity.this, "Not Divisible By anyone!!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
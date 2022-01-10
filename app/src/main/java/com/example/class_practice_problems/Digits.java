package com.example.class_practice_problems;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Digits extends AppCompatActivity {

    EditText enterNumber;
    Button submit;
    TextView show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digits);
        enterNumber = findViewById(R.id.enterNumber);
        submit = findViewById(R.id.submit);
        show = findViewById(R.id.show);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(enterNumber.getText().toString());
                int count = 0;
                while (num != 0) {
                    num = num / 10;
                    count++;
                }
                show.setText("Number of digits: " + count);

            }
        });
    }
}
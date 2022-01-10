package com.example.class_practice_problems;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MultiTable extends AppCompatActivity {

    EditText enterNumber;
    TextView result;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_table);

        enterNumber = findViewById(R.id.enterNumber);
        result = findViewById(R.id.result);
        submit = findViewById(R.id.submit);
        StringBuffer buffer = new StringBuffer();

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num = Double.parseDouble(enterNumber.getText().toString());

                for (double i=1 ; i<=10 ; i++){
                    buffer.append(num+"X"+i+"="+(num*i)+"\n");
                }
                result.setText(buffer);

            }
        });

    }
}
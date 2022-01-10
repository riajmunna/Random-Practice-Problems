package com.example.class_practice_problems;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PrimeActivity extends AppCompatActivity {

    EditText enterNumber;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prime);

        enterNumber = findViewById(R.id.enterNumber);
        submit = findViewById(R.id.submit);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num = Double.parseDouble(enterNumber.getText().toString());
                int flag = 0;
                for(double i=2 ; i<num/2 ; i++){
                    if(num%i==0){
                        Toast.makeText(getApplicationContext(), "Not Prime Number...", Toast.LENGTH_SHORT).show();
                        flag =1;
                        break;
                    }
                }
                if(flag==0){
                    Toast.makeText(getApplicationContext(), "Prime Number...", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}

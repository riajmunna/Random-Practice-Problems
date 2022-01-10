package com.example.class_practice_problems;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Vow_Con extends AppCompatActivity {

    EditText enterNumber;
    TextView show;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vow_con);

        enterNumber = findViewById(R.id.enterNumber);
        submit = findViewById(R.id.submit);
        show = findViewById(R.id.show);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = enterNumber.getText().toString();
                value.toLowerCase();
                char c = value.charAt(0);
                if (c >= 'a' && c<='z') {
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                        show.setText("Alphabet is Vowel");
                    } else {
                        show.setText("Alphabet is Consonant");
                    }
                }
                else{
                    show.setText("Please enter alphabet only");
                }

            }
        });
    }
}
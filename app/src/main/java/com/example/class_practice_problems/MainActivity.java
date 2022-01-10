package com.example.class_practice_problems;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button prime,divisible,currency,allArithmetic,findarea,MulTable,
            cenTometer,Power,vowel_consonant,Digits,first_last_digits;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prime = findViewById(R.id.prime);
        divisible = findViewById(R.id.divisible);
        currency = findViewById(R.id.currency);
        allArithmetic = findViewById(R.id.allArithmetic);
        findarea = findViewById(R.id.findarea);
        MulTable = findViewById(R.id.MulTable);
        cenTometer = findViewById(R.id.cenTometer);
        Power = findViewById(R.id.Power);
        vowel_consonant = findViewById(R.id.vowel_consonant);
        Digits = findViewById(R.id.Digits);
        first_last_digits = findViewById(R.id.first_last_digits);

        prime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),PrimeActivity.class);
                startActivity(intent);
            }
        });

        currency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),CurrencyConverter.class);
                startActivity(intent);
            }
        });

        divisible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),DivisibleActivity.class);
                startActivity(intent);
            }
        });

        allArithmetic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),AllArithmetic.class);
                startActivity(intent);
            }
        });

        findarea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),FindArea.class);
                startActivity(intent);
            }
        });

        MulTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MultiTable.class);
                startActivity(intent);
            }
        });

        cenTometer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),CenToMeter.class);
                startActivity(intent);
            }
        });
        Power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Power.class);
                startActivity(intent);
            }
        });
        vowel_consonant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Vow_Con.class);
                startActivity(intent);
            }
        });
        Digits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Digits.class);
                startActivity(intent);
            }
        });
        first_last_digits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FirstandLastDigits.class);
                startActivity(intent);
            }
        });
    }
}
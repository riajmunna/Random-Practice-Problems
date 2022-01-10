package com.example.class_practice_problems;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CurrencyConverter extends AppCompatActivity {

    Spinner spnto,spnfrom;
    EditText input;
    Button submit;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_converter);

        spnfrom = findViewById(R.id.spnfrom);
        spnto = findViewById(R.id.spnto);
        input = findViewById(R.id.input);
        submit = findViewById(R.id.submit);
        result = findViewById(R.id.result);

        String[] from = {"BDT"};
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,from);
        spnfrom.setAdapter(arrayAdapter);

        String[] to = {"USD","Rupee"};
        ArrayAdapter arrayAdapter2 = new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,to);
        spnto.setAdapter(arrayAdapter2);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double tot;
                Double amount = Double.parseDouble(input.getText().toString());

                if(spnfrom.getSelectedItem().toString() == "BDT" && spnto.getSelectedItem().toString() == "Rupee"){
                    tot = amount * .87;
                    result.setText(""+tot);
                }
                if(spnfrom.getSelectedItem().toString() == "BDT" && spnto.getSelectedItem().toString() == "USD"){
                    tot = amount * .0784;
                    result.setText(""+tot);
                }
            }
        });

    }
}
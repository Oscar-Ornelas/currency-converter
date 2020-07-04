package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view) {
        double exchangeRate = 1.12;
        EditText euroEditText = (EditText) findViewById(R.id.euroEditText);
        String euroString = euroEditText.getText().toString();

        double dollarAmount = Math.round((Double.parseDouble(euroString) * exchangeRate) * 100.0) / 100.0;

        Toast.makeText(this, "€" + euroString + " is $" + String.valueOf(dollarAmount), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
package com.example.mylista;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    String[] nameArray = {
            "EUR", "USD", "GBP", "AUD", "CAD", "CHF", "DKK", "HUF"
    };

    String[] buyArray = {
            "4.4100", "3.9750", "6.1250", "2.9600", "3.0950", "4.2300", "0.5850", "0.0136"
    };

    String[] sellArray = {
            "4.5500", "4.1450", "6.3550", "3.0600", "3.2650", "4.3300", "0.6150", "0.0146"
    };

    int[] flagsArray = {
            R.drawable.eur, R.drawable.usd, R.drawable.gbp, R.drawable.aud,
            R.drawable.cad, R.drawable.chf, R.drawable.dkk, R.drawable.huf
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);
        CustomAdapter customAdapter = new CustomAdapter(this, flagsArray, sellArray, buyArray, nameArray);
        listView.setAdapter(customAdapter);
    }
}

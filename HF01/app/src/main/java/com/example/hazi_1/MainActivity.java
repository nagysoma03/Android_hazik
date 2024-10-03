package com.example.hazi_1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button osszead = findViewById(R.id.btnOsszead);
        Button kivon = findViewById(R.id.btnKivon);
        Button szoroz = findViewById(R.id.btnSzorzas);
        Button eloszt = findViewById(R.id.btnOsztas);

        EditText sz1 = findViewById(R.id.sz1);
        EditText sz2 = findViewById(R.id.sz2);
        TextView eredmenyKiszamitva = findViewById(R.id.kiszamitva);

        osszead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double osszeg;
                osszeg = (Double) (Double.parseDouble(sz1.getText().toString()) + Double.parseDouble(sz2.getText().toString()));
                eredmenyKiszamitva.setText(Double.toString(osszeg));
            }
        });

        kivon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double osszeg;
                osszeg = (Double) (Double.parseDouble(sz1.getText().toString()) - Double.parseDouble(sz2.getText().toString()));
                eredmenyKiszamitva.setText(Double.toString(osszeg));
            }
        });

        szoroz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double osszeg;
                osszeg = (Double) (Double.parseDouble(sz1.getText().toString()) * Double.parseDouble(sz2.getText().toString()));
                eredmenyKiszamitva.setText(Double.toString(osszeg));
            }
        });

        eloszt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double osszeg;
                if (Double.parseDouble(sz2.getText().toString()) == 0) {
                    eredmenyKiszamitva.setText("Nullaval valo osztas");
                } else {
                    osszeg = (Double) (Double.parseDouble(sz1.getText().toString()) / Double.parseDouble(sz2.getText().toString()));
                    eredmenyKiszamitva.setText(Double.toString(osszeg));
                }
            }
        });

    }
}
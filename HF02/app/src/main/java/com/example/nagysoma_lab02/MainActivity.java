package com.example.nagysoma_lab02;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text;
    EditText edit;
    CheckBox check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Statusz", "MainActivity - onCreate");


        Button startTwo = findViewById(R.id.startActivityTwo);
        text = findViewById(R.id.txtSzoveg);
        edit = findViewById(R.id.txtEdit);
        check = findViewById(R.id.checkBox);

        startTwo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ActivityTwo.class);
                startActivity(intent);
            }

        });

        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.append("\n" + text.getText().toString());
            }
        });
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("Statusz", "MainActivity - onSave");
        outState.putString("txt", text.getText().toString());
        outState.putString("edit", edit.getText().toString());
        outState.putBoolean("check", check.isChecked());
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("Statusz", "MainActivity - onRestore");
        text.setText(savedInstanceState.getString("txt"));
        edit.setText(savedInstanceState.getString("edit"));
        check.setChecked(savedInstanceState.getBoolean("check"));
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Statusz", "MainActivity - onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Statusz", "MainActivity - onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Statusz", "MainActivity - onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Statusz", "MainActivity - onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Statusz", "MainActivity - onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Statusz", "MainActivity - onDestroy");
    }


}
package com.example.nagysoma_lab02;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        Log.d("Statusz", "ActivityTwo - onCreate");

        Button toMain = findViewById(R.id.backToMain2);
        toMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityTwo.this, MainActivity.class);
                startActivity(intent);
            }

        });

        Button toThird = findViewById(R.id.btnToThree);
        toThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityTwo.this, ActivityThree.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("Statusz", "ActivityTwo - onSave");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("Statusz", "ActivityTwo - onRestore");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Statusz", "ActivityTwo - onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Statusz", "ActivityTwo - onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Statusz", "ActivityTwo - onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Statusz", "ActivityTwo - onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Statusz", "ActivityTwo - onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Statusz", "ActivityTwo - onDestroy");
    }
}
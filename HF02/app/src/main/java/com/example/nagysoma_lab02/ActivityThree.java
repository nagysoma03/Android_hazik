package com.example.nagysoma_lab02;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ActivityThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        Log.d("Statusz", "ActivityThree - onCreate");

        Button toMain = findViewById(R.id.btnToThree);
        toMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityThree.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("Statusz", "ActivityThree - onSave");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("Statusz", "ActivityThree - onRestore");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Statusz", "ActivityThree - onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Statusz", "ActivityThree - onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Statusz", "ActivityThree - onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Statusz", "ActivityThree - onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Statusz", "ActivityThree - onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Statusz", "ActivityThree - onDestroy");
    }
}
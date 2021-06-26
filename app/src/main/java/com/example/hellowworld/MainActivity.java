package com.example.hellowworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
private final String TAG="myActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("myActivity","onCreate");
        finish();

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("myActivity","onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("myActivity","onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("myActivity","onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("myActivity","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("myActivity","onStop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("myActivity","onResume");
    }
}
package com.example.beproject;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Handler;
import android.content.Intent;

import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.P)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handler = new Handler();
        long delayMillis = 3000;
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intend = new Intent(Splash.this , Register.class);
                startActivity(intend);
            }
        },delayMillis);



    }
}
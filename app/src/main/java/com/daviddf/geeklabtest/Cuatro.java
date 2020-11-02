package com.daviddf.geeklabtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Cuatro extends AppCompatActivity {
    private final int SPLASH_DISPLAY_LENGTH = 1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuatro);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(Cuatro.this, Tres.class);
                Cuatro.this.startActivity(mainIntent);
                Cuatro.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}
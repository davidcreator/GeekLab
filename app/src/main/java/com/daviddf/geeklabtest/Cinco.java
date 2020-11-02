package com.daviddf.geeklabtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Cinco extends AppCompatActivity {
    private final int SPLASH_DISPLAY_LENGTH = 1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinco);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(Cinco.this, Cuatro.class);
                Cinco.this.startActivity(mainIntent);
                Cinco.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}
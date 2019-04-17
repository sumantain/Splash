package com.nav.testproject;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }

    @Override
    protected void onStart() {
        super.onStart();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startNext();
            }
        }, 2000);
    }

    private void startNext() {
        Intent nextIntent = new Intent(this, MainActivity.class);
        startActivity(nextIntent);
        finish();
    }
}


package com.example.todo_new;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splash extends AppCompatActivity {

    private static final int SPLASH_DELAY = 3000; // 3000 milliseconds delay

    private final Runnable splashRunnable = new Runnable() {
        @Override
        public void run() {
            Intent intent = new Intent(splash.this, sign_in.class);
            startActivity(intent);
            finish();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Initialize the Handler
        Handler handler = new Handler();
        handler.postDelayed(splashRunnable, SPLASH_DELAY);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Remove the callback to prevent memory leaks
        Handler handler = new Handler();
        handler.removeCallbacks(splashRunnable);
    }
}

package com.example.holidayexpenses;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Hide the bar on top of the screen
        Objects.requireNonNull(getSupportActionBar()).hide();

        // Make the loading screen disappear after 3 sec
        Handler handler = new Handler();
        handler.postDelayed(() -> {
            Intent indent = new Intent(getApplicationContext(), HomeActivity.class);
            startActivity(indent);
            finish();
        }, 3000);

        // Make plane move from down to top
        ImageView plane = (ImageView) findViewById(R.id.imageView);
        TranslateAnimation animation = new TranslateAnimation(0.0f, 0.0f, 0.0f, -3000.0f);
        animation.setDuration(3000);
        animation.setFillAfter(true);
        plane.startAnimation(animation);

    }
}
package com.example.holidayexpenses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Objects;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Hide the bar on top of the screen
        Objects.requireNonNull(getSupportActionBar()).hide();

        // initiate and perform click event on button's
        ImageButton newTripButton = (ImageButton)findViewById(R.id.addNewTripButton);
        newTripButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"search button is Clicked", Toast.LENGTH_LONG).show();
            }
        });
    }
}
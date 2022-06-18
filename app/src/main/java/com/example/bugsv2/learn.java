package com.example.bugsv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class learn extends AppCompatActivity {
    private Button seasonsButton,wordsButton,daysButton,hoursButton,directionsButton,backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

        daysButton = findViewById(R.id.daysButton);
        daysButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(learn.this,daysoftheweek.class));
            }
        });

        directionsButton = findViewById(R.id.directionsButton);
        directionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(learn.this,directions.class));
            }
        });

        hoursButton = findViewById(R.id.hoursButton);
        hoursButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(learn.this,hours.class));
            }
        });

        wordsButton = findViewById(R.id.wordsButton);
        wordsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(learn.this,words.class));
            }
        });

        seasonsButton = findViewById(R.id.seasonsButton);
        seasonsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(learn.this, seasons.class));
            }
        });

        backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(learn.this,homepage.class));
            }
        });
    }
}
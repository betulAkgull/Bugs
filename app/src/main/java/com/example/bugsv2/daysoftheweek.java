package com.example.bugsv2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class daysoftheweek extends AppCompatActivity {

    EditText monday;
    EditText tuesday;
    EditText wednesday;
    EditText thursday;
    EditText friday;
    EditText saturday;
    EditText sunday;
    String strMonday;
    String strTuesday;
    String strWednesday;
    String strThursday;
    String strFriday;
    String strSaturday;
    String strSunday;
    Button checkDays;
    score score;
    int point=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daysoftheweek);
        monday = findViewById(R.id.monday);
        tuesday = findViewById(R.id.tuesday);
        wednesday = findViewById(R.id.wednesday);
        thursday = findViewById(R.id.thursday);
        friday = findViewById(R.id.friday);
        saturday = findViewById(R.id.saturday);
        sunday = findViewById(R.id.sunday);
        checkDays.findViewById(R.id.checkDays);
        checkDays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                daysMatch();
            }
        });
    }

    public void daysMatch() {
        strMonday = monday.getText().toString();
        strTuesday = tuesday.getText().toString();
        strWednesday = wednesday.getText().toString();
        strThursday = thursday.getText().toString();
        strFriday = friday.getText().toString();
        strSaturday = saturday.getText().toString();
        strSunday = sunday.getText().toString();

        if (!strMonday.toLowerCase().equals("monday")) {
            monday.setTextColor(Color.RED);
        } else {
            monday.setTextColor(Color.GREEN);
            point++;
            score.increaseScoreByOne();
            Toast.makeText(daysoftheweek.this,"Points Earned: " + point,Toast.LENGTH_SHORT).show();
        }
        if (!strTuesday.toLowerCase().equals("tuesday")) {
            tuesday.setTextColor(Color.RED);
        } else {
            tuesday.setTextColor(Color.GREEN);
            point++;
            score.increaseScoreByOne();
            Toast.makeText(daysoftheweek.this,"Points Earned: " + point,Toast.LENGTH_SHORT).show();
        }
        if (!strWednesday.toLowerCase().equals("wednesday")) {
            wednesday.setTextColor(Color.RED);
        } else {
            wednesday.setTextColor(Color.GREEN);
            point++;
            score.increaseScoreByOne();
            Toast.makeText(daysoftheweek.this,"Points Earned: " + point,Toast.LENGTH_SHORT).show();
        }
        if (!strThursday.toLowerCase().equals("thursday")) {
            thursday.setTextColor(Color.RED);
        } else {
            thursday.setTextColor(Color.GREEN);
            point++;
            score.increaseScoreByOne();
            Toast.makeText(daysoftheweek.this,"Points Earned: " + point,Toast.LENGTH_SHORT).show();
        }
        if (!strFriday.toLowerCase().equals("friday")) {
            friday.setTextColor(Color.RED);
        } else {
            friday.setTextColor(Color.GREEN);
            point++;
            score.increaseScoreByOne();
            Toast.makeText(daysoftheweek.this,"Points Earned: " + point,Toast.LENGTH_SHORT).show();
        }
        if (!strSaturday.toLowerCase().equals("saturday")) {
            saturday.setTextColor(Color.RED);
        } else {
            saturday.setTextColor(Color.GREEN);
            point++;
            score.increaseScoreByOne();
            Toast.makeText(daysoftheweek.this,"Points Earned: " + point,Toast.LENGTH_SHORT).show();
        }
        if (!strSunday.toLowerCase().equals("sunday")) {
            sunday.setTextColor(Color.RED);
        } else {
            sunday.setTextColor(Color.GREEN);
            point++;
            score.increaseScoreByOne();
            Toast.makeText(daysoftheweek.this,"Points Earned: " + point,Toast.LENGTH_SHORT).show();
        }
    }
}
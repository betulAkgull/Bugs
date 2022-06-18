package com.example.bugsv2;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bugsv2.R;

public class seasons extends AppCompatActivity {
        Button checkSeasons;
        EditText January;
        EditText February;
        EditText March;
        EditText April;
        EditText May;
        EditText June;
        EditText July;
        EditText August;
        EditText September;
        EditText October;
        EditText November;
        EditText December;
        String strJanuary;
        String strFebruary;
        String strMarch;
        String strApril;
        String strMay;
        String strJune;
        String strJuly;
        String strAugust;
        String strSeptember;
        String strOctober;
        String strNovember;
        String strDecember;
        score score;
        int point =0;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_seasons);

            January = findViewById(R.id.january);
            February = findViewById(R.id.february);
            March = findViewById(R.id.march);
            April = findViewById(R.id.april);
            May = findViewById(R.id.may);
            June = findViewById(R.id.june);
            July = findViewById(R.id.july);
            August = findViewById(R.id.august);
            September = findViewById(R.id.september);
            October = findViewById(R.id.october);
            November = findViewById(R.id.november);
            December = findViewById(R.id.decembertext);

            checkSeasons = findViewById(R.id.checkSeasons);
            checkSeasons.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    seasonsMatching();
                }
            });


        }


        public void seasonsMatching() {

            strJanuary = January.getText().toString();
            strFebruary = February.getText().toString();
            strMarch = March.getText().toString();
            strApril = April.getText().toString();
            strMay = May.getText().toString();
            strJune = June.getText().toString();
            strJuly = July.getText().toString();
            strAugust = August.getText().toString();
            strSeptember = September.getText().toString();
            strOctober = October.getText().toString();
            strNovember = November.getText().toString();
            strDecember = December.getText().toString();


            if (!strJanuary.toLowerCase().equals("january")) {
                January.setTextColor(Color.RED);
            } else {
                January.setTextColor(Color.GREEN);
                point++;
                score.increaseScoreByOne();
                Toast.makeText(seasons.this,"Points Earned: " + point,Toast.LENGTH_SHORT).show();
            }

            if (!strFebruary.toLowerCase().equalsIgnoreCase("february")) {
                February.setTextColor(Color.RED);
            } else {
                February.setTextColor(Color.GREEN);
                point++;
                score.increaseScoreByOne();
                Toast.makeText(seasons.this,"Points Earned: " + point,Toast.LENGTH_SHORT).show();
            }
            if (!strMarch.toLowerCase().equalsIgnoreCase("march")) {
                March.setTextColor(Color.RED);
            } else {
                March.setTextColor(Color.GREEN);
                point++;
                score.increaseScoreByOne();
                Toast.makeText(seasons.this,"Points Earned: " + point,Toast.LENGTH_SHORT).show();
            }
            if (!strApril.toLowerCase().equalsIgnoreCase("april")) {
                April.setTextColor(Color.RED);
            } else {
                April.setTextColor(Color.GREEN);
                point++;
                score.increaseScoreByOne();
                Toast.makeText(seasons.this,"Points Earned: " + point,Toast.LENGTH_SHORT).show();
            }
            if (!strMay.toLowerCase().equalsIgnoreCase("may")) {
                May.setTextColor(Color.RED);
            } else {
                May.setTextColor(Color.GREEN);
                point++;
                score.increaseScoreByOne();
                Toast.makeText(seasons.this,"Points Earned: " + point,Toast.LENGTH_SHORT).show();
            }
            if (!strJune.toLowerCase().equalsIgnoreCase("june")) {
                June.setTextColor(Color.RED);
            } else {
                June.setTextColor(Color.GREEN);
                point++;
                score.increaseScoreByOne();
                Toast.makeText(seasons.this,"Points Earned: " + point,Toast.LENGTH_SHORT).show();
            }
            if (!strJuly.toLowerCase().equalsIgnoreCase("july")) {
                July.setTextColor(Color.RED);
            } else {
                July.setTextColor(Color.GREEN);
                point++;
                score.increaseScoreByOne();
                Toast.makeText(seasons.this,"Points Earned: " + point,Toast.LENGTH_SHORT).show();
            }
            if (!strAugust.toLowerCase().equalsIgnoreCase("august")) {
                August.setTextColor(Color.RED);
            } else {
                August.setTextColor(Color.GREEN);
                point++;
                score.increaseScoreByOne();
                Toast.makeText(seasons.this,"Points Earned: " + point,Toast.LENGTH_SHORT).show();
            }
            if (!strSeptember.toLowerCase().equalsIgnoreCase("september")) {
                September.setTextColor(Color.RED);
            } else {
                September.setTextColor(Color.GREEN);
                point++;
                score.increaseScoreByOne();
                Toast.makeText(seasons.this,"Points Earned: " + point,Toast.LENGTH_SHORT).show();
            }
            if (!strOctober.toLowerCase().equalsIgnoreCase("october")) {
                October.setTextColor(Color.RED);
            } else {
                October.setTextColor(Color.GREEN);
                point++;
                score.increaseScoreByOne();
                Toast.makeText(seasons.this,"Points Earned: " + point,Toast.LENGTH_SHORT).show();
            }
            if (!strNovember.toLowerCase().equalsIgnoreCase("november")) {
                November.setTextColor(Color.RED);
            } else {
                November.setTextColor(Color.GREEN);
                point++;
                score.increaseScoreByOne();
                Toast.makeText(seasons.this,"Points Earned: " + point,Toast.LENGTH_SHORT).show();
            }
            if (!strDecember.toLowerCase().equalsIgnoreCase("december")) {
                December.setTextColor(Color.RED);
            } else {
                December.setTextColor(Color.GREEN);
                point++;
                score.increaseScoreByOne();
                Toast.makeText(seasons.this,"Points Earned: " + point,Toast.LENGTH_SHORT).show();
            }

        }

    }


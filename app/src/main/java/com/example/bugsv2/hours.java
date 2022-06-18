package com.example.bugsv2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class hours extends AppCompatActivity {
    EditText time1;
    EditText time2;
    EditText time3;
    EditText time4;
    String strTime1;
    String strTime2;
    String strTime3;
    String strTime4;
    int point = 0;
    Button checkHours;
    score score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hours);
        time1 = findViewById(R.id.time1);
        time2 = findViewById(R.id.time2);
        time3 = findViewById(R.id.time3);
        time4 = findViewById(R.id.time4);
        checkHours = findViewById(R.id.checkHours);
        checkHours.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                timeMatching();
            }
        });
    }

    private void timeMatching() {
        strTime1 = time1.getText().toString();
        strTime2 = time2.getText().toString();
        strTime3 = time3.getText().toString();
        strTime4 = time4.getText().toString();


        if (!(strTime1.equals("15.15") | strTime1.equals("3.15"))) {
            point = 0;
            time1.setTextColor(Color.RED);
        } else {
            time1.setTextColor(Color.GREEN);
            point++;
            score.increaseScoreByOne();
            Toast.makeText(hours.this,"Points Earned: " + point,Toast.LENGTH_SHORT).show();
        }

        if (!(strTime2.equals("15.45") | strTime2.equals("3.45"))) {
            time2.setTextColor(Color.RED);
            point = 0;
        } else {
            time2.setTextColor(Color.GREEN);
            point++;
            score.increaseScoreByOne();
            Toast.makeText(hours.this,"Points Earned: " + point,Toast.LENGTH_SHORT).show();
        }

        if (!(strTime3.equals("15.00") | strTime3.equals("3.00"))) {
            time3.setTextColor(Color.RED);
            point = 0;
        } else {
            time3.setTextColor(Color.GREEN);
            point++;
            score.increaseScoreByOne();
            Toast.makeText(hours.this,"Points Earned: " + point,Toast.LENGTH_SHORT).show();
        }

        if (!(strTime4.equals("15.30") | strTime4.equals("3.30"))) {
            time4.setTextColor(Color.RED);
            point = 0;
        } else {
            time4.setTextColor(Color.GREEN);
            point++;
            score.increaseScoreByOne();
            Toast.makeText(hours.this,"Points Earned: " + point,Toast.LENGTH_SHORT).show();
        }
    }
}
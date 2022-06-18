package com.example.bugsv2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class directions extends AppCompatActivity {

    Button checkDirections;
    EditText Back;
    EditText Front;
    EditText Left;
    EditText Right;
    int point;
    score score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directions);

        Back= findViewById(R.id.Back);
        Front= findViewById(R.id.Front);
        Left= findViewById(R.id.Left);
        Right= findViewById(R.id.Right);
        checkDirections = (Button) findViewById(R.id.checkDirections);
        checkDirections.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                matchTextAndImages();
            }
        });
    }

    private void matchTextAndImages() {
        if (!Back.getText().toString().toLowerCase().equals("back")) {
            Back.setTextColor(Color.RED);
        }else{
            Back.setTextColor(Color.GREEN);
            point++;
            score.increaseScoreByOne();
            Toast.makeText(directions.this,"Points Earned: " + point,Toast.LENGTH_SHORT).show();
        }
        if (!Left.getText().toString().toLowerCase().equals("left")) {
            Left.setTextColor(Color.RED);
        }else{
            Left.setTextColor(Color.GREEN);
            point++;
            score.increaseScoreByOne();
            Toast.makeText(directions.this,"Points Earned: " + point,Toast.LENGTH_SHORT).show();
        }
        if (!Right.getText().toString().toLowerCase().equals("right")) {
            Right.setTextColor(Color.RED);
        }else{
            Right.setTextColor(Color.GREEN);
            point++;
            score.increaseScoreByOne();
            Toast.makeText(directions.this,"Points Earned: " + point,Toast.LENGTH_SHORT).show();
        }
        if (!Front.getText().toString().toLowerCase().equals("front")) {
            Front.setTextColor(Color.RED);
        }else{
            Front.setTextColor(Color.GREEN);
            point++;
            score.increaseScoreByOne();
            Toast.makeText(directions.this,"Points Earned: " + point,Toast.LENGTH_SHORT).show();
        }
    }
}
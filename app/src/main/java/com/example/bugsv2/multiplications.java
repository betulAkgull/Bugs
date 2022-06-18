package com.example.bugsv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class multiplications extends AppCompatActivity {
    EditText answerOfMul;
    TextView num1;
    TextView num2;
    int answer;
    int intNum1;
    int intNum2;
    Button checkMultiplication;
    score score;
    int point = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplications);

        num1 = findViewById(R.id.Number1);
        num2 = findViewById(R.id.Number2);
        answerOfMul =findViewById(R.id.AnswerOfMultiplication);
        createNumberRandomly();
        checkMultiplication = findViewById(R.id.checkMultiplication);
        checkMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = String.valueOf(answer);

                if(temp.matches(answerOfMul.getText().toString())){
                    Toast.makeText(multiplications.this, "Correct", Toast.LENGTH_LONG).show();
                    point++;
                    score.increaseScoreByOne();
                    Toast.makeText(multiplications.this,"Points Earned: " + point,Toast.LENGTH_SHORT).show();
                    createNumberRandomly();
                }else
                    Toast.makeText(multiplications.this, "False", Toast.LENGTH_LONG).show();
                createNumberRandomly();
            }
        });
    }

    private void createNumberRandomly() {

        intNum1 = (int) (Math.random() * 10);
        intNum2 = (int) (Math.random() * 10);

        num1.setText(String.valueOf(intNum1));
        num2.setText(String.valueOf(intNum2));

        answer =intNum1 * intNum2;
    }
}
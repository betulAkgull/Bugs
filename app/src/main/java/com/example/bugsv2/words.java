package com.example.bugsv2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class words extends AppCompatActivity {
    EditText basketball;
    EditText chess;
    EditText cartoon;
    EditText football;
    EditText pizza;
    EditText book;
    String strBasketball;
    String strChess;
    String strCartoon;
    String strFootlball;
    String strPizza;
    String strBook;
    int point = 0;
    Button checkWords;
    score score;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words);

        basketball = findViewById(R.id.basketballText);
        book = findViewById(R.id.bookText);
        chess = findViewById(R.id.chessText);
        pizza = findViewById(R.id.pizzaText);
        football = findViewById(R.id.footballText);
        cartoon = findViewById(R.id.cartoonText);
        checkWords = findViewById(R.id.checkWords);

        checkWords.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wordMatch();
            }
        });
    }

    private void wordMatch() {

        strBasketball = basketball.getText().toString();
        strCartoon = cartoon.getText().toString();
        strChess = chess.getText().toString();
        strFootlball = football.getText().toString();
        strPizza = pizza.getText().toString();
        strBook = book.getText().toString();

        if (!(strBasketball.equals("Basketball") | strBasketball.equals("basketball"))) {
            basketball.setTextColor(Color.RED);
        } else {
            basketball.setTextColor(Color.GREEN);
            point++;
            score.increaseScoreByOne();
            Toast.makeText(words.this,"Points Earned: " + point,Toast.LENGTH_SHORT).show();
        }

        if (!(strBook.equals("Book") | strBook.equals("book"))) {
            book.setTextColor(Color.RED);
        } else {
            book.setTextColor(Color.GREEN);
            point++;
            score.increaseScoreByOne();
            Toast.makeText(words.this,"Points Earned: " + point,Toast.LENGTH_SHORT).show();
        }

        if (!(strChess.equals("Chess") | strChess.equals("chess"))) {
            chess.setTextColor(Color.RED);
        } else {
            chess.setTextColor(Color.GREEN);
            point++;
            score.increaseScoreByOne();
            Toast.makeText(words.this,"Points Earned: " + point,Toast.LENGTH_SHORT).show();
        }

        if (!(strPizza.equals("Pizza") | strPizza.equals("pizza"))) {
            pizza.setTextColor(Color.RED);
        } else {
            pizza.setTextColor(Color.GREEN);
            point++;
            score.increaseScoreByOne();
            Toast.makeText(words.this,"Points Earned: " + point,Toast.LENGTH_SHORT).show();
        }
        if (!(strCartoon.equals("Cartoon") | strCartoon.equals("cartoon"))) {
            cartoon.setTextColor(Color.RED);
        } else {
            cartoon.setTextColor(Color.GREEN);
            point++;
            score.increaseScoreByOne();
            Toast.makeText(words.this,"Points Earned: " + point,Toast.LENGTH_SHORT).show();
        }

        if (!(strFootlball.equals("Football") | strFootlball.equals("football"))) {
            football.setTextColor(Color.RED);
        } else {
            football.setTextColor(Color.GREEN);
            point++;
            score.increaseScoreByOne();
            Toast.makeText(words.this,"Points Earned: " + point,Toast.LENGTH_SHORT).show();
        }
    }
}
package com.example.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Question4 extends AppCompatActivity implements View.OnClickListener {

    Button button1, button2, button3, button4, buttonNext, resetButton;
    TextView answerText;
    String answer = "onCreate() onStart() onResume() onStop() ";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quest4);
        buttonNext = findViewById(R.id.buttonNext);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        answerText = findViewById(R.id.answerText);
        resetButton = findViewById(R.id.resetButton);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        buttonNext.setOnClickListener(this);
        resetButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                answerText.setText(answerText.getText().toString() + button1.getText().toString() + " ");
                button1.setVisibility(View.GONE);
                break;
            case R.id.button2:
                answerText.setText(answerText.getText().toString() + button2.getText().toString() + " ");
                button2.setVisibility(View.GONE);
                break;
            case R.id.button3:
                answerText.setText(answerText.getText().toString() + button3.getText().toString() + " ");
                button3.setVisibility(View.GONE);
                break;
            case R.id.button4:
                answerText.setText(answerText.getText().toString() + button4.getText().toString() + " ");
                button4.setVisibility(View.GONE);
                break;
            case R.id.resetButton:
                answerText.setText("");
                button1.setVisibility(View.VISIBLE);
                button2.setVisibility(View.VISIBLE);
                button3.setVisibility(View.VISIBLE);
                button4.setVisibility(View.VISIBLE);
                break;
            case R.id.buttonNext:
                if(answer.toUpperCase().equals(answerText.getText().toString().toUpperCase())){
                    Logic.rightAns += 1;
                }
                Intent intent1;
                intent1 = new Intent(Question4.this, ResultList.class);
                startActivity(intent1);
                break;
        }

    }
}

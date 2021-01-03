package com.example.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Question3 extends AppCompatActivity implements View.OnClickListener {

    TextView text;
    Button buttonNext;
    String ans = "final";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quest3);
        text = findViewById(R.id.textLine);
        buttonNext = findViewById(R.id.buttonNext);
        buttonNext.setOnClickListener(this::onClick);

    }

    @Override
    public void onClick(View v) {
        if(ans.toUpperCase().equals(text.getText().toString().toUpperCase())) {
            Logic.rightAns += 1;
        }
        Intent intent1;
        intent1 = new Intent(Question3.this, Question4.class);
        startActivity(intent1);

    }
}

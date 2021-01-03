package com.example.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class Question1 extends AppCompatActivity implements View.OnClickListener {


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quest1);
        Button buttonNext = (Button) findViewById(R.id.buttonNext);
        RadioButton var1 = (RadioButton) findViewById(R.id.var1);
        RadioButton var2 = (RadioButton) findViewById(R.id.var2);
        RadioButton var3 = (RadioButton) findViewById(R.id.var3);
        RadioButton var4 = (RadioButton) findViewById(R.id.var4);
        buttonNext.setOnClickListener(this::onClick);

    }

    public void onClick(View v) {
        RadioButton var2 = (RadioButton) findViewById(R.id.var2);
        if(var2.isChecked()){
            Logic.rightAns += 1;
        }
        Intent intent1;
        intent1 = new Intent(Question1.this, Question2.class);
        startActivity(intent1);


    }
}
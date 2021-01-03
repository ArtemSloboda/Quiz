package com.example.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;


public class Question2 extends AppCompatActivity implements View.OnClickListener {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quest2);
        Button buttonNext = (Button) findViewById(R.id.buttonNext);
        CheckBox var1 = (CheckBox) findViewById(R.id.var1);
        CheckBox var2 = (CheckBox) findViewById(R.id.var2);
        CheckBox var3 = (CheckBox) findViewById(R.id.var3);
        CheckBox var4 = (CheckBox) findViewById(R.id.var4);
        buttonNext.setOnClickListener(this::onClick);
    }

    public void onClick(View v) {
        CheckBox var1 = (CheckBox) findViewById(R.id.var1);
        CheckBox var4 = (CheckBox) findViewById(R.id.var4);
        if(var1.isChecked() && var4.isChecked()){
            Logic.rightAns += 1;
        }
        Intent intent1;
        intent1 = new Intent(Question2.this, Question3.class);
        startActivity(intent1);

    }

}

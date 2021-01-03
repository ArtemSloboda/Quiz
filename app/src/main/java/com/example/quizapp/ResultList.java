package com.example.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultList extends AppCompatActivity implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        TextView tv = (TextView) findViewById(R.id.resultText);
        tv.setText("Ваш результат " + Logic.rightAns + " баллов из 4");
        Button retry = (Button) findViewById(R.id.retryButton);
        retry.setOnClickListener(this::onClick);

    }

    @Override
    public void onClick(View v) {
        Logic.rightAns = 0;
        Intent intent1;
        intent1 = new Intent(ResultList.this, MainActivity.class);
        startActivity(intent1);
    }
}

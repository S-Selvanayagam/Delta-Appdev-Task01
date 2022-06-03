package com.bawp.deltaappdevtask01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class homepage extends AppCompatActivity {
    Button start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        start = findViewById(R.id.button5);
    }

    public void Proceed(View view) {

        Intent i = new Intent(homepage.this, MainActivity.class);
        startActivity(i);

    }
}
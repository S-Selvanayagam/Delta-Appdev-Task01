package com.bawp.deltaappdevtask01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class scorepage extends MainActivity {
    Button button;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scorepage);
        button = findViewById(R.id.button2);
        button.setText(String.valueOf(score));
        back = findViewById(R.id.button3);


    }

    public void onBackPressed(View view) {
        finish();
        super.onBackPressed();
        Intent i = new Intent(scorepage.this, MainActivity.class);
        startActivity(i);
    }
}
package com.bawp.deltaappdevtask01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
}
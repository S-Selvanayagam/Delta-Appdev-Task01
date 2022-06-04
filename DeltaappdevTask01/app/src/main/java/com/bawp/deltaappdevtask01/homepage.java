package com.bawp.deltaappdevtask01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class homepage extends AppCompatActivity {
    Button start;
    Button btnToggleDark;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        start = findViewById(R.id.button5);
        btnToggleDark = findViewById(R.id.button6);
        SharedPreferences sharedPreferences
                = getSharedPreferences(
                "sharedPrefs", MODE_PRIVATE);
        final SharedPreferences.Editor editor
                = sharedPreferences.edit();
        final boolean isDarkModeOn
                = sharedPreferences
                .getBoolean(
                        "isDarkModeOn", false);

        
        if (isDarkModeOn) {
            AppCompatDelegate
                    .setDefaultNightMode(
                            AppCompatDelegate
                                    .MODE_NIGHT_YES);
            btnToggleDark.setText(
                    "Disable Dark Mode");
        }
        else {
            AppCompatDelegate
                    .setDefaultNightMode(
                            AppCompatDelegate
                                    .MODE_NIGHT_NO);
            btnToggleDark
                    .setText(
                            "Enable Dark Mode");
        }

        btnToggleDark.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View view)
                    {

                        if (isDarkModeOn) {


                            AppCompatDelegate
                                    .setDefaultNightMode(
                                            AppCompatDelegate
                                                    .MODE_NIGHT_NO);

                            editor.putBoolean(
                                    "isDarkModeOn", false);
                            editor.apply();

                            btnToggleDark.setText(
                                    "Enable Dark Mode");
                        }
                        else {

                            AppCompatDelegate
                                    .setDefaultNightMode(
                                            AppCompatDelegate
                                                    .MODE_NIGHT_YES);


                            editor.putBoolean(
                                    "isDarkModeOn", true);
                            editor.apply();

                            btnToggleDark.setText(
                                    "Disable Dark Mode");
                        }
                    }
                });
    }

    public void Proceed(View view) {

        Intent i = new Intent(homepage.this, MainActivity.class);
        startActivity(i);

    }
}
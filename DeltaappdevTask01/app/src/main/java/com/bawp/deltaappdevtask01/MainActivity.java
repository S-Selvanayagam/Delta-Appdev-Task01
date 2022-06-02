package com.bawp.deltaappdevtask01;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Vibrator;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    Button num1;
    Button num2;
    Button num3;
    Button num4;
    Button num5;
    Button num6;
    Button num7;
    Button num8;
    Button num9;
    Button num10;
    Button a11;
    Button a12;
    Button a21;
    Button a22;
    Button a31;
    Button a32;
    Button a41;
    Button a42;
    Button a51;
    Button a52;
    TextView hdis;
    TextView op1;
    TextView op2;
    TextView op3;
    TextView op4;
    TextView op5;
    Vibrator vibrator;

    double r1 = 0;
    double r2 = 0;
    double r3 = 0;
    double r4 = 0;
    double r5 = 0;
    int min = 1;
    int max = 100;


    int heart= 3;
    String[] operations = {"+", "-", "x", "/"};
    int score = 0;
    private HashMap<Integer, Boolean> clickcheck;

    private ArrayList<Double> results;
    private ArrayList<Integer> numval;

    TextView res1;
    TextView res2;
    TextView res3;
    TextView res4;
    TextView res5;
    private Boolean isClicked;
    String selectedAnswer;

    public void puzzle() {
        num1.setBackgroundColor(Color.BLUE);
        num2.setBackgroundColor(Color.BLUE);
        num3.setBackgroundColor(Color.BLUE);
        num4.setBackgroundColor(Color.BLUE);
        num5.setBackgroundColor(Color.BLUE);
        num6.setBackgroundColor(Color.BLUE);
        num7.setBackgroundColor(Color.BLUE);
        num8.setBackgroundColor(Color.BLUE);
        num9.setBackgroundColor(Color.BLUE);
        num10.setBackgroundColor(Color.BLUE);
        a11.setText("");
        a12.setText("");
        a21.setText("");
        a22.setText("");
        a31.setText("");
        a32.setText("");
        a41.setText("");
        a42.setText("");
        a51.setText("");
        a52.setText("");
        int n1 = (int)Math.floor(Math.random()*(max-min+1)+min);
        int n2 = (int)Math.floor(Math.random()*(max-min+1)+min);
        int n3 = (int)Math.floor(Math.random()*(max-min+1)+min);
        int n4 = (int)Math.floor(Math.random()*(max-min+1)+min);
        int n5 = (int)Math.floor(Math.random()*(max-min+1)+min);
        int n6 = (int)Math.floor(Math.random()*(max-min+1)+min);
        int n7 = (int)Math.floor(Math.random()*(max-min+1)+min);
        int n8 = (int)Math.floor(Math.random()*(max-min+1)+min);
        int n9 = (int)Math.floor(Math.random()*(max-min+1)+min);
        int n10 = (int)Math.floor(Math.random()*(max-min+1)+min);
        num1.setText(String.valueOf(n1));
        num2.setText(String.valueOf(n2));
        num3.setText(String.valueOf(n3));
        num4.setText(String.valueOf(n4));
        num5.setText(String.valueOf(n5));
        num6.setText(String.valueOf(n6));
        num7.setText(String.valueOf(n7));
        num8.setText(String.valueOf(n8));
        num9.setText(String.valueOf(n9));
        num10.setText(String.valueOf(n10));
        clickcheck = new HashMap<Integer , Boolean>();

        results = new ArrayList<Double>();
        numval = new ArrayList<Integer>(Arrays.asList(n1, n2, n3, n4, n5, n6, n7, n8, n9, n10));
        int ri1 = new Random().nextInt(4);
        op1.setText(operations[ri1]);
        int ri2 = new Random().nextInt(4);
        op2.setText((operations[ri2]));
        int ri3 = new Random().nextInt(4);
        op3.setText(operations[ri3]);
        int ri4 = new Random().nextInt(4);
        op4.setText(operations[ri4]);
        int ri5 = new Random().nextInt(4);
        op5.setText(operations[ri5]);

        Collections.shuffle(numval);

        double a = numval.get(0);
        double b = numval.get(1);
        double c = numval.get(2);
        double d = numval.get(3);
        double e = numval.get(4);
        double f = numval.get(5);
        double g = numval.get(6);
        double h = numval.get(7);
        double i = numval.get(8);
        double j = numval.get(9);
        if (operations[ri1] == "+"){

            r1 = a+b;
        }
        else if (operations[ri1] == "-"){

            r1 = a-b;
        }
        else if (operations[ri1] == "x"){

            r1 = a * b;
        }
        else if (operations[ri1] == "/"){

            r1 = a/b;
        }
        if (operations[ri2] == "+"){

            r2 = c+d;
        }
        else if (operations[ri2] == "-"){
            r2 = c-d;
        }
        else if (operations[ri2] == "x"){

            r2 = c * d;
        }
        else if (operations[ri2] == "/"){

            r2 = c/d;
        }
        if (operations[ri3] == "+"){

            r3 = e+f;
        }
        else if (operations[ri3] == "-"){

            r3 = e-f;
        }
        else if (operations[ri3] == "x"){

            r3 = e * f;
        }
        else if (operations[ri3] == "/"){

            r3 = e/f;
        }
        if (operations[ri4] == "+"){

            r4 = g+h;
        }
        else if (operations[ri4] == "-"){

            r4 = g-h;
        }
        else if (operations[ri4] == "x"){

            r4 = g * h;
        }
        else if (operations[ri4] == "/"){

            r4 = g/h;
        }
        if (operations[ri5] == "+"){

            r5 = i+j;
        }
        else if (operations[ri5] == "-"){

            r5 = i-j;
        }
        else if (operations[ri5] == "x"){

            r5 = i * j;
        }
        else if (operations[ri5] == "/"){

            r5 = i/j;
        }
        res1.setText(String.valueOf(r1));
        res2.setText(String.valueOf(r2));
        res3.setText(String.valueOf(r3));
        res4.setText(String.valueOf(r4));
        res5.setText(String.valueOf(r5));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        num4 = findViewById(R.id.num4);
        num5 = findViewById(R.id.num5);
        num6 = findViewById(R.id.num6);
        num7 = findViewById(R.id.num7);
        num8 = findViewById(R.id.num8);
        num9 = findViewById(R.id.num9);
        num10 = findViewById(R.id.num10);
        hdis = findViewById(R.id.hdis);
        op1 = findViewById(R.id.op1);
        op2 = findViewById(R.id.op2);
        op3 = findViewById(R.id.op3);
        op4 = findViewById(R.id.op4);
        op5 = findViewById(R.id.op5);
        a11 = findViewById(R.id.button11);
        a12 = findViewById(R.id.button17);
        a21 = findViewById(R.id.button12);
        a31 = findViewById(R.id.button13);
        a41 = findViewById(R.id.button14);
        a51 = findViewById(R.id.button15);
        a22 = findViewById(R.id.button18);
        a32 = findViewById(R.id.button19);
        a42 = findViewById(R.id.button20);
        a52 = findViewById(R.id.button21);
        res1 = findViewById(R.id.res1);
        res2 = findViewById(R.id.res2);
        res3 = findViewById(R.id.res3);
        res4 = findViewById(R.id.res4);
        res5 = findViewById(R.id.res5);
        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);

        puzzle();

        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1.setBackgroundColor(Color.RED);
                selectedAnswer = (String) num1.getText();

            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num2.setBackgroundColor(Color.RED);
                selectedAnswer = (String) num2.getText();
            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num3.setBackgroundColor(Color.RED);
                selectedAnswer = (String) num3.getText();
            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num4.setBackgroundColor(Color.RED);
                selectedAnswer = (String) num4.getText();
            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num5.setBackgroundColor(Color.RED);
                selectedAnswer = (String) num5.getText();
            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num6.setBackgroundColor(Color.RED);
                selectedAnswer = (String) num6.getText();
            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num7.setBackgroundColor(Color.RED);
                selectedAnswer = (String) num7.getText();
            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num8.setBackgroundColor(Color.RED);
                selectedAnswer = (String) num8.getText();
            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num9.setBackgroundColor(Color.RED);
                selectedAnswer = (String) num9.getText();
            }
        });
        num10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num10.setBackgroundColor(Color.RED);
                selectedAnswer = (String) num10.getText();
            }
        });
        a11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (String.valueOf(a11.getText()) == ""){
                    a11.setText(selectedAnswer);
                }

            }
        });
        a12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (String.valueOf(a12.getText()) == ""){
                    a12.setText(selectedAnswer);
                }

            }
        });
        a21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (String.valueOf(a21.getText()) == ""){
                    a21.setText(selectedAnswer);
                }

            }
        });
        a22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (String.valueOf(a22.getText()) == ""){
                    a22.setText(selectedAnswer);
                }

            }
        });
        a31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (String.valueOf(a31.getText()) == ""){
                    a31.setText(selectedAnswer);
                }

            }
        });
        a32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (String.valueOf(a32.getText()) == ""){
                    a32.setText(selectedAnswer);
                }

            }
        });
        a41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (String.valueOf(a41.getText()) == ""){
                    a41.setText(selectedAnswer);
                }

            }
        });
        a42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (String.valueOf(a42.getText()) == ""){
                    a42.setText(selectedAnswer);
                }

            }
        });
        a51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (String.valueOf(a51.getText()) == ""){
                    a51.setText(selectedAnswer);
                }

            }
        });
        a52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (String.valueOf(a52.getText()) == ""){
                    a52.setText(selectedAnswer);
                }

            }
        });

        hdis.setText(( "NUMBER OF LIVES : " + String.valueOf(heart)));
    }


    public void submitAnswer(View view) {
        int wrongans = 0;
        DecimalFormat decimalFormat = new DecimalFormat("#.00");


        Double a = Double.parseDouble(String.valueOf(a11.getText()));
        Double b = Double.parseDouble(String.valueOf(a12.getText()));
        Double c = Double.parseDouble(String.valueOf(a21.getText()));
        Double d = Double.parseDouble(String.valueOf(a22.getText()));
        Double e = Double.parseDouble(String.valueOf(a31.getText()));
        Double f = Double.parseDouble(String.valueOf(a32.getText()));
        Double g = Double.parseDouble(String.valueOf(a41.getText()));
        Double h = Double.parseDouble(String.valueOf(a42.getText()));
        Double i = Double.parseDouble(String.valueOf(a51.getText()));
        Double j = Double.parseDouble(String.valueOf(a52.getText()));


        String operation1 = String.valueOf(op1.getText());
        String operation2 = String.valueOf(op2.getText());
        String operation3 = String.valueOf(op3.getText());
        String operation4 = String.valueOf(op4.getText());
        String operation5 = String.valueOf(op5.getText());

        Double ans1 = Double.parseDouble(String.valueOf(res1.getText()));
        Double ans2 = Double.parseDouble(String.valueOf(res2.getText()));
        Double ans3 = Double.parseDouble(String.valueOf(res3.getText()));
        Double ans4 = Double.parseDouble(String.valueOf(res4.getText()));
        Double ans5 = Double.parseDouble(String.valueOf(res5.getText()));

        if (operation1 == "+") {
            if (a+b != r1) {
                wrongans += 1;
                Log.i("ans", String.valueOf(a+b));
                Log.i("ans", String.valueOf(ans1));
            }
        }
        if (operation1 == "-") {
            if (a-b != r1) {
                wrongans += 1;
            }
        }
        if (operation1 == "x") {
            if (a*b != r1) {
                wrongans += 1;

            }
        }
        if (operation1 == "/") {
            double formattedAns = a/b;

            if ((double) ans1 != (double) formattedAns) {
                wrongans += 1;
                Log.i("ans", String.valueOf(decimalFormat.format(a/b)));
                Log.i("ans", String.valueOf(decimalFormat.format(ans1)));
            }
        }
        if (operation2 == "+") {
            if (c+d != r2) {
                wrongans += 1;
            }
        }
        if (operation2 == "-") {
            if (c-d != r2) {
                wrongans += 1;
            }
        }
        if (operation2 == "x") {
            if (c*f != r2) {
                wrongans += 1;

            }
        }
        if (operation2 == "/") {
            double formattedAns = c/d;

            if ((double) ans2 != (double) formattedAns) {
                wrongans += 1;
                Log.i("ans", String.valueOf(decimalFormat.format(c/d)));
                Log.i("ans", String.valueOf(decimalFormat.format(ans2)));
            }
        }
        if (operation3 == "+") {
            if (e+f != r3) {
                wrongans += 1;
            }
        }
        if (operation3 == "-") {
            if (e-f != r3) {
                wrongans += 1;
            }
        }
        if (operation3 == "x") {
            if (e*f != r3) {
                wrongans += 1;

            }
        }
        if (operation3 == "/") {
            double formattedAns = e/f;

            if ((double) ans3 != (double) formattedAns) {
                wrongans += 1;
                Log.i("ans", String.valueOf(decimalFormat.format(e / f)));
                Log.i("ans", String.valueOf(decimalFormat.format(ans3)));
            }
        }
        if (operation4 == "+") {
            if (g+h != r4) {
                wrongans += 1;
            }
        }
        if (operation4 == "-") {
            if (g-h != r4) {
                wrongans += 1;
            }
        }
        if (operation4 == "x") {
            if (g*h != r4) {
                wrongans += 1;

            }
        }
        if (operation4 == "/") {
            double formattedAns = g/h;

            if ((double) ans4 != (double) formattedAns) {
                wrongans += 1;
                Log.i("ans", String.valueOf(decimalFormat.format(g/h)));
                Log.i("ans", String.valueOf(decimalFormat.format(ans4)));
            }
        }
        if (operation5 == "+") {
            if (i+j != r5) {
                wrongans += 1;
            }
        }
        if (operation5 == "-") {
            if (i-j != r5) {
                wrongans += 1;
            }
        }
        if (operation5== "x") {
            if (i*j != r5) {
                wrongans += 1;

            }
        }
        if (operation5 == "/") {
            double formattedAns = i/j;

            if ((double) ans5 != (double) formattedAns) {
                wrongans += 1;
                Log.i("ans", String.valueOf(decimalFormat.format(i/j)));
                Log.i("ans", String.valueOf(decimalFormat.format(ans5)));
            }
        }

        if ( wrongans == 0) {

            score += 100;
            Toast.makeText(getApplicationContext(), "Right Answer !! Your score is " + String.valueOf(score), Toast.LENGTH_SHORT).show();
        }
        else {

            heart -= 1;
            Toast.makeText(getApplicationContext(), "You have lost a life!!! " + String.valueOf(heart) + " lives remaining", Toast.LENGTH_SHORT).show();
            hdis.setText(( "NUMBER OF LIVES : " + String.valueOf(heart)));
        }
        if (heart == 0){
            TextView textView = findViewById(R.id.textView7);
            textView.setVisibility(View.VISIBLE);
            vibrator.vibrate(1000);
        }
        else {
            puzzle();

        }




    }

}
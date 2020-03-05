package com.example.ex033;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageButton clearBtn;

    ImageButton smallBtn;

    ImageButton equalBtn;

    ImageButton bigBtn;

    ImageButton pressBtn;

    TextView counterTv;

    TextView trueOrFalseTv;

    TextView firstNumberTv;

    TextView secNumberTv;

    Random rnd = new Random();

    int clicks = 0;

    int rightClicks = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clearBtn =(ImageButton)findViewById(R.id.clearBtn);
        smallBtn =(ImageButton)findViewById(R.id.smallBtn);
        equalBtn =(ImageButton)findViewById(R.id.equalBtn);
        bigBtn =(ImageButton)findViewById(R.id.bigBtn);
        pressBtn =(ImageButton)findViewById(R.id.pressBtn);
        counterTv =(TextView)findViewById(R.id.counterTv);
        trueOrFalseTv =(TextView)findViewById(R.id.trueOrFalseTv);
        firstNumberTv =(TextView)findViewById(R.id.firstNumberTv);
        secNumberTv =(TextView)findViewById(R.id.secNumberTv);
    }

    public void setNumbers(View view) {

        firstNumberTv.setText(rnd.nextInt(3)+1 + "");
        secNumberTv.setText(rnd.nextInt(3)+1 + "");
    }

    public void big(View view) {
        clicks++;

        if (firstNumberTv.getText().toString() != "1st number" && secNumberTv.getText().toString() != "2st number") {
            if (Integer.parseInt(firstNumberTv.getText().toString()) > Integer.parseInt(secNumberTv.getText().toString())) {
                rightClicks++;
                trueOrFalseTv.setText("True");
            } else {
                trueOrFalseTv.setText("False");
            }
        }

        counterTv.setText(rightClicks + "/" + clicks);
    }

    public void equal(View view) {
        clicks++;

        if (firstNumberTv.getText().toString() != "1st number" && secNumberTv.getText().toString() != "2st number") {
            if (Integer.parseInt(firstNumberTv.getText().toString()) == Integer.parseInt(secNumberTv.getText().toString())) {
                rightClicks++;
                trueOrFalseTv.setText("True");
            } else {
                trueOrFalseTv.setText("False");
            }
        }

        counterTv.setText(rightClicks + "/" + clicks);
    }

    public void small(View view) {
        clicks++;

        if (firstNumberTv.getText().toString() != "1st number" && secNumberTv.getText().toString() != "2st number") {
            if (Integer.parseInt(firstNumberTv.getText().toString()) < Integer.parseInt(secNumberTv.getText().toString())) {
                rightClicks++;
                trueOrFalseTv.setText("True");
            } else {
                trueOrFalseTv.setText("False");
            }
        }

        counterTv.setText(rightClicks + "/" + clicks);
    }

    public void clear(View view) {
        rightClicks = 0;
        clicks = 0;
        trueOrFalseTv.setText("True/false");
        counterTv.setText("Counter");
        firstNumberTv.setText("1st number");
        secNumberTv.setText("2st number");
    }
}
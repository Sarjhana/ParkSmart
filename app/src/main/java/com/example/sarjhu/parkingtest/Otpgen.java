package com.example.sarjhu.parkingtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Otpgen extends AppCompatActivity {

    Button generateRandom;
    TextView randomResult;
    Random myRandom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otpgen);
        generateRandom = findViewById(R.id.generate);
        randomResult = findViewById(R.id.randomresult);
        //popup = findViewById(R.id.popup);

        generateRandom.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                String result = " ";
                myRandom = new Random();
                int rand = myRandom.nextInt(10000);
                while(String.valueOf(rand).length()<5)
                {
                    rand += rand;
                }
                result = String.valueOf(rand).substring(0,5);
                randomResult.setText(String.valueOf(result));

            }});

    }
}


package com.examples.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA,scoreB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayA(0);
    }

    public void onClick3A(View view){
        scoreA=scoreA+3;
        displayA(scoreA);
    }

    public void onClick2A(View view){
        scoreA=scoreA+2;
        displayA(scoreA);
    }

    public void onClick1A(View view){
        scoreA=scoreA+1;
        displayA(scoreA);
    }

    public void displayA(int score){
        TextView textView=findViewById(R.id.s1);
        textView.setText(String.valueOf(score));
    }

    public void onClick3B(View view){
        scoreB=scoreB+3;
        displayB(scoreB);
    }

    public void onClick2B(View view){
        scoreB=scoreB+2;
        displayB(scoreB);
    }

    public void onClick1B(View view){
        scoreB=scoreB+1;
        displayB(scoreB);
    }

    public void displayB(int score){
        TextView textView=findViewById(R.id.s2);
        textView.setText(String.valueOf(score));
    }

    public void resetScore(View view){
        scoreA=0;
        scoreB=0;
        displayA(scoreA);
        displayB(scoreB);
    }


}

package com.example.android.quizapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class aHighestScoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_highest_score);

        TextView testSCore = (TextView)findViewById(R.id.testScore);
        TextView testHighestScore = (TextView)findViewById(R.id.testHighestSCore);

        //Receive the score  from last activity

        Intent intent = getIntent();
        int score = intent.getIntExtra("score", 0);

        //display current score
        testSCore.setText("Your Score: " + score);

        //used shared preferences to get the best score

        SharedPreferences mypref =getPreferences(MODE_PRIVATE);
        int highestScore = mypref.getInt("highScore", 0);
        if (highestScore >= score) {
            testHighestScore.setText(" High Score: " + score);
        } else {
            testHighestScore.setText("New High Score: " + score);
            SharedPreferences.Editor editor = mypref.edit();
            editor.putInt("highScore", score);
            editor.commit();

        }


    }


    public void onClick (View view) {
        Intent intent = new Intent(aHighestScoreActivity.this, MainActivity.class);
        startActivity(intent);
    }
}

package com.example.lidia.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int foulTeamA = 0;
    int scoreTeamB = 0;
    int foulTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }


    public void addScoreA(View view){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void addFoulA(View view){
        foulTeamA = foulTeamA + 1;
        displayFoulForTeamA(foulTeamA);
    }

    public void addScoreB(View view){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void addFoulB(View view){
        foulTeamB = foulTeamB + 1;
        displayFoulForTeamB(foulTeamB);
    }

    public void resetEverything(View view){

        scoreTeamA = 0;
        scoreTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;

        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayFoulForTeamA(foulTeamA);
        displayFoulForTeamB(foulTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulForTeamA(int foul) {
        TextView foulView = (TextView) findViewById(R.id.team_a_foul);
        foulView.setText(String.valueOf(foul));
    }

    public void displayFoulForTeamB(int foul) {
        TextView foulView = (TextView) findViewById(R.id.team_b_foul);
        foulView.setText(String.valueOf(foul));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}

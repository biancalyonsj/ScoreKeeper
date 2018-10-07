package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Keeps track of Villanova's score
    int vScore = 0;
    //Keeps track of Kansas' score
    int kScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase Team V Score By 3
     */
    public void addThreeForTeamV (View v) {
        vScore = vScore +3;
        displayForTeamV(vScore);
    }

    /**
     * Increase Team V Score By 2
     */
    public void addTwoForTeamV (View v) {
        vScore = vScore +2;
        displayForTeamV(vScore);
    }

    /**
     * Increase Team V Score By 1
     */
    public void addOneForTeamV (View v) {
        vScore = vScore +1;
        displayForTeamV(vScore);
    }

    /**
     * Displays the given score for Team V.
     */
    public void displayForTeamV(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_v_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase Team K Score By 3
     */
    public void addThreeForTeamK (View v) {
        kScore = kScore +3;
        displayForTeamK(kScore);
    }

    /**
     * Increase Team K Score By 2
     */
    public void addTwoForTeamK (View v) {
        kScore = kScore +2;
        displayForTeamK(kScore);
    }

    /**
     * Increase Team K Score By 1
     */
    public void addOneForTeamK (View v) {
        kScore = kScore +1;
        displayForTeamK(kScore);
    }

    /**
     * Displays the given score for Team V.
     */
    public void displayForTeamK(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_k_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Reset Team Scores to Zero
     */
    public void resetScore (View v) {
        vScore = 0;
        kScore = 0;
        displayForTeamK(kScore);
        displayForTeamV(vScore);
    }
}

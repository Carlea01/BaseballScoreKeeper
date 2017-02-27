package com.example.android.baseballscorekeeper;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import static android.R.attr.id;

public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    int scoreA = 0;
    int scoreB = 0;
    int hitA = 0;
    int hitB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    /**
     * This method is called when the +1 run button is clicked for Team A.
     */
    public void displayForTeamA(View view) {
        scoreA = scoreA + 1;
        displayForTeamA(scoreA);

    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int scoreA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreA));
    }

    /**
     * This method is called when the +1 hit button is clicked.
     */
    public void displayForTeamAHit(View view) {
        hitA = hitA + 1;
        displayForTeamAHit(hitA);

    }

    /**
     * Displays the given hit count for Team A.
     */
    public void displayForTeamAHit(int hitA) {
        TextView hitView = (TextView) findViewById(R.id.team_a_hit);
        hitView.setText(String.valueOf(hitA));
    }

    /**
     * This method is called when the +1 run button is clicked for Team B.
     */
    public void displayForTeamB(View view) {
        scoreB = scoreB + 1;
        displayForTeamB(scoreB);

    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int scoreB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreB));
    }

    /**
     * This method is called when the +1 hit button is clicked for Team B.
     */
    public void displayForTeamBHit(View view) {
        hitB = hitB + 1;
        displayForTeamBHit(hitB);

    }

    /**
     * Displays the given hit count for Team B.
     */
    public void displayForTeamBHit(int hitB) {
        TextView hitView = (TextView) findViewById(R.id.team_b_hit);
        hitView.setText(String.valueOf(hitB));
    }

    /**
     * This method is called when the reset button is clicked.
     */
    public void displayForReset(View view) {
        scoreA = 0;
        hitA = 0;
        scoreB = 0;
        hitB = 0;
        displayForTeamA(scoreA);
        displayForTeamAHit(hitA);
        displayForTeamB(scoreB);
        displayForTeamBHit(hitB);
    }
}

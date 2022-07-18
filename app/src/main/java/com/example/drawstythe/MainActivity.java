package com.example.drawstythe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int mScore1;
    private int mScore2;

    private TextView mScoreText1;
    private TextView mScoreText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mScoreText1 = (TextView) findViewById(R.id.score_1);
        mScoreText2 = (TextView) findViewById(R.id.score_2);
    }

    public void decreaseScore(View view) {
        int viewID = view.getId();
        switch (viewID) {
            case R.id.DecreaseTeam1:
                mScore1--;
                mScoreText1.setText(String.valueOf(mScore1));
                break;
            case R.id.DecreaseTeam2:
                mScore2--;
                mScoreText2.setText(String.valueOf(mScore2));

        }


    }

    public void increaseScore(View view) {
        int viewID = view.getId();
        switch (viewID) {
            case R.id.IncreaseTeam1:
                mScore1++;
                mScoreText1.setText(String.valueOf(mScore1));
                break;
            case R.id.IncreaseTeam2:
                mScore2++;
                mScoreText2.setText(String.valueOf(mScore2));
        }
    }
}
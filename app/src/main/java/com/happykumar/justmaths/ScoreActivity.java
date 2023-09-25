package com.happykumar.justmaths;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        TextView txtScore = (TextView) findViewById(R.id.txtScore);
        ImageButton btnShareScore = (ImageButton) findViewById(R.id.btnShareScore);

        int score = getIntent().getIntExtra("score", 0);
        txtScore.setText("Current Score : " + score);

        btnShareScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("text/plain");
                i.putExtra(Intent.EXTRA_TEXT, "Hey there! \uD83C\uDF89 I just scored " + score + " points in the Just Maths Game! \uD83E\uDDEE Can you beat my score?");
                startActivity(i);
            }
        });
    }
}
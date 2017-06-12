package com.mlab.quizapp;

        import android.content.Intent;
        import android.content.SharedPreferences;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

        import org.w3c.dom.Text;

public class HighScoreActivity extends AppCompatActivity {

    public Button tryBtn,menuBtn;

    public void init () {
        tryBtn= (Button)findViewById(R.id.tryBtn);
        tryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HighScoreActivity.this, HistoryActivity.class);
                startActivity(intent);
            }
        });

        menuBtn= (Button)findViewById(R.id.menuBtn);
        menuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HighScoreActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_score);

        TextView txtScore = (TextView) findViewById(R.id.txtScore);
        TextView txtHighScore = (TextView) findViewById(R.id.txtHighestScore);

        Intent intent = getIntent();
        int score = intent.getIntExtra("score", 0);
        txtScore.setText("Your Score:" + score);

        SharedPreferences mypref = getPreferences(MODE_PRIVATE);
        int highscore = mypref.getInt("highscore", 0);
        if (highscore>= score)
            txtHighScore.setText("High Score: "+highscore);
        else
        {
            txtHighScore.setText("New HighScore: "+score);
            SharedPreferences.Editor editor = mypref.edit();
            editor.putInt("highscore", score);
            editor.commit();
        }
    }

    public void onClick(View view) {
        Intent intent = new Intent(HighScoreActivity.this, HistoryActivity.class);
        startActivity(intent);




    }











}

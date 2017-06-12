package com.mlab.quizapp;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.preference.DialogPreference;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MathsLitActivity extends AppCompatActivity {

    Button choice1, choice2, choice3, choice4;

    TextView score, question;

    private question2 mQuestions = new question2();

    private String mAnswers;
    private int mScore = 0;
    private int mQuestionsLenght = mQuestions.mQuestions.length;

    Random r;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths_lit);

        r = new Random();


        choice1 = (Button) findViewById(R.id.choice1);
        choice2 = (Button) findViewById(R.id.choice2);
        choice3 = (Button) findViewById(R.id.choice3);
        choice4 = (Button) findViewById(R.id.choice4);


        score = (TextView) findViewById(R.id.score);
        question = (TextView) findViewById(R.id.question);

        score.setText ("Score: " + mScore);

        updateQuestions(r.nextInt(mQuestionsLenght));

        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(choice1.getText() == mAnswers) {
                    mScore++;
                    score.setText ("Score: " + mScore);
                    updateQuestions(r.nextInt(mQuestionsLenght));
                    Toast.makeText(MathsLitActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MathsLitActivity.this, "Incorrect", Toast.LENGTH_SHORT).show();
                }

            }


        });

        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(choice2.getText() == mAnswers) {
                    mScore++;
                    score.setText ("Score: " + mScore);
                    updateQuestions(r.nextInt(mQuestionsLenght));
                    Toast.makeText(MathsLitActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MathsLitActivity.this, "Incorrect", Toast.LENGTH_SHORT).show();
                }

            }


        });

        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(choice3.getText() == mAnswers) {
                    mScore++;
                    score.setText ("Score: " + mScore);
                    updateQuestions(r.nextInt(mQuestionsLenght));
                    Toast.makeText(MathsLitActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MathsLitActivity.this, "Incorrect", Toast.LENGTH_SHORT).show();
                }

            }


        });

        choice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(choice4.getText() == mAnswers) {
                    mScore++;
                    score.setText ("Score: " + mScore);
                    updateQuestions(r.nextInt(mQuestionsLenght));
                    Toast.makeText(MathsLitActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MathsLitActivity.this, HighScoreActivity.class);
                    intent.putExtra("score", mScore);
                    startActivity(intent);

                }else{
                    Toast.makeText(MathsLitActivity.this, "Incorrect", Toast.LENGTH_SHORT).show();
                }

            }


        });


    }

    private void updateQuestions(int num) {
        question.setText(mQuestions.getQuestion(num));
        choice1.setText(mQuestions.getChoice1(num));
        choice2.setText(mQuestions.getChoice2(num));
        choice3.setText(mQuestions.getChoice3(num));
        choice4.setText(mQuestions.getChoice4(num));


        mAnswers = mQuestions.getCorrectAnswer(num);
    }

    private void gameOver(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MathsLitActivity.this);
        alertDialogBuilder
                .setMessage("Game Over! Your score is " + mScore + "Points.")
                .setCancelable(false)
                .setPositiveButton("NEW GAME",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                startActivity(new Intent(getApplicationContext(), MathsLitActivity.class));
                            }

                        })

                .setNegativeButton("EXIT",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });



    }
}
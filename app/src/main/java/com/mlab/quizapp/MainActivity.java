package com.mlab.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button sportBtn,historyBtn,mathsBtn;

    public void init() {
        sportBtn = (Button) findViewById(R.id.sportBtn);
        sportBtn.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

        Intent intent = new Intent(MainActivity.this, SportActivity.class);


        startActivity(intent);

    }


});


        historyBtn = (Button) findViewById(R.id.historyBtn);
        historyBtn.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, HistoryActivity.class);
                startActivity(intent);

            }


        });




        mathsBtn = (Button) findViewById(R.id.mathsBtn);
        mathsBtn.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, MathsLitActivity.class);
                startActivity(intent);

            }


        });




        }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();


    }

}

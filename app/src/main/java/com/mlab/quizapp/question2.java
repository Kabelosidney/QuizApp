package com.mlab.quizapp;


public class question2 {
    String[] mQuestions  = {
            "What is 0% of 0?",
            "When we're calculating the cirlcle,Pie is equal to what(rounded-off)?" ,
            "What is the total volume of L=25cm by B=40cm & H=5cm ?",
            "If R2.50 is equal to 250cents, how many cents are in R10.50?",
            "What is the Mode= (1,2,3,3,4,5,6,7,8,9,10,11,11,11,12,13,13",
            "if Time=Distance/average speed, how much time will it take for a person running 5m at 10km/h?",
            "1,2500 x 10000 = _____",
            "If the diameter of the Cirle is 30cm,what is the Radius of the cirlcle?",
            "What is the Formula to calculate an Area of ?"


    };

    private String mChoices[][] = {
            {"0,00","00,0","0","0,1"},
            {"3.41","4.13","3.14","2.14","3.14"},
            {"5000cm","1000cm","5000cm3","5000cm"},
            {"1 500cents","5 010cents","10 000cents","1 050cents"},
            {"11","3","13","None of the ABOVE"},
            {"0.05hours","5meters","5.0hours","None of the ABOVE"},
            {"1 2,500","1 250","1 2500","1 2000"},
            {"15mm","150cm","30mm","15cm"},
            {"Pie x Radius x radius","Radius x Pie","Pie x Radius","Non of the Above"}
    };

    private String mCorrectAnswers[] = {"0","3.14","5000cm3","1 050cents","11","None of the ABOVE","1 2500","15cm","Pie x Radius x radius"};


    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;

    }

    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;

    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;

    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getChoice4(int a) {
        String choice3= mChoices[a][3];
        return choice3;
    }


    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}

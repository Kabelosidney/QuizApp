package com.mlab.quizapp;

public class questions {

    String[] mQuestions  = {
            "The first soccer team to win the world cup?",
            "The fastest running man in the world?",
            "You use a bat and a small ball to play",
            "Scored the first goal during 2010 world cup",
            "It is used to build a body and gain strong musles",
            "It is used to play tennis",
            "Barcelona.Fill in the missing word : Lionel _____",
            "Kaizer Chies.Fill in the missing word :____ Khune"


    };

    private String mChoices[][] = {
            {"SOUTH AFRICA","URUGUAY","USAIN BOLT","CRICKET",},
            {"TYSON GAY","USAIN BOLT","CRICKET","BRIAN HARBAN"},
            {"GOLF","BASKETBALL","USAIN BOLT","CRICKET"},
            {"SIPHIWE TSHABALALA","URUGUAY","RONALDO","MERCY",},
            {"RUBBER","BALL","BARBELL","ROCKET"},
            {"BAT","GOLF STICK","RACKET","BASEBALL BAT"},
            {"MATRIC","MESSY","MESSI","MERCY"},
            {"PHUNE","KUNE","CHUNE","KHUNE"}

    };

    private String mCorrectAnswers[] = {"URUGUAY","USAIN BOLT","CRICKET","SIPHIWE TSHABALALA","BARBELL","RACKET","MESSI","KHUNE"};


    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;

    }

    public int getLength(){ return mQuestions.length;}

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

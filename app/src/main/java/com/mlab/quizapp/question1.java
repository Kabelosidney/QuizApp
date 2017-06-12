package com.mlab.quizapp;

public class question1 {
    String[] mQuestions  = {
            "From which yeah to which year did the first world war started?",
            "Who was the leader of the Civil Rights Movement in America?" ,
            "When did Democracy started in South Africa?",
            "Who was the Leader of the Nazi Party in USSR from 1933 to 1945?",
            "Who was the first president in South Africa?",
            "When did the American Civil War Starts?",
            "Which South African President built a house worth more that R200 Million",
            "How many years did Nelson Rolihlahla Mandela spent in prison?",
            "Which prison was Nelson Mandela initially arrested ?"



    };

    private String mChoices[][] = {
            {"1914-1916","1914 –1918","1918-1919","1941-1981"},
            {"Barak Obama","Franklin Roosevelt","Martin Luther King Jr","Donald Trump"},
            {"1984","1994","1894","1944"},
            {"Vladimir Lenin","NicholasII","Adolf Hitler","Nicholas Nikolaevich"},
            {"Nelson Mandela","Thabo Mbeki","FW De klerk","Charles Robberts"},
            {"1861","1851","1994","1880"},
            {"Nelson Mandela","Thabo Mbeki","Jacob Zuma","Charles Robberts"},
            {"26years","72year","27months","27years"},
            {"VictorVersterPrison","Robben Island","Pollsmoor Prison","Boksburg Prison"}
    };

    private String mCorrectAnswers[] = {"1914 –1918","Martin Luther King Jr","1994","Adolf Hitler","Charles Robberts","1861","Jacob Zuma","27years","Robben Island"};





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

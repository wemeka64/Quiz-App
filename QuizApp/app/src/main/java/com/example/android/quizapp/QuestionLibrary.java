package com.example.android.quizapp;

public class QuestionLibrary {

    //Array of Questions
    private String mQuestions [] = {
            "By default in Android Studio during app development, the file that holds information about app's fundamental features and components is?",
            "By default in Android Studio during app development, the directory made for xml files is?",
            "The Android component that manages the app's configuration file is called",
            "Which of the following is not a type of Layout",
            "What is the full meaning of the acronym 'xml"

    };

    //Array of Multiple Choices
    private String mChoices [][]= {
            {"AndroidManifest.xml", "res/values" , "Build.gradle"},
            {"res/values", "res/layout", "AndroidManifest.xml"},
            {"manifest", "fragment", "view"},
            {"LinearLayout", "RelativeLayout", "CatLayout"},
            {"Extended Markup Language", "Extensible Markup Language", "Extensive Markup Language"}
    };

    //Array of correct answers
    private String mCorrectAnswers[] = {"AndroidManifest.xml", "res/values", "manifest", "CatLayout", "Extensible Markup Language"};

    //method returns number of questions
    public int getLength() {
        return mQuestions.length;
    }

    //Method returns question from array testQuestions{} based on array index
    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }

    //Methods return a single multiple choice based on array index
    public String getChoice1(int a){
        String choice0 = mChoices[a][0];
        return choice0;
    }

    public String getChoice2(int a){
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a){
        String choice2 = mChoices[a][2];
        return choice2;
    }

    //Method returns correct answer for question based on array index

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}

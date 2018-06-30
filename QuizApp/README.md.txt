Quiz App is a mobile application designed by uchegbu emeka walter as a requirement is completing the Udacity and ALC 7 days challenge.
This app contains 5 question with 3 alternatives to choose from.
activity_main.xml contains the xml layout for the questions and alternatives
All the questions, alternatives are contained in the QuestionLibrary.java ( the Bank).
The MainActivity.java contains the algorithm responsible for detecting if the choice chosen is correct or not and update new question from the Question Libray.
MainActivity.java is linked to another new activity called "aHighestScore" through a java algorithm known as Intent.
activity_a_highest_score.xml contains the xml layout for final result gotten from the test
aHighestScore contains java code that dispalys user score and compare with previous score to determine the highest score through the use of shared preferences.
it also contains the java code responsible to restart the quiz.

package ro.jademy.millionaire.model;

import java.util.ArrayList;
import java.util.List;

public class Question {

    private String text;
    private List<Answer> wrongAnswers = new ArrayList<>();     //the answers are also created as objects
    private Answer correctAnswer;
    private int difficulty;   //difficulty goes from 0 to 3. It's done for sorting out the questions.
     //it's easier to separate the answers(right form wrong ones) in this manner
    //this way i can easier sort them at 50/50 or when the contestant has answered correctly or not.


    public Question(String text, List<Answer> wrongAnswers, Answer correctAnswer, int difficulty) {
        this.text = text;
        this.wrongAnswers = wrongAnswers;
        this.correctAnswer = correctAnswer;
        this.difficulty=difficulty;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Answer> getWrongAnswers() {
        return wrongAnswers;
    }

    public void setWrongAnswers(List<Answer> wrongAnswers) {
        this.wrongAnswers = wrongAnswers;
    }

    public Answer getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(Answer correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }




}

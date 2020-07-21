package ro.jademy.millionaire.model;

import java.util.ArrayList;
import java.util.List;

public class Question {

    private String text;
    private List<Answer> wrongAnswers = new ArrayList<Answer>();     //raspunsurile sunt create si ele ca si obiecte
    private Answer correctAnswer;
    private int difficulty;

    //daca fac raspunsurile sub form asta mi-e mai simplu sa le separ si la 50:50 si in gneral sa le aranjez

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



    public int getDifficulty(){
        return difficulty;

    }

    public void setDifficulty(int difficulty){
        this.difficulty=difficulty;
    }

    ////adauga constructor si getter si setter


}

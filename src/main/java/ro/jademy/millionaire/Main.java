package ro.jademy.millionaire;

import ro.jademy.millionaire.data.QuestionProvider;
import ro.jademy.millionaire.model.Game;
import ro.jademy.millionaire.model.Question;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {


    public static void main(String[] args) {


        //////PASI RECOMANDATI

        // 1. define objects
        // define properties
        // define methods

        // 2. define interactions


        // 1. OBJECTS
        // Game
        // Questions
        // Answer
        // lEVEL (??MAYBE)
        // Player (depends, maybe??)


        //initialize questions
        List<Question> difficultyZeroQuestions = getRandom(5, 0);
        List<Question> difficultyOneQuestions = getRandom(5, 1);
        List<Question> difficultyTwoQuestions = getRandom(4, 2);
        List<Question> difficultyThreeQuestion = getRandom(1, 3);

        //start game
        Game game = new Game(difficultyZeroQuestions, difficultyOneQuestions, difficultyTwoQuestions, difficultyThreeQuestion);


 game.start();

    }


    private static List<Question> getRandom(int nrOfQuestions, int difficulty) {       //lista cu un anumit numar de intrebari si un anumit grad de dificultate
//loop through all questions
        //get all questions of given difficulty
        //loop through sub-List until number of questions and select random items by index

        //return said list
        Random random = new Random();
        List<Question> questionOfDifficulty = new ArrayList<>();
        List<Question> questionsRandom = new ArrayList<>();


        for (Question question : QuestionProvider.ALL_QUESTIONS) {             //a list with all the questions of the desired difficulty
            if (question.getDifficulty() == difficulty) {
                questionOfDifficulty.add(question);    //if the difficulty of the question equals the difficulty we're looking for, add it to the list
            }
        }

        for (int i = 0; i < nrOfQuestions; i++) {
            int randomIndex = random.nextInt(questionOfDifficulty.size());
            questionsRandom.add(questionOfDifficulty.remove(randomIndex));   //adds the removed question from the whole list to a new list (with a maximum of "nr of questions" size
            //remove index --- removes an object from the selected index
        }

        return questionsRandom;
    }
}

package ro.jademy.millionaire.model;

import com.sun.xml.internal.bind.v2.TODO;

import javax.swing.*;
import javax.xml.bind.SchemaOutputResolver;
import java.util.*;

public class Game {

    //15 levels

    //4 break points ->
    // level 1 [1,5] -> diff 0
    // level 2 [6,10] -> diff 1
    // level 3 [11,14] -> diff 2
    // level 4 [15] -> diff 3


    private static final List<Level> LEVELS = Arrays.asList(                          //lista de niveluri
            //lista asa de leveluri ramane mereu aceeasi --> STATICA FINAL (e constanta)
            new Level(1, 0, 100, 0),
            new Level(2, 0, 200, 0),
            new Level(3, 0, 500, 0),
            new Level(4, 0, 700, 0),
            new Level(5, 0, 1000, 0),
            new Level(6, 1, 2000, 1000),
            new Level(7, 1, 4000, 1000),
            new Level(8, 1, 8000, 1000),
            new Level(9, 1, 16000, 1000),
            new Level(10, 1, 32000, 1000),
            new Level(11, 2, 64000, 32000),
            new Level(12, 2, 125000, 32000),
            new Level(13, 2, 250000, 32000),
            new Level(14, 2, 500000, 32000),
            new Level(15, 3, 1000000, 500000)
    );

    //proprietatile unei instante de joc   (dar intrebarile in sine sunt diferite oe fiecare instanta)
    private List<Question> difficultyZeroQuestions = new ArrayList<>();
    private List<Question> difficultyOneQuestions = new ArrayList<>();
    private List<Question> difficultyTwoQuestions = new ArrayList<>();
    private List<Question> difficultyThreeQuestions = new ArrayList<>();

    private List<Lifeline> lifelines = new ArrayList<>();
    private Level currentLevel = LEVELS.get(0);       // pointeaza de fiecare data spre alt level (depinde unde ne aflam)


    public Game(List<Question> difficultyZeroQuestions, List<Question> difficultyOneQuestions, List<Question> difficultyTwoQuestions,
                List<Question> difficultyThreeQuestion) {
        //la fiecare joc difera  doar intrebarile, dar levelurile raman aceleasi, acelasi numar de lifelines. 
        // Practic parametrii pentru crearea unui nou joc sunt doar intrebarile
        this.difficultyZeroQuestions = difficultyZeroQuestions;
        this.difficultyOneQuestions = difficultyOneQuestions;
        this.difficultyTwoQuestions = difficultyTwoQuestions;
        this.difficultyThreeQuestions = difficultyThreeQuestion;

        lifelines.add(new Lifeline("50-50"));      //la lista de lifelines se adauga cate un element.
        lifelines.add(new Lifeline("50-50"));
        lifelines.add(new Lifeline("50-50"));
    }


    public void start() { // TODO: 8/1/2020
        //show welcome screen
        //optionally: show rules(rounds, lifelines etc) & commands
        //optionally: show available lifelines

        // FOR
        //show CURRENT level question
        //read command from player
        //       - if lifeline ->apply lifeline            (pot sa pun o litera pt fiecare optiune pe care o introduce utilizatorul de la tastatura
        //        - if end game -> end game
        //       - read answer -> check answer
        //                   - if answer correct -> go to next level (set next level as current, set amount of money etc)
        //                   - if answer incorrect -> end game (calculate end sum, show bye bye message)


        showWelcome();
        showRules();
        showQuestion();


        //show question
        //get answer ---- in a do while


        //let's assume user respondd with apply lifeline
        // do all validation beforehand;
    }

    private void showWelcome() {

        System.out.println("Welcome to Who Wants to be a Millionaire");
    }

    private void showRules() {
        System.out.println("Show answer, win money");
    }


    private void  showQuestion() {
        Question question;           //all of these are done for the same question (the same object)
        List<Answer> allAnswers;
        switch (currentLevel.getDifficultyLevel()) {     //according to the difficulty of the level it will return question
            case 0:
                question=difficultyZeroQuestions.get(0);     //always get the first in the list (they are already randomized
                allAnswers=printQuestion(question);          //prints the shuffles answers of the question
                System.out.println();
                System.out.println("Applying lifeline");
                //todo
                //let's assume that the user responded with apply lifeline
                //do all valodation beforehand
                applyLifeline(lifelines.get(0),allAnswers,question.getCorrectAnswer());
                break;

            case 1:
                question=difficultyZeroQuestions.get(1);     //always get the first in the list (they are already randomized
                allAnswers=printQuestion(question);          //prints the shuffles answers of the question
                System.out.println();
                System.out.println("Applying lifeline");
                //todo
                //let's assume that the user responded with apply lifeline
                //do all valodation beforehand
                applyLifeline(lifelines.get(0),allAnswers,question.getCorrectAnswer());
                break;

            case 2:
                question=difficultyZeroQuestions.get(2);     //always get the first in the list (they are already randomized
                allAnswers=printQuestion(question);          //prints the shuffles answers of the question
                System.out.println();
                System.out.println("Applying lifeline");
                //todo
                //let's assume that the user responded with apply lifeline
                //do all valodation beforehand
                applyLifeline(lifelines.get(0),allAnswers,question.getCorrectAnswer());
                break;

            case 3:
                question=difficultyZeroQuestions.get(3);     //always get the first in the list (they are already randomized
                allAnswers=printQuestion(question);          //prints the shuffles answers of the question
                System.out.println();
                System.out.println("Applying lifeline");
                //todo
                //let's assume that the user responded with apply lifeline
                //do all valodation beforehand
                applyLifeline(lifelines.get(0),allAnswers,question.getCorrectAnswer());
                break;

            default:
                System.out.println("Unknown difficulty level");
               break;
        }
    }

    private List<Answer> printQuestion(Question question) {       //this is for randomizing the answers and it returns a list of answers
        System.out.println(question.getText());     //it shows the question
        System.out.println();

        List<Answer> allAnswers = new ArrayList<>(question.getWrongAnswers());      //constructor de liste ---cumva adaugam lista aia cand creem lista noua
        allAnswers.add(question.getCorrectAnswer());
        //randomize list
        //we're creating a list with all the answers, right and wrong. Then we're transforming it in a collection, where we can shuffle all the answers.
        Collections.shuffle(allAnswers);    //amesteca toate elementele unei liste
        //e void, nu returneaza ceva anume. Practic are efecte asupra obiectului initial,
        // nu intoarce un nou obiect

        for (int i = 0; i < allAnswers.size(); i++) {
            System.out.println(((char) (65 + i)) + "." + allAnswers.get(i).getText());            //65 e"A"  --> se converteste la char
        }

        return allAnswers;
    }


    private void applyLifeline(Lifeline lifeline, List<Answer> allAnswers,Answer correctAnswer) {
        if (lifeline.getName().equals("50-50")){
            //print all answers EXCEPT two random WRONG answers
            Random random=new Random();

            List<Answer> answerListCopy=new ArrayList<>(allAnswers); //a new list that replicates the list with all the answers (we don't want to lose the first one
            answerListCopy.remove(correctAnswer);   //in lista cu allAnswers noi am apucat sa-l bagam si pe cel corect (vezi la print question) -il scoatem acum, ca ne trebuie mia incolo
            answerListCopy.remove(random.nextInt(answerListCopy.size()));   //remove a random object from an index
            answerListCopy.remove(random.nextInt(answerListCopy.size()));   //remove a random object from an index


            for (int i=0; i<allAnswers.size();i++){
                Answer answer=allAnswers.get(i);     //it reads the answer from the specified index

                if(answer.equals(correctAnswer)||answerListCopy.contains(answer)){
                    //the answerListCopy contains just one WRONG answer right now. we need to print that one and the right answer.
                    // If either one of them is equal to the answer from index "i" we're gonna print it
                    System.out.println(((char) (65 + i)) + "." + allAnswers.get(i).getText());
                }else{
                    System.out.println(((char) (65 + i)) + ".");
                }
            }
        }
        lifeline.setUsed(true);    //if lifeline is applied it's gonna become "used".
    }
}

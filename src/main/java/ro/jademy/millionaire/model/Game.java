package ro.jademy.millionaire.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        //la fiecare joc difera  doar intrebarile, dar levelurile raman aceleasi, acelasi numar de lifelines. Practic parametrii
        // entru crearea unuinjoc sunt doar intrebarile
        this.difficultyZeroQuestions = difficultyZeroQuestions;
        this.difficultyOneQuestions = difficultyOneQuestions;
        this.difficultyTwoQuestions = difficultyTwoQuestions;
        this.difficultyThreeQuestions = difficultyThreeQuestion;

       lifelines.add(new Lifeline("50-50"));      //la lista de lifelines se adauga cate un element.
       lifelines.add(new Lifeline("50-50"));
       lifelines.add(new Lifeline("50-50"));
    }


    public List<Question> getDifficultyZeroQuestions(){

    }


}

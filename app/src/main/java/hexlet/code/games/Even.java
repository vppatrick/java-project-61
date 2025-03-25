package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Even {
    public static final int COUNT_OF_STEP_GAME = Engine.COUNT_OF_STEP_GAME;
    public static final int RANDOM_UPPER_LIMIT = 100;
    private static final Random RANDOM = new Random();

    public static void startGame() {
        String instruction = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] questionsAndAnswer = new String[COUNT_OF_STEP_GAME][2];

        for (int i = 0; i < COUNT_OF_STEP_GAME; i++) {
            int number = RANDOM.nextInt(RANDOM_UPPER_LIMIT);
            questionsAndAnswer[i][0] = Integer.toString(number);
            if (number % 2 == 0) {
                questionsAndAnswer[i][1] = "yes";
            } else {
                questionsAndAnswer[i][1] = "no";
            }
        }
        Engine.start(instruction, questionsAndAnswer);
    }
}

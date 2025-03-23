package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Even {
    public static final int COUNT_OF_STEP_GAME = 3;
    public static final int RANDOM_UPPER_LIMIT = 100;
    private static final Random random = new Random();
    public static void startGame() {
        String instruction = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[] questions = new String[COUNT_OF_STEP_GAME];
        String[] answers = new String[COUNT_OF_STEP_GAME];

        for (int i = 0; i < COUNT_OF_STEP_GAME; i++) {
            int number = random.nextInt(RANDOM_UPPER_LIMIT);
            questions[i] = Integer.toString(number);
            if (number % 2 == 0) {
                answers[i] = "yes";
            } else {
                answers[i] = "no";
            }
        }
        Engine.start(instruction, questions, answers);
    }
}

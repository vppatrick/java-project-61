package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Progression {
    public static final int COUNT_OF_STEP_GAME = 3;
    public static final int RANDOM_UPPER_LIMIT = 91;
    public static final int MIN_RANDOM_NUMBER = 5;
    public static final int MAX_RANDOM_NUMBER = 10;
    private static final Random random = new Random();
    public static void startGame() {
        String instruction = "What number is missing in the progression?";
        String[] questions = new String[COUNT_OF_STEP_GAME];
        String[] answers = new String[COUNT_OF_STEP_GAME];


        for (int i = 0; i < COUNT_OF_STEP_GAME; i++) {
            int length = random.nextInt(MAX_RANDOM_NUMBER - MIN_RANDOM_NUMBER + 1) + MIN_RANDOM_NUMBER;

            int increment = random.nextInt(MAX_RANDOM_NUMBER - MIN_RANDOM_NUMBER) + 2;

            String[] progression = new String[length];

            int indexOfHiddenItem = random.nextInt(length);

            int initValue = random.nextInt(RANDOM_UPPER_LIMIT) + 2;
            progression[0] = Integer.toString(initValue);

            for (int j = 1; j < length; j++) {
                progression[j] = Integer.toString(Integer.parseInt(progression[j - 1]) + increment);
            }
            answers[i] = progression[indexOfHiddenItem];
            progression[indexOfHiddenItem] = "..";
            questions[i] = String.join(" ", progression);
        }
        Engine.start(instruction, questions, answers);
    }
}

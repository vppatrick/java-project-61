package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Progression {
    public static final int COUNT_OF_STEP_GAME = Engine.COUNT_OF_STEP_GAME;
    public static final int RANDOM_UPPER_LIMIT = 91;
    public static final int MIN_RANDOM_NUMBER = 5;
    public static final int MAX_RANDOM_NUMBER = 10;
    private static final Random RANDOM = new Random();

    private static String[] getProgression(int initValue, int increment, int length) {

        String[] result = new String[length];
        result[0] = Integer.toString(initValue);

        for (int i = 1; i < length; i++) {
            result[i] = Integer.toString(Integer.parseInt(result[i - 1]) + increment);
        }
        return result;
    }

    public static void startGame() {
        String instruction = "What number is missing in the progression?";
        String[][] questionsAndAnswer = new String[COUNT_OF_STEP_GAME][2];

        for (int i = 0; i < COUNT_OF_STEP_GAME; i++) {
            int initValue = RANDOM.nextInt(RANDOM_UPPER_LIMIT) + 2;
            int increment = RANDOM.nextInt(MAX_RANDOM_NUMBER - MIN_RANDOM_NUMBER) + 2;
            int length = RANDOM.nextInt(MAX_RANDOM_NUMBER - MIN_RANDOM_NUMBER + 1) + MIN_RANDOM_NUMBER;
            String[] progression = getProgression(initValue, increment, length);
            int indexOfHiddenItem = RANDOM.nextInt(progression.length);

            questionsAndAnswer[i][1] = progression[indexOfHiddenItem];
            progression[indexOfHiddenItem] = "..";
            questionsAndAnswer[i][0] = String.join(" ", progression);
        }
        Engine.start(instruction, questionsAndAnswer);
    }
}

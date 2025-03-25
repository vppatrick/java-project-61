package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class GCD {
    public static final int COUNT_OF_STEP_GAME = Engine.COUNT_OF_STEP_GAME;
    public static final int RANDOM_UPPER_LIMIT = 100;
    private static final Random RANDOM = new Random();

    private static int calcGCD(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : calcGCD(b, a % b);
    }

    public static void startGame() {
        String instruction = "Find the greatest common divisor of given numbers.";
        String[][] questionsAndAnswer = new String[COUNT_OF_STEP_GAME][2];

        for (int i = 0; i < COUNT_OF_STEP_GAME; i++) {
            int number1 = RANDOM.nextInt(RANDOM_UPPER_LIMIT);
            int number2 = RANDOM.nextInt(RANDOM_UPPER_LIMIT);
            questionsAndAnswer[i][0] = number1 + " " + number2;
            questionsAndAnswer[i][1] = Integer.toString(calcGCD(number1, number2));
        }
        Engine.start(instruction, questionsAndAnswer);
    }
}

package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class GCD {
    public static final int COUNT_OF_STEP_GAME = 3;
    public static final int RANDOM_UPPER_LIMIT = 100;
    private static final Random random = new Random();
    private static int calcGCD(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : calcGCD(b, a % b);
    }
    public static void startGame() {
        String instruction = "Find the greatest common divisor of given numbers.";
        String[] questions = new String[COUNT_OF_STEP_GAME];
        String[] answers = new String[COUNT_OF_STEP_GAME];

        for (int i = 0; i < COUNT_OF_STEP_GAME; i++) {
            int number1 = random.nextInt(RANDOM_UPPER_LIMIT);
            int number2 = random.nextInt(RANDOM_UPPER_LIMIT);
            questions[i] = number1 + " " + number2;
            answers[i] = Integer.toString(calcGCD(number1, number2));
        }
        Engine.start(instruction, questions, answers);
    }
}

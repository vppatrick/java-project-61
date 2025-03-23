package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Prime {
    public static final int COUNT_OF_STEP_GAME = 3;
    public static final int RANDOM_UPPER_LIMIT = 41;
    private static final Random random = new Random();
    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void startGame() {
        String instruction = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[] questions = new String[COUNT_OF_STEP_GAME];
        String[] answers = new String[COUNT_OF_STEP_GAME];

        for (int i = 0; i < COUNT_OF_STEP_GAME; i++) {
            int number = random.nextInt(RANDOM_UPPER_LIMIT) + 1;
            questions[i] = Integer.toString(number);
            if (isPrime(number)) {
                answers[i] = "yes";
            } else {
                answers[i] = "no";
            }
        }
        Engine.start(instruction, questions, answers);
    }
}

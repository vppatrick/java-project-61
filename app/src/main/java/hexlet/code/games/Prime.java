package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Prime {
    public static final int COUNT_OF_STEP_GAME = Engine.COUNT_OF_STEP_GAME;
    public static final int RANDOM_UPPER_LIMIT = 41;
    private static final Random RANDOM = new Random();

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
        String[][] questionsAndAnswer = new String[COUNT_OF_STEP_GAME][2];

        for (int i = 0; i < COUNT_OF_STEP_GAME; i++) {
            int number = RANDOM.nextInt(RANDOM_UPPER_LIMIT) + 1;
            questionsAndAnswer[i][0] = Integer.toString(number);
            if (isPrime(number)) {
                questionsAndAnswer[i][1] = "yes";
            } else {
                questionsAndAnswer[i][1] = "no";
            }
        }
        Engine.start(instruction, questionsAndAnswer);
    }
}

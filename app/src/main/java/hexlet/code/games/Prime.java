package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Prime {
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
        Random random = new Random();
        String[] questions = new String[3];
        String[] answers = new String[3];
        for (int i = 0; i < 3; i++) {
            int number = random.nextInt(41) + 1;
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

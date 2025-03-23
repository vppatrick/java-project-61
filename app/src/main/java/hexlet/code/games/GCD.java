package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class GCD {
    private static int calcGCD(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : calcGCD(b, a % b);
    }
    public static void startGame() {
        String instruction = "Find the greatest common divisor of given numbers.";
        Random random = new Random();
        int count = 3;
        String[] questions = new String[count];
        String[] answers = new String[count];

        int limit = 100;
        for (int i = 0; i < count; i++) {
            int number1 = random.nextInt(limit);
            int number2 = random.nextInt(limit);
            questions[i] = number1 + " " + number2;
            answers[i] = Integer.toString(calcGCD(number1, number2));
        }
        Engine.start(instruction, questions, answers);
    }
}

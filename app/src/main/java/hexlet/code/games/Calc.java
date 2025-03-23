package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    public static final int COUNT_OF_STEP_GAME = 3;
    public static final int RANDOM_UPPER_LIMIT = 10;
    private static final Random random = new Random();
    public static void startGame() {
        String instruction = "What is the result of the expression?";
        String[] questions = new String[COUNT_OF_STEP_GAME];
        String[] answers = new String[COUNT_OF_STEP_GAME];
        Character[] ops = {'+', '-', '*'};

        for (int i = 0; i < COUNT_OF_STEP_GAME; i++) {
            int number1 = random.nextInt(RANDOM_UPPER_LIMIT);
            int number2 = random.nextInt(RANDOM_UPPER_LIMIT);
            int index = random.nextInt(COUNT_OF_STEP_GAME);
            questions[i] = number1 + " " + ops[index] + " " + number2;

            int result = 0;
            switch (ops[index]) {
                case '+': result = number1 + number2; break;
                case '-': result = number1 - number2; break;
                case '*': result = number1 * number2; break;
                default: break;
            }
            answers[i] = Integer.toString(result);
        }
        Engine.start(instruction, questions, answers);
    }
}

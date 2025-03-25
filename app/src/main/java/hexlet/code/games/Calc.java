package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    public static final int COUNT_OF_STEP_GAME = Engine.COUNT_OF_STEP_GAME;
    public static final int RANDOM_UPPER_LIMIT = 10;
    private static final Random RANDOM = new Random();

    private static int getResult(int a, int b, char op) {
        int result = 0;
        switch (op) {
            case '+': result = a + b; break;
            case '-': result = a - b; break;
            case '*': result = a * b; break;
            default: break;
        }
        return result;
    }

    public static void startGame() {
        String instruction = "What is the result of the expression?";
        String[][] questionsAndAnswer = new String[COUNT_OF_STEP_GAME][2];
        Character[] ops = {'+', '-', '*'};

        for (int i = 0; i < COUNT_OF_STEP_GAME; i++) {
            int number1 = RANDOM.nextInt(RANDOM_UPPER_LIMIT);
            int number2 = RANDOM.nextInt(RANDOM_UPPER_LIMIT);
            int index = RANDOM.nextInt(ops.length);
            questionsAndAnswer[i][0] = number1 + " " + ops[index] + " " + number2;
            questionsAndAnswer[i][1] = Integer.toString(getResult(number1, number2, ops[index]));
        }
        Engine.start(instruction, questionsAndAnswer);
    }
}

package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    public static void startGame() {
        String instruction = "What is the result of the expression?";
        Random random = new Random();
        int count = 3;
        String[] questions = new String[count];
        String[] answers = new String[count];
        Character[] ops = {'+', '-', '*'};

        int limit = 10;
        for (int i = 0; i < count; i++) {
            int number1 = random.nextInt(limit);
            int number2 = random.nextInt(limit);
            int index = random.nextInt(count);
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

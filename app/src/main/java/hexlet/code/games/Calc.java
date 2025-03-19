package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static void startGame() {
        String instruction = "What is the result of the expression?";
        Random random = new Random();
        String[] questions = new String[3];
        String[] answers = new String[3];
        Character[] ops = {'+', '-', '*'};

        for (int i = 0; i < 3; i++) {
            int number1 = random.nextInt(10);
            int number2 = random.nextInt(10);
            int index = random.nextInt(3);
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

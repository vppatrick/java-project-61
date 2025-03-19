package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Even {
    public static void startGame() {
        String instruction = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Random random = new Random();
        String[] questions = new String[3];
        String[] answers = new String[3];
        for (int i = 0; i < 3; i++) {
            int number = random.nextInt(100);
            questions[i] = Integer.toString(number);
            if (number % 2 == 0) {
                answers[i] = "yes";
            } else {
                answers[i] = "no";
            }
        }
        Engine.start(instruction, questions, answers);
    }
}

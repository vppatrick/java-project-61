package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Even {
    public static void startGame() {
        String instruction = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Random random = new Random();
        int count = 3;
        String[] questions = new String[count];
        String[] answers = new String[count];

        int limit = 100;
        for (int i = 0; i < 3; i++) {
            int number = random.nextInt(limit);
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

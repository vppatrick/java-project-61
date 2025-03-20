package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Progression {
    public static void startGame() {
        String instruction = "What number is missing in the progression?";
        Random random = new Random();
        String[] questions = new String[3];
        String[] answers = new String[3];

        for (int i = 0; i < 3; i++) {
            int min = 5;
            int max = 10;
            int length = random.nextInt(max - min + 1) + min;

            int increment = random.nextInt(5) + 2;

            String[] progression = new String[length];

            int indexOfHiddenItem = random.nextInt(length);

            int initValue = random.nextInt(90) + 2;
            progression[0] = Integer.toString(initValue);

            for (int j = 1; j < length; j++) {
                progression[j] = Integer.toString(Integer.parseInt(progression[j - 1]) + increment);
            }
            answers[i] = progression[indexOfHiddenItem];
            progression[indexOfHiddenItem] = "..";
            questions[i] = String.join(" ", progression);
        }
        Engine.start(instruction, questions, answers);
    }
}

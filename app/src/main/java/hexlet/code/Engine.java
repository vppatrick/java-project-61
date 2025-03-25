package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int COUNT_OF_STEP_GAME = 3;

    public static void start(String instruction, String[][] questionsAndAnswers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String username = scanner.next();
        System.out.println("Hello, " + username + "!");
        System.out.println(instruction);

        for (int i = 0; i < COUNT_OF_STEP_GAME; i++) {
            System.out.println("Question: " + questionsAndAnswers[i][0]);
            System.out.print("Your answer: ");
            String answer = scanner.next();

            if (answer.equals(questionsAndAnswers[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + questionsAndAnswers[i][1] + "'.");
                System.out.println("Let's try again, " + username + "!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + username + "!");
        scanner.close();
    }
}

package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void start(String instruction, String[] questions, String[] answers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String username = scanner.next();
        System.out.println("Hello, " + username + "!");
        System.out.println(instruction);

        for (int i = 0; i < 3; i++) {
            System.out.println("Question: " + questions[i]);
            System.out.print("Your answer: ");
            String answer = scanner.next();

            if (answer.equals(answers[i])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + answers[i] + "'.");
                System.out.println("Let's try again, " + username + "!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + username + "!");
        scanner.close();
    }
}

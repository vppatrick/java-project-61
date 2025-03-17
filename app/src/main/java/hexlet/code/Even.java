package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Even {
    public static void startGame(Scanner scanner) {
        String username = Cli.greeting(scanner);
        Random random = new Random();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (var i = 0; i < 3; i++) {
            int randomNumber = random.nextInt(100);
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String answer = scanner.next();

            if (randomNumber % 2 == 0) {
                if (answer.equals("yes")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'yes'.");
                    System.out.println("Let's try again, " + username);
                    System.exit(0);
                }
            }
            if (randomNumber % 2 != 0) {
                if (answer.equals("no")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'no'.");
                    System.out.println("Let's try again, " + username);
                    System.exit(0);
                }
            }
        }
        System.out.println("Congratulations, " + username);
    }
}

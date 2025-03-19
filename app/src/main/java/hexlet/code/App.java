package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter."
                + "\n1 - Greet"
                + "\n2 - Even"
                + "\n3 - Calc"
                + "\n0 - Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice: ");
        String numOfGame = scanner.next();
        switch (numOfGame) {
            case "1":
                Cli.greeting();
                break;
            case "2":
                Even.startGame();
                break;
            case "3":
                Calc.startGame();
                break;
            default:
                System.exit(0);
                break;
        }
        scanner.close();
    }
}

package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter."
                + "\n1 - Greet"
                + "\n2 - Even"
                + "\n0 - Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice: ");
        String numOfGame = scanner.next();
        String username;
        switch (numOfGame) {
            case "1":
                username = Cli.greeting(scanner);
                break;
            case "2":
                Even.startGame(scanner);
                break;
            default:
                System.exit(0);
                break;
        }
        scanner.close();
    }
}

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        OutputComments.greetings();

        int gameChosen = Utils.correctIntInputLimit(scanner.nextLine());

        boolean gameTime = true;

        while (gameTime) {

            switch (gameChosen) {
                case 1: // Simple game
                    break;
                case 2: // game with limited turns
                    break;
                case 3: // game with player's set limit for the top number
                    break;
            }


        }
        String anotherGame = "";

        while (!anotherGame.equals("no")) {

            if (input.equals("no")) {
                noLimit();
            } else {
                limitedGame();
            }

            System.out.println("Do you want to try again?");
            anotherGame = scanner.nextLine().toLowerCase();
            while (!anotherGame.equals("yes") && !anotherGame.equals("no")) {
                System.out.println("yes or no, please");
                anotherGame = scanner.nextLine();
            }
        }

        System.out.println("Ok, it was nice playing with you.");

    }

    public static void noLimit() {
        Random random = new Random(); // Done
        Scanner scanner = new Scanner(System.in); // Done
        int computersNumber = random.nextInt(100) + 1; // Done

        boolean guessed = false;  // TODO
        String regex = "\\b(?<number>[0-9]{1,2}[0-9]?)\\b"; // TODO
        Pattern pattern = Pattern.compile(regex); // TODO


        while (!guessed) {
            System.out.print("The number is between 1 and 100. Guess which one it is: ");
            String playerGuessStr = scanner.nextLine();
            Matcher matcher = pattern.matcher(playerGuessStr);
            if (!matcher.find()) {
                System.out.println("invalid number or...whatever you wrote. You can only write numbers between 1-999");
                continue;
            }
            int playerGuess = Integer.parseInt(playerGuessStr);
            if (playerGuess == computersNumber) {
                guessed = true;
            } else if (playerGuess > 100) {
                System.out.println("The upper bound is 100.");
            } else if (playerGuess < computersNumber) {
                System.out.println("The computer have chosen a greater number than your guess.");
            } else {
                System.out.println("The computer's number is lower than the one you guessed.");
            }
        }
        String output = "Well done! The number was " + computersNumber + "!";
        System.out.println(output);
    }

    public static void limitedGame() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int computersNumber = random.nextInt(100);
        int moves = random.nextInt(3, 7);
        String regex = "\\b(?<number>[0-9]{1,2}[0-9]?)\\b";
        Pattern pattern = Pattern.compile(regex);
        boolean guessed = false;
        for (int i = 1; i <= moves; i++) {
            System.out.print("The number is between 1 and 100. Guess which one it is. ");
            System.out.println("You have " + (moves - (i - 1)) + " moves to guess it.");
            String playerGuessStr = scanner.nextLine();
            Matcher matcher = pattern.matcher(playerGuessStr);
            while (!matcher.find()) {
                System.out.println("invalid number or...whatever you wrote. You can only write numbers between 1-999");
                playerGuessStr = scanner.nextLine();
                matcher = pattern.matcher(playerGuessStr);
            }
            int playerGuess = Integer.parseInt(playerGuessStr);
            if (playerGuess == computersNumber) {
                System.out.println("Nice! You have guessed it and only needed " + i + " moves.");
                guessed = true;
                break;
            } else if (playerGuess > 100) {
                System.out.println("The upper bound is 100.");
            } else if (playerGuess < computersNumber) {
                System.out.println("The computer have chosen a greater number than your guess.");
            } else {
                System.out.println("The computer's number is lower than the one you guessed.");
            }
        }
        if (!guessed) {
            System.out.println("Unlucky. Next time! The number was " + computersNumber);
        }
    }
}

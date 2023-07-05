package Games;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import utilities.Utils;
import utilities.OutputComments;

public abstract class Game {

    public static final int NUMBER_OF_GAMES = 3;

     Random random;

     Scanner scanner;

     int limitNumber;

     int randomNumber;

     int currentNumber;

     Set<Integer> guessedNumbers;

     public Game() {
         this.random = new Random();
         this.scanner = new Scanner(System.in);
         this.limitNumber = 100;
         this.randomNumber = random.nextInt(limitNumber) + 1;
         guessedNumbers = new HashSet<>();
     }



    public void play () {

        System.out.println("What number did the computer picked? It is between 1 and " + limitNumber);

        String input = scanner.nextLine();

        boolean correctGuess = false;

        while (!correctGuess) {

            while (!Utils.correctIntInput(input)) {
                System.out.println("The input should be a number between 1 and " + limitNumber);
            }

            currentNumber = Integer.parseInt(input);

            if (numberAlreadyGuessed(currentNumber)) {
                OutputComments.numberAlreadyGuessed(currentNumber);
            } else if (currentNumber == randomNumber) {
                OutputComments.correctGuess(currentNumber, guessedNumbers.size() + 1);
                correctGuess = true;
            } else {
                OutputComments.incorrectGuess(currentNumber, randomNumber);
                guessedNumbers.add(currentNumber);
            }
            input = scanner.nextLine();
        }
    }

    boolean numberAlreadyGuessed(int num) {
         return guessedNumbers.contains(num);
    }
}

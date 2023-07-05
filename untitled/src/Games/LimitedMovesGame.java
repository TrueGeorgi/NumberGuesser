package Games;

import utilities.OutputComments;
import utilities.Utils;

public class LimitedMovesGame extends Game {

    private int turns;

    public LimitedMovesGame(int movesLimit) {
        super();
        this.turns = movesLimit;
    }

    @Override
    public void play() {

        System.out.println("What number did the computer picked? It is between 1 and " + limitNumber);

        String input = scanner.nextLine();

        while (turns > 0) {

            while (!Utils.correctIntInput(input)) {
                System.out.println("The input should be a number between 1 and " + limitNumber);
            }

            currentNumber = Integer.parseInt(input);

            if (numberAlreadyGuessed(currentNumber)) {
                OutputComments.numberAlreadyGuessed(currentNumber);
            } else if (currentNumber == randomNumber) {
                OutputComments.correctGuess(currentNumber, guessedNumbers.size() + 1);
                break;
            } else {
                OutputComments.incorrectGuess(currentNumber, randomNumber);
                guessedNumbers.add(currentNumber);
            }

            turns--;
            input = scanner.nextLine();
        }

        if (turns == 0) {
            OutputComments.outOfTurns();
        }

    }
}

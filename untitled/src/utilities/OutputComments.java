package utilities;

public class OutputComments {

    public static void greetings () {
        System.out.println("Hi there! Which type of game would you like to play?");
        System.out.println("1. Simple game");
        System.out.println("2. Limited moves game");
        System.out.println("3. \"Set your own Max number\" game");
    }

    public static void anotherGame () {
        System.out.println("Would you like to play another game?");
    }

    public static void correctGuess (int number, int tries) {
        System.out.printf("Bravo!!! the number was indeed %d. You guess it correctly from the %d try.\n", number, tries);
    }

    public static void incorrectGuess (int numberGuessed, int numberComputer) {

        String mainOutput = "The number you guessed is incorrect. Try a ";

        if (numberGuessed < numberComputer) {
            System.out.printf("%s smaller number.\n", mainOutput);
        } else {
            System.out.printf("%s bigger number\n", mainOutput);
        }
    }

    public static void numberAlreadyGuessed (int num) {
        System.out.println("You have already tried with " + num + ". Try with another number.");
    }

    public static void outOfTurns () {
        // TODO output comment for out of turns.
    }
}

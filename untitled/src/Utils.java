import Games.Game;

import java.util.Scanner;

public class Utils {

    private final static String TRY_AGAIN = "Incorrect input. Try again.";

    public static String yesOrNoInput(String input) {

        input = input.toLowerCase();

        boolean correctInput = false;

        while (!correctInput) {

            if (input.length() < 1) {
                System.out.println(TRY_AGAIN);
                input = repeatInput().toLowerCase();
            } else {
                if (!input.equals("yes") && !input.equals("no")) {
                    System.out.println(TRY_AGAIN);
                    input = repeatInput().toLowerCase();
                } else {
                    correctInput = true;
                }
            }
        }

      return input;
    }

    private static String repeatInput() {
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();
    }

    public static boolean correctIntInput (String input) {
        return input.matches("\\d+");
    }

    public static int correctIntInputLimit (String input) {
        if (correctIntInput(input)) {
            int inputInt = Integer.parseInt(input);
            if (inputInt > 0 && inputInt <= Game.NUMBER_OF_GAMES) {
                return Integer.parseInt(input);
            } else {
                throw new IndexOutOfBoundsException("You had to chose a number between 1 and " + Game.NUMBER_OF_GAMES + ".");
            }
        }
        throw new IllegalArgumentException("The input had to be a number.");
    }

    public boolean
}

package Games;

import java.util.Random;
import java.util.Scanner;

public abstract class Game {

    public static final int NUMBER_OF_GAMES = 3;

     Random random;

     Scanner scanner;

     int limitNumber;

     int randomNumber;

     int turns;

     public Game() {
         this.random = new Random();
         this.scanner = new Scanner(System.in);
         this.limitNumber = 100;
         this.randomNumber = random.nextInt(limitNumber) + 1;
         this.turns = Integer.MAX_VALUE;
     }



    public void play () {

    }
}

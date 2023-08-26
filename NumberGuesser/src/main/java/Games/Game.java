package Games;

import java.util.Random;

public abstract class Game {

    private static final int LIMIT = 100;

    private String name;
    private Random random;

    private 

    // CONSTRUCTORS
    public Game(String name) {
        this.name = name;
        random = new Random();
    }

//    GETTERS

    public int getRandomInt() {
        return random.nextInt(LIMIT);
    }
}

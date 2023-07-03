package Games;

import java.util.Random;
import java.util.Scanner;

public class LimitedMovesGame extends Game {

    public LimitedMovesGame (int movesLimit) {
        super();
        this.turns = movesLimit;
    }
}

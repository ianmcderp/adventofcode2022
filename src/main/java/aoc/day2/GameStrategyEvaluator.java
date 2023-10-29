package aoc.day2;

import static aoc.day2.Shape.*;

public class GameStrategyEvaluator {
    public static int evaluate(GameStrategy gameStrategy) {
        return evaluateSelectionScore(gameStrategy.getMyShape(), gameStrategy.getTheirShape());
    }

    private static int evaluateSelectionScore(Shape myShape, Shape theirShape) {
        if (myShape == MY_ROCK && theirShape == THEIR_PAPER) return 1;
        if (myShape == MY_ROCK && theirShape == THEIR_ROCK) return 4;
        if (myShape == MY_ROCK && theirShape == THEIR_SCISSOR) return 7;

        if (myShape == MY_PAPER && theirShape == THEIR_SCISSOR) return 2;
        if (myShape == MY_PAPER && theirShape == THEIR_PAPER) return 5;
        if (myShape == MY_PAPER && theirShape == THEIR_ROCK) return 8;

        if (myShape == MY_SCISSOR && theirShape == THEIR_ROCK) return 3;
        if (myShape == MY_SCISSOR && theirShape == THEIR_SCISSOR) return 6;
            // if (myShape == MY_SCISSOR && theirShape == THEIR_PAPER) return 6;
        else return 9;
    }
}

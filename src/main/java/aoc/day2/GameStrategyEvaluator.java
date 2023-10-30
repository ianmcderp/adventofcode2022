package aoc.day2;

import static aoc.day2.Result.*;
import static aoc.day2.Shape.*;

public class GameStrategyEvaluator {
    public static int evaluateByPairs(GameStrategy gameStrategy) {
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

    public static int evaluateByResult(GamePlan gamePlan) {
        return evaluateByResult(gamePlan.getResult(), gamePlan.getTheirShape());
    }

    private static int evaluateByResult(Result result, Shape theirShape) {
        if (result == WIN && theirShape == THEIR_ROCK) return evaluateSelectionScore(MY_PAPER, THEIR_ROCK);
        if (result == DRAW && theirShape == THEIR_ROCK) return evaluateSelectionScore(MY_ROCK, THEIR_ROCK);
        if (result == LOSS && theirShape == THEIR_ROCK) return evaluateSelectionScore(MY_SCISSOR, THEIR_ROCK);

        if (result == WIN && theirShape == THEIR_PAPER) return evaluateSelectionScore(MY_SCISSOR, THEIR_PAPER);
        if (result == DRAW && theirShape == THEIR_PAPER) return evaluateSelectionScore(MY_PAPER, THEIR_PAPER);
        if (result == LOSS && theirShape == THEIR_PAPER) return evaluateSelectionScore(MY_ROCK, THEIR_PAPER);

        if (result == WIN && theirShape == THEIR_SCISSOR) return evaluateSelectionScore(MY_ROCK, THEIR_SCISSOR);
        if (result == DRAW && theirShape == THEIR_SCISSOR) return evaluateSelectionScore(MY_SCISSOR, THEIR_SCISSOR);
        // if (result == LOSS && theirShape == THEIR_SCISSOR) return evaluateSelectionScore(MY_PAPER, THEIR_SCISSOR);
        return evaluateSelectionScore(MY_PAPER, THEIR_SCISSOR);
    }
}

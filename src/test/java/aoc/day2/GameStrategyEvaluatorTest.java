package aoc.day2;

import org.junit.jupiter.api.Test;

import static aoc.day2.Result.*;
import static aoc.day2.Shape.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameStrategyEvaluatorTest {
    @Test
    void givenAllCombinations_whenEvaluate_thenVerifyThatScoreIsCorrect() {
        assertEquals(1, evaluateByShapes(MY_ROCK, THEIR_PAPER));
        assertEquals(4, evaluateByShapes(MY_ROCK, THEIR_ROCK));
        assertEquals(7, evaluateByShapes(MY_ROCK, THEIR_SCISSOR));
        assertEquals(2, evaluateByShapes(MY_PAPER, THEIR_SCISSOR));
        assertEquals(5, evaluateByShapes(MY_PAPER, THEIR_PAPER));
        assertEquals(8, evaluateByShapes(MY_PAPER, THEIR_ROCK));
        assertEquals(3, evaluateByShapes(MY_SCISSOR, THEIR_ROCK));
        assertEquals(6, evaluateByShapes(MY_SCISSOR, THEIR_SCISSOR));
        assertEquals(9, evaluateByShapes(MY_SCISSOR, THEIR_PAPER));
    }

    private int evaluateByShapes(Shape myShape, Shape theirShape) {
        return GameStrategyEvaluator.evaluateByPairs(new GameStrategy(myShape, theirShape));
    }

    @Test
    void givenAllResults_whenEvaluate_thenVerifyThatScoreIsCorrect() {
        assertEquals(4, evaluateByResult(DRAW, THEIR_ROCK));
        assertEquals(1, evaluateByResult(LOSS, THEIR_PAPER));
        assertEquals(7, evaluateByResult(WIN, THEIR_SCISSOR));
    }

    private int evaluateByResult(Result result, Shape theirShape) {
        return GameStrategyEvaluator.evaluateByResult(new GamePlan(theirShape, result));
    }
}

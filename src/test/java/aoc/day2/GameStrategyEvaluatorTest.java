package aoc.day2;

import org.junit.jupiter.api.Test;

import static aoc.day2.Shape.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameStrategyEvaluatorTest {
    @Test
    void givenAllCombinations_whenEvaluate_thenVerifyThatScoreIsCorrect() {
        assertEquals(1, evaluate(MY_ROCK, THEIR_PAPER));
        assertEquals(4, evaluate(MY_ROCK, THEIR_ROCK));
        assertEquals(7, evaluate(MY_ROCK, THEIR_SCISSOR));
        assertEquals(2, evaluate(MY_PAPER, THEIR_SCISSOR));
        assertEquals(5, evaluate(MY_PAPER, THEIR_PAPER));
        assertEquals(8, evaluate(MY_PAPER, THEIR_ROCK));
        assertEquals(3, evaluate(MY_SCISSOR, THEIR_ROCK));
        assertEquals(6, evaluate(MY_SCISSOR, THEIR_SCISSOR));
        assertEquals(9, evaluate(MY_SCISSOR, THEIR_PAPER));
    }

    private int evaluate(Shape myShape, Shape theirShape) {
        return GameStrategyEvaluator.evaluate(new GameStrategy(myShape, theirShape));
    }
}

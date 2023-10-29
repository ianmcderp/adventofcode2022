package aoc.day2;

import org.junit.jupiter.api.Test;

import static aoc.day2.Shape.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeTest {
    @Test
    void givenEncodedShapeIdentifier_whenFromString_thenVerifyThatCorrect() {
        assertEquals(MY_ROCK, fromEncodedInput("X"));
        assertEquals(MY_PAPER, fromEncodedInput("Y"));
        assertEquals(MY_SCISSOR, fromEncodedInput("Z"));
        assertEquals(THEIR_ROCK, fromEncodedInput("A"));
        assertEquals(THEIR_PAPER, fromEncodedInput("B"));
        assertEquals(THEIR_SCISSOR, fromEncodedInput("C"));
    }
}

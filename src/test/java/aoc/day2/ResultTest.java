package aoc.day2;

import org.junit.jupiter.api.Test;

import static aoc.day2.Result.*;
import static aoc.day2.Result.fromEncodedInput;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ResultTest {
    @Test
    void givenEncodedResultIdentifier_whenFromString_thenVerifyThatCorrect() {
        assertEquals(LOSS, fromEncodedInput("X"));
        assertEquals(DRAW, fromEncodedInput("Y"));
        assertEquals(WIN, fromEncodedInput("Z"));
    }
}

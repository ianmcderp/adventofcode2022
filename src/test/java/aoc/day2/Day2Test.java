package aoc.day2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day2Test {
    private static Day2 puzzle;

    @BeforeAll
    static void beforeAll() {
        puzzle = new Day2();
        puzzle.setup();
    }

    @Test
    void givenInput_whenSolveFirstPuzzle_thenVerifyResultIsCorrect() {
        // when
        int result = puzzle.solveFirstPuzzle();

        // then
        assertEquals(15, result);
    }
}

package aoc.day3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day3Test {
    private static Day3 puzzle;

    @BeforeAll
    static void beforeAll() {
        puzzle = new Day3();
        puzzle.setup();
    }

    @Test
    void givenInput_whenSolveFirstPuzzle_thenVerifyResultIsCorrect() {
        // when
        int result = puzzle.solveFirstPuzzle();

        // then
        assertEquals(157, result);
    }

    @Test
    void givenInput_whenSolveSecondPuzzle_thenVerifyResultIsCorrect() {
        // when
        int result = puzzle.solveSecondPuzzle();

        // then
        assertEquals(70, result);
    }
}

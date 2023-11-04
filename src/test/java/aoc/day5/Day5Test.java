package aoc.day5;

import aoc.DayTest;
import aoc.Puzzle;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day5Test implements DayTest {
    private static Puzzle<String> puzzle;

    @BeforeAll
    static void beforeAll() {
        puzzle = new Day5();
        puzzle.setup();
    }

    @Override
    @Test
    public void givenInput_whenSolveFirstPuzzle_thenVerifyResultIsCorrect() {
        // when
        String result = puzzle.solveFirstPuzzle();

        // then
        assertEquals("CMZ", result);
    }

    @Override
    @Test
    public void givenInput_whenSolveSecondPuzzle_thenVerifyResultIsCorrect() {
        // when
        String result = puzzle.solveSecondPuzzle();

        // then
        assertEquals("MCD", result);
    }
}

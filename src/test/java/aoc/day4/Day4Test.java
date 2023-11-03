package aoc.day4;

import aoc.DayTest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day4Test implements DayTest {
    private static Day4 puzzle;

    @BeforeAll
    static void beforeAll() {
        puzzle = new Day4();
        puzzle.setup();
    }

    @Override
    @Test
    public void givenInput_whenSolveFirstPuzzle_thenVerifyResultIsCorrect() {
        // when
        int result = this.puzzle.solveFirstPuzzle();

        // then
        assertEquals(2, result);
    }

    @Override
    @Test
    public void givenInput_whenSolveSecondPuzzle_thenVerifyResultIsCorrect() {
        // when
        int result = this.puzzle.solveSecondPuzzle();

        // then
        assertEquals(4, result);
    }
}

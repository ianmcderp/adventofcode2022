package aoc.day1;

import lombok.SneakyThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day1Test {

    private static Day1 puzzle;

    @SneakyThrows
    @BeforeAll
    public static void beforeAll() {
        puzzle = new Day1();
        puzzle.setup();
    }

    @SneakyThrows
    @Test
    void givenInput_whenSolveFirstPuzzle_thenVerifyResultIsProvided() {
        // when
        int mostCalories = puzzle.solveFirstPuzzle();

        // then
        assertEquals(24000, mostCalories);
    }

    @Test
    void givenInput_whenSolveSecondPuzzle_thenVerifyResultIsProvided() {
        // when
        int topThreeCalories = puzzle.solveSecondPuzzle();

        // then
        assertEquals(45000, topThreeCalories);
    }

    private static Elf elf(Integer ... calories) {
        return Elf.builder().calories(List.of(calories)).build();
    }
}

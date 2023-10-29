package aoc.day1;

import lombok.SneakyThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Day1Test {

    private static Day1 puzzle;

    @SneakyThrows
    @BeforeAll
    public static void beforeAll() {
        List<Elf> elves = List.of(
                elf(1000, 2000, 3000),
                elf(4000),
                elf(5000, 6000),
                elf(7000, 8000, 9000),
                elf(10000)
        );

        InputReader mockedInputReader = mock(InputReader.class);
        when(mockedInputReader.loadData()).thenReturn(elves);

        puzzle = Day1.builder().caloriesReader(mockedInputReader).build();
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

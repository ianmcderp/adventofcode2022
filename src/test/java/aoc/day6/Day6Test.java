package aoc.day6;

import aoc.DayTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day6Test implements DayTest {
    @Override
    @Test
    public void givenInput_whenSolveFirstPuzzle_thenVerifyResultIsCorrect() {
        assertEquals(7, MarkerFinder.find("mjqjpqmgbljsphdztnvjfqwrcgsmlb"));
        assertEquals(5, MarkerFinder.find("bvwbjplbgvbhsrlpgdmjqwftvncz"));
        assertEquals(6, MarkerFinder.find("nppdvjthqldpwncqszvftbrmjlhg"));
        assertEquals(10, MarkerFinder.find("nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg"));
        assertEquals(11, MarkerFinder.find("zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw"));
    }

    @Override
    @Test
    public void givenInput_whenSolveSecondPuzzle_thenVerifyResultIsCorrect() {

    }
}

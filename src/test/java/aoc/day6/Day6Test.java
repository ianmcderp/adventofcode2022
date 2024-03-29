package aoc.day6;

import aoc.DayTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day6Test implements DayTest {
    @Override
    @Test
    public void givenInput_whenSolveFirstPuzzle_thenVerifyResultIsCorrect() {
        assertEquals(7, MarkerFinder.find("mjqjpqmgbljsphdztnvjfqwrcgsmlb", 4));
        assertEquals(5, MarkerFinder.find("bvwbjplbgvbhsrlpgdmjqwftvncz", 4));
        assertEquals(6, MarkerFinder.find("nppdvjthqldpwncqszvftbrmjlhg", 4));
        assertEquals(10, MarkerFinder.find("nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg", 4));
        assertEquals(11, MarkerFinder.find("zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw", 4));
    }

    @Override
    @Test
    public void givenInput_whenSolveSecondPuzzle_thenVerifyResultIsCorrect() {
        assertEquals(19, MarkerFinder.find("mjqjpqmgbljsphdztnvjfqwrcgsmlb", 14));
        assertEquals(23, MarkerFinder.find("bvwbjplbgvbhsrlpgdmjqwftvncz", 14));
        assertEquals(23, MarkerFinder.find("nppdvjthqldpwncqszvftbrmjlhg", 14));
        assertEquals(29, MarkerFinder.find("nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg", 14));
        assertEquals(26, MarkerFinder.find("zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw", 14));
    }
}

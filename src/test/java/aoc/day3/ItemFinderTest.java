package aoc.day3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemFinderTest {
    @Test
    void givenRucksackContent_whenFind_thenVerifyThatFound() {
        assertEquals('p', find("vJrwpWtwJgWrhcsFMMfFFhFp"));
        assertEquals('L', find("jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL"));
        assertEquals('P', find("PmmdzqPrVvPwwTWBwg"));
        assertEquals('v', find("wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn"));
        assertEquals('t', find("ttgJtRGJQctTZtZT"));
        assertEquals('s', find("CrZsJsPPZsGzwwsLwLmpwMDw"));
    }

    private char find(String rawContent) {
        return ItemFinder.find(new Rucksack(rawContent));
    }
}

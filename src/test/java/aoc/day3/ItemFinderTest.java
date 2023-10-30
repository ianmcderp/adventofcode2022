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
        return ItemFinder.findInRucksack(new Rucksack(rawContent));
    }

    @Test
    void givenThreeContents_whenFind_thenVerifyThatFound() {
        assertEquals(
                'r',
                finds(
                        "vJrwpWtwJgWrhcsFMMfFFhFp",
                        "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL",
                        "PmmdzqPrVvPwwTWBwg"
                )
        );
        assertEquals(
                'Z',
                finds(
                        "wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn",
                        "ttgJtRGJQctTZtZT",
                        "CrZsJsPPZsGzwwsLwLmpwMDw"
                )
        );
    }

    private char finds(String first, String second, String third) {
        return ItemFinder.findInRucksacks(new Rucksack(first), new Rucksack(second), new Rucksack(third));
    }
}

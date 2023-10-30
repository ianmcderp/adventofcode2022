package aoc.day3;

import aoc.Puzzle;
import aoc.Question;
import aoc.day1.InputReader;
import lombok.SneakyThrows;

import java.util.List;

public class Day3 implements Puzzle {
    private InputReader<Rucksack> rucksacksReader = new RucksacksReader();
    private List<Rucksack> rucksacks;

    @SneakyThrows
    @Override
    public void setup() {
        this.rucksacks = rucksacksReader.loadData();
    }

    @Override
    @Question(description = "What is the sum of the priorities of those item types?")
    public int solveFirstPuzzle() {
        return rucksacks.stream()
                .map(ItemFinder::find)
                .mapToInt(PriorityUtils::getPriority)
                .sum();
    }

    @Override
    public int solveSecondPuzzle() {
        return 0;
    }
}

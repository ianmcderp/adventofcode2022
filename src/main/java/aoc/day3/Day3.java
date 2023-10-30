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
                .map(ItemFinder::findInRucksack)
                .mapToInt(PriorityUtils::getPriority)
                .sum();
    }

    @Override
    @Question(description = "What is the sum of the priorities of those item types?")
    public int solveSecondPuzzle() {
        int sumPriority = 0;

        for (int rucksackIdx = 0; rucksackIdx < rucksacks.size(); rucksackIdx += 3) {
            char commonChar = ItemFinder.findInRucksacks(
                    rucksacks.get(rucksackIdx),
                    rucksacks.get(rucksackIdx + 1),
                    rucksacks.get(rucksackIdx + 2)
                    );
            sumPriority += PriorityUtils.getPriority(commonChar);
        }

        return sumPriority;
    }
}

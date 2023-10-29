package aoc.day1;

import aoc.Puzzle;
import aoc.Question;
import lombok.Builder;
import lombok.SneakyThrows;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;

@Builder
public class Day1 implements Puzzle {
    @Builder.Default
    private InputReader caloriesReader = new CaloriesReader();
    private List<Elf> elves;

    @SneakyThrows
    public void setup() {
        elves = caloriesReader.loadData();
    }

    @Question(description = "Find the Elf carrying the most Calories. How many total Calories is that Elf carrying?")
    public int solveFirstPuzzle() {
        OptionalInt maxCalories = elves.stream()
                .mapToInt(elf -> elf.getCalories().stream().mapToInt(Integer::intValue).sum())
                .max();

        return maxCalories.getAsInt();
    }

    @Question(description = "Find the top three Elves carrying the most Calories. How many Calories are those Elves carrying in total?")
    public int solveSecondPuzzle() {

        return elves.stream()
                .map(elf -> elf.getCalories().stream().mapToInt(Integer::intValue).sum())
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .mapToInt(Integer::intValue)
                .sum();
    }
}

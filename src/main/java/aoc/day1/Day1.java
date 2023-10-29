package aoc.day1;

import lombok.Builder;
import lombok.SneakyThrows;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;

@Builder
public class Day1 {
    @Builder.Default
    private InputReader caloriesReader = new CaloriesReader();
    private List<Elf> elves;

    @SneakyThrows
    public void setup() {
        elves = caloriesReader.loadData();
    }

    public int solveFirstPuzzle() {
        OptionalInt maxCalories = elves.stream()
                .mapToInt(elf -> elf.getCalories().stream().mapToInt(Integer::intValue).sum())
                .max();

        return maxCalories.getAsInt();
    }

    public int solveSecondPuzzle() {

        return elves.stream()
                .map(elf -> elf.getCalories().stream().mapToInt(Integer::intValue).sum())
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .mapToInt(Integer::intValue)
                .sum();
    }
}

import aoc.Puzzle;
import aoc.PuzzleSolver;
import aoc.day1.Day1;
import aoc.day2.Day2;
import aoc.day3.Day3;
import aoc.day4.Day4;
import aoc.day5.Day5;
import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final List<Puzzle> puzzles = new ArrayList<>();

    @SneakyThrows
    public static void main(String[] args) {
        puzzles.add(new Day1());
        puzzles.add(new Day2());
        puzzles.add(new Day3());
        puzzles.add(new Day4());
        puzzles.add(new Day5());

        puzzles.forEach(PuzzleSolver::solve);
    }
}

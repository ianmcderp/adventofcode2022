import aoc.Puzzle;
import aoc.PuzzleSolver;
import aoc.day1.Day1;
import aoc.day2.Day2;
import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final List<Puzzle> puzzles = new ArrayList<>();

    @SneakyThrows
    public static void main(String[] args) {
        puzzles.add(new Day1());
        puzzles.add(new Day2());

        puzzles.forEach(PuzzleSolver::solve);
    }
}

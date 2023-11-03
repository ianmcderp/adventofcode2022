package aoc.day4;

import aoc.Puzzle;
import aoc.Question;
import lombok.SneakyThrows;

import java.util.List;

public class Day4 implements Puzzle {
    private AssignementReader reader = new AssignementReader();
    private List<AssignementPair> assignementPairs;

    @SneakyThrows
    @Override
    public void setup() {
        this.assignementPairs = reader.loadData();
    }

    @Override
    @Question(description = "In how many assignment pairs does one range fully contain the other?")
    public int solveFirstPuzzle() {
        long count = this.assignementPairs.stream()
                .filter(pair -> pair.getRight().isWithin(pair.getLeft()) || pair.getLeft().isWithin(pair.getRight()))
                .count();
        return (int) count;
    }

    @Override
    public int solveSecondPuzzle() {
        return 0;
    }
}

package aoc.day4;

import aoc.Puzzle;
import aoc.Question;
import lombok.SneakyThrows;

import java.util.List;

public class Day4 implements Puzzle<Integer> {
    private AssignementReader reader = new AssignementReader();
    private List<AssignementPair> assignementPairs;

    @SneakyThrows
    @Override
    public void setup() {
        this.assignementPairs = reader.loadData();
    }

    @Override
    @Question(description = "In how many assignment pairs does one range fully contain the other?")
    public Integer solveFirstPuzzle() {
        long count = this.assignementPairs.stream()
                .filter(pair -> pair.getRight().isWithin(pair.getLeft()) || pair.getLeft().isWithin(pair.getRight()))
                .count();
        return (int) count;
    }

    @Override
    @Question(description = "In how many assignment pairs do the ranges overlap?")
    public Integer solveSecondPuzzle() {
        long count = this.assignementPairs.stream()
                .filter(pair -> pair.getRight().overlaps(pair.getLeft()) || pair.getLeft().overlaps(pair.getRight()))
                .count();
        return (int) count;
    }
}

package aoc.day6;

import aoc.Puzzle;
import aoc.Question;
import aoc.utils.ResourcesReader;
import lombok.SneakyThrows;

public class Day6 implements Puzzle<Integer> {
    private String sequence;

    @SneakyThrows
    @Override
    public void setup() {
        this.sequence = ResourcesReader.provideBufferedReaderForInputByDay("day6").readLine();
    }

    @Override
    @Question(description = "How many characters need to be processed before the first start-of-packet marker is detected?")
    public Integer solveFirstPuzzle() {
        return MarkerFinder.find(sequence, 4);
    }

    @Override
    @Question(description = "How many characters need to be processed before the first start-of-message marker is detected?")
    public Integer solveSecondPuzzle() {
        return MarkerFinder.find(sequence, 14);
    }
}

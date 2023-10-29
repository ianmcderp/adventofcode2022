package aoc.day2;

import aoc.Puzzle;
import aoc.Question;
import aoc.day1.InputReader;
import lombok.SneakyThrows;

import java.util.List;

public class Day2 implements Puzzle {
    private InputReader<GameStrategy> strategyReader = new GameStrategyReader();

    private List<GameStrategy> gameStrategy;

    @SneakyThrows
    @Override
    public void setup() {
        this.gameStrategy = strategyReader.loadData();
    }

    @Override
    @Question(description = "What would your total score be if everything goes exactly according to your strategy guide?")
    public int solveFirstPuzzle() {
        return gameStrategy.stream().mapToInt(GameStrategyEvaluator::evaluate).sum();
    }

    @Override
    @Question(description = "Following the Elf's instructions for the second column, what would your total score be if everything goes exactly according to your strategy guide?")
    public int solveSecondPuzzle() {
        return 0;
    }
}

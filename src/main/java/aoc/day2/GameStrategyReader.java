package aoc.day2;

import aoc.day1.InputReader;
import aoc.utils.ResourcesReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GameStrategyReader implements InputReader<GameStrategy> {
    @Override
    public List<GameStrategy> loadData() throws IOException {
        List<GameStrategy> gameStrategies = new ArrayList<>();

        BufferedReader reader = ResourcesReader.provideBufferedReaderForInputByDay("day2");

        String line;
        while ((line = reader.readLine()) != null) {
            String[] encodedInputs = line.split(" ");
            gameStrategies.add(new GameStrategy(Shape.fromEncodedInput(encodedInputs[1]), Shape.fromEncodedInput(encodedInputs[0])));
        }

        return gameStrategies;
    }
}

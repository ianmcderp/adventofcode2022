package aoc.day5;

import aoc.day1.InputReader;
import aoc.utils.ResourcesReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CommandReader implements InputReader<Command> {
    @Override
    public List<Command> loadData() throws IOException {
        List<Command> commands = new ArrayList<>();

        BufferedReader reader = ResourcesReader.provideBufferedReaderForInputByDay("day5");
        String line;
        while ((line = reader.readLine()) != null) {
            if (line.startsWith("move")) commands.add(Command.fromLine(line));
        }

        return commands;
    }
}

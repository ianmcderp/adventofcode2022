package aoc.day5;

import aoc.day1.InputReader;
import aoc.utils.ResourcesReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.regex.Pattern;

import static aoc.utils.RegexUtils.REGEX_ANY_DIGIT;

public class StackReader implements InputReader<Stack<String>> {
    @Override
    public List<Stack<String>> loadData() throws IOException {
        ArrayList<Stack<String>> stacks = new ArrayList<>();
        BufferedReader reader = ResourcesReader.provideBufferedReaderForInputByDay("day5");

        // read number of stacks
        Pattern.compile(REGEX_ANY_DIGIT).matcher(reader.readLine()).results().forEach(number -> stacks.add(new Stack()));

        // read starting stacks
        String line;
        while (!(line = reader.readLine()).startsWith("move")) {
            for (int stackIndex = 0; stackIndex < getStackCountForLine(line); stackIndex++) {
                String payload = String.valueOf(line.toCharArray()[1 + (stackIndex * 4)]).trim();
                if (!payload.isBlank()) stacks.get(stackIndex).add(0, payload);
            }
        }

        return stacks;
    }

    private static int getStackCountForLine(String line) {
        return (line.length() + 1)  / 4;
    }
}

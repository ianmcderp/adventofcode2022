package aoc.day4;

import aoc.day1.InputReader;
import aoc.utils.ResourcesReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AssignementReader implements InputReader<AssignementPair> {
    @Override
    public List<AssignementPair> loadData() throws IOException {
        BufferedReader lineReader = ResourcesReader.provideBufferedReaderForInputByDay("day4");

        List<AssignementPair> assignementPairs = new ArrayList<>();
        String line;
        while ((line = lineReader.readLine()) != null) {
            String[] rawAssignements = line.split(",");
            assignementPairs.add(new AssignementPair(
                    Assignement.of(rawAssignements[0]),
                    Assignement.of(rawAssignements[1])
                    )
            );
        }

        return assignementPairs;
    }
}

package aoc.day3;

import aoc.day1.InputReader;
import aoc.utils.ResourcesReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RucksacksReader implements InputReader<Rucksack> {
    @Override
    public List<Rucksack> loadData() throws IOException {
        List<Rucksack> rucksacks = new ArrayList<>();

        BufferedReader reader = ResourcesReader.provideBufferedReaderForInputByDay("day3");

        String line;
        while ((line = reader.readLine()) != null) {
            rucksacks.add(new Rucksack(line));
        }

        reader.close();

        return rucksacks;
    }
}

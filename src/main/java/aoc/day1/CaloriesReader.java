package aoc.day1;

import aoc.utils.ResourcesReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CaloriesReader implements InputReader<Elf> {
    @Override
    public List<Elf> loadData() throws IOException {
        List<Elf> elves = new ArrayList<>();

        BufferedReader reader = ResourcesReader.provideBufferedReaderForInputByDay("day1");

        Elf elf = Elf.builder().build();
        String line;
        while ((line = reader.readLine()) != null) {
            if (line.isBlank()) {
                elves.add(elf);
                elf = Elf.builder().build();
            } else {
                elf.addCalorie(Integer.parseInt(line));
            }
        }

        // add last elf
        elves.add(elf);

        reader.close();
        return elves;
    }
}

package aoc.day1;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class CaloriesReader implements InputReader {
    @Override
    public List<Elf> loadData() throws IOException {
        List<Elf> elves = new ArrayList<>();

        InputStream resourceAsStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("inputs/day1/input.txt");
        InputStreamReader streamReader = new InputStreamReader(resourceAsStream, StandardCharsets.UTF_8);
        BufferedReader reader = new BufferedReader(streamReader);

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

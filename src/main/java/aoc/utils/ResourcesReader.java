package aoc.utils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ResourcesReader {
    public static BufferedReader provideBufferedReaderForInputByDay(String day) {
        InputStream resourceAsStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("inputs/" + day + "/input.txt");
        InputStreamReader streamReader = new InputStreamReader(resourceAsStream, StandardCharsets.UTF_8);
        return new BufferedReader(streamReader);
    }
}

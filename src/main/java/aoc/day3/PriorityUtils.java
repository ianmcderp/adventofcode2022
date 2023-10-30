package aoc.day3;

import java.util.stream.Collectors;

public class PriorityUtils {
    public static int getPriority(char character) {
        return "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
                .chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.toList())
                .indexOf(character) + 1;
    }
}

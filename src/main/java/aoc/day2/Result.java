package aoc.day2;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum Result {
    WIN("Z"),
    LOSS("X"),
    DRAW("Y");

    private final String encodedResultIdentifier;

    Result(String encodedResultIdentifier) {
        this.encodedResultIdentifier = encodedResultIdentifier;
    }

    public static Result fromEncodedInput(String encodedInput) {
        return Arrays.stream(Result.values())
                .filter(result -> result.getEncodedResultIdentifier().equals(encodedInput))
                .findFirst()
                .get();
    }
}

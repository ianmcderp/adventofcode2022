package aoc.day2;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum Shape {
    MY_ROCK("X"),
    MY_PAPER("Y"),
    MY_SCISSOR("Z"),
    THEIR_ROCK("A"),
    THEIR_PAPER("B"),
    THEIR_SCISSOR("C");

    private final String encodedShapeIdentifier;

    Shape(String encodedShapeIdentifier) {
        this.encodedShapeIdentifier = encodedShapeIdentifier;
    }

    public static Shape fromEncodedInput(String encodedInput) {
        return Arrays.stream(Shape.values())
                .filter(shape -> shape.getEncodedShapeIdentifier().equals(encodedInput))
                .findFirst()
                .get();
    }
}

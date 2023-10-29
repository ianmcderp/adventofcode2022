package aoc.day2;

import java.util.Arrays;

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
        return Arrays.stream(Shape.values()).filter(shape -> shape.encodedShapeIdentifier.equals(encodedInput)).findFirst().get();
    }
}

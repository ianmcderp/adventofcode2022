package aoc;

public interface Puzzle<T> {
    void setup();

    T solveFirstPuzzle();

    T solveSecondPuzzle();
}

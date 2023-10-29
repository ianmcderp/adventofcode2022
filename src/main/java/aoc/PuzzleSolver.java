package aoc;

import lombok.SneakyThrows;
import lombok.extern.java.Log;

import java.lang.reflect.Method;

@Log
public class PuzzleSolver {
    @SneakyThrows
    public static void solve(Puzzle puzzle) {
        puzzle.setup();

        Method firstPuzzle = puzzle.getClass().getMethod("solveFirstPuzzle");
        if (firstPuzzle.isAnnotationPresent(Question.class)) {
            log.info(
                    firstPuzzle.getAnnotation(Question.class).description() +
                            " " +
                            puzzle.solveFirstPuzzle()
                    );
        }

        Method secondPuzzle = puzzle.getClass().getMethod("solveSecondPuzzle");
        if (secondPuzzle.isAnnotationPresent(Question.class)) {
            log.info(
                    secondPuzzle.getAnnotation(Question.class).description() +
                            " " +
                            puzzle.solveSecondPuzzle()
            );
        }
    }
}

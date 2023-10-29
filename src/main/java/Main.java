import aoc.day1.Day1;
import lombok.SneakyThrows;
import lombok.extern.java.Log;

@Log
public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        Day1 puzzle = Day1.builder().build();
        puzzle.setup();

        log.info("Find the Elf carrying the most Calories. How many total Calories is that Elf carrying? " + puzzle.solveFirstPuzzle());
        log.info("Find the top three Elves carrying the most Calories. How many Calories are those Elves carrying in total? " + puzzle.solveSecondPuzzle());
    }
}

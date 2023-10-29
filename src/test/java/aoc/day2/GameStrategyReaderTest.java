package aoc.day2;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import java.util.List;

import static aoc.day2.Shape.MY_PAPER;
import static aoc.day2.Shape.THEIR_ROCK;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameStrategyReaderTest {
    @SneakyThrows
    @Test
    void givenInput_whenLoad_thenVerifyThatDataIsComplete() {
        // when
        List<GameStrategy> gameStrategies = new GameStrategyReader().loadData();

        // then
        assertEquals(3, gameStrategies.size());
    }

    @SneakyThrows
    @Test
    void givenInput_whenLoad_thenVerifyThatDataIsCorrect() {
        // when
        List<GameStrategy> gameStrategies = new GameStrategyReader().loadData();

        // then
        assertEquals(THEIR_ROCK, gameStrategies.get(0).theirShape);
        assertEquals(MY_PAPER, gameStrategies.get(0).myShape);
    }
}

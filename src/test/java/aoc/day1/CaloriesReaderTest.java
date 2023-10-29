package aoc.day1;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaloriesReaderTest {
    @SneakyThrows
    @Test
    void givenInput_whenLoad_thenVerifyThatDataIsComplete() {
        // when
        List<Elf> elves = new CaloriesReader().loadData();

        // then
        assertEquals(5, elves.size());
    }
}

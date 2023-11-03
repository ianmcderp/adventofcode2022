package aoc.day4;

import aoc.day1.InputReader;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssignementReaderTest {
    @SneakyThrows
    @Test
    void givenInput_whenLoaded_thenVerifyPairsAreCorrect() {
        // given
        InputReader<AssignementPair> reader = new AssignementReader();

        // when
        List<AssignementPair> assignementPairs = reader.loadData();

        // then
        assertEquals(6, assignementPairs.size());
    }
}

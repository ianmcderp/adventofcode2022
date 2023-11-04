package aoc.day5;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StackReaderTest {
    @SneakyThrows
    @Test
    void givenInput_whenLoadStacks_thenVerifyThatCorrect() {
        // given
        StackReader reader = new StackReader();

        // when
        List<Stack<String>> stacks = reader.loadData();

        // then
        assertEquals(3, stacks.size());
        assertEquals("N", stacks.get(0).peek());
        assertEquals("D", stacks.get(1).peek());
        assertEquals("P", stacks.get(2).peek());
    }
}

package aoc.day3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PriorityUtilsTest {
    @Test
    void givenCharacter_whenGetPriority_thenVerifyThatCorrect() {
        assertEquals(1, PriorityUtils.getPriority('a'));
        assertEquals(16, PriorityUtils.getPriority('p'));
        assertEquals(38, PriorityUtils.getPriority('L'));
        assertEquals(42, PriorityUtils.getPriority('P'));
        assertEquals(22, PriorityUtils.getPriority('v'));
        assertEquals(20, PriorityUtils.getPriority('t'));
        assertEquals(19, PriorityUtils.getPriority('s'));
        assertEquals(52, PriorityUtils.getPriority('Z'));
    }
}

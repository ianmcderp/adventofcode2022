package aoc.day4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AssignementTest {
    @Test
    void givenAssignements_whenCheckIfWithin_thenVerifyThatCorrect() {
        assertTrue(new Assignement(3,7).isWithin(new Assignement(2,8)));
        assertTrue(new Assignement(6,6).isWithin(new Assignement(4,6)));
        assertFalse(new Assignement(2,4).isWithin(new Assignement(6,8)));
    }
}

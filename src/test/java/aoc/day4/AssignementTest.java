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

    @Test
    void givenAssignements_whenCheckIfOverlaps_thenVerifyThatCorrect() {
        assertTrue(new Assignement(5,7).overlaps(new Assignement(7,9)));
        assertTrue(new Assignement(2,8).overlaps(new Assignement(3,7)));
        assertTrue(new Assignement(6,6).overlaps(new Assignement(4,6)));
        assertTrue(new Assignement(2,6).overlaps(new Assignement(4,8)));
        assertFalse(new Assignement(2,4).overlaps(new Assignement(6,8)));
        assertFalse(new Assignement(4,5).overlaps(new Assignement(2,3)));
    }
}

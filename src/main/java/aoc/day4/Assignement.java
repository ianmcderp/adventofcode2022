package aoc.day4;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Assignement {
    private int lower;
    private int upper;

    public static Assignement of(String rawString) {
        String[] split = rawString.split("-");
        return new Assignement(Integer.decode(split[0]), Integer.decode(split[1]));
    }

    public boolean isWithin(Assignement assignement) {
        return assignement.getLower() <= this.lower && assignement.getUpper() >= this.upper;
    }
}

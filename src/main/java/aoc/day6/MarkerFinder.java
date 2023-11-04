package aoc.day6;

import java.util.ArrayList;
import java.util.List;

public class MarkerFinder {
    public static int find(String sequence) {
        char[] sequenceArray = sequence.toCharArray();

        List<Character> uniqueChars = new ArrayList<>();
        int index;
        for (index = 3; index < sequence.length(); index++) {
            for (int back = 0; back < 4; back ++) {
                Character charAtIndex = sequenceArray[index - back];
                if (!uniqueChars.contains(charAtIndex)) uniqueChars.add(charAtIndex);
            }

            if (uniqueChars.size() == 4) {
                break;
            } else {
                uniqueChars.clear();
            }
        }

        return index + 1;
    }
}

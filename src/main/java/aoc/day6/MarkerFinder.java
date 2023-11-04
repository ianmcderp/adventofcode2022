package aoc.day6;

import java.util.ArrayList;
import java.util.List;

public class MarkerFinder {
    public static int find(String sequence, int distinctCharacterCount) {
        char[] sequenceArray = sequence.toCharArray();

        List<Character> uniqueChars = new ArrayList<>();
        int minimumMarkerIndex = distinctCharacterCount - 1;
        int index;
        for (index = minimumMarkerIndex; index < sequence.length(); index++) {
            for (int back = 0; back < distinctCharacterCount; back ++) {
                Character charAtIndex = sequenceArray[index - back];
                if (!uniqueChars.contains(charAtIndex)) uniqueChars.add(charAtIndex);
            }

            if (uniqueChars.size() == distinctCharacterCount) {
                break;
            } else {
                uniqueChars.clear();
            }
        }

        return index + 1;
    }
}

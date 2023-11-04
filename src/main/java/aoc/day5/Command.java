package aoc.day5;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static aoc.utils.RegexUtils.REGEX_ANY_DIGIT;

@Getter
@AllArgsConstructor
public class Command {
    private int quantity;
    private int source;
    private int destination;

    public static Command fromLine(String line) {
        List<Integer> matchResults = Pattern.compile(REGEX_ANY_DIGIT).matcher(line)
                .results()
                .map(result -> Integer.valueOf(result.group()))
                .collect(Collectors.toList());
        return new Command(matchResults.get(0), matchResults.get(1), matchResults.get(2));
    }
}

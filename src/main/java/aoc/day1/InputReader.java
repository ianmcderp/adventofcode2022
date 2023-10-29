package aoc.day1;

import java.io.IOException;
import java.util.List;

public interface InputReader<T> {
    List<T> loadData() throws IOException;
}

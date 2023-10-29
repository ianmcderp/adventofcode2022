package aoc.day2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GameStrategy {
    Shape myShape;
    Shape theirShape;
}

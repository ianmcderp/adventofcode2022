package aoc.day1;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Builder
public class Elf {
    @Builder.Default
    private List<Integer> calories = new ArrayList<>();

    public void addCalorie(int calorie) {
        calories.add(calorie);
    }
}

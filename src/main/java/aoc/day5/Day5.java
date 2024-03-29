package aoc.day5;

import aoc.Puzzle;
import aoc.Question;
import lombok.SneakyThrows;

import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class Day5 implements Puzzle<String> {
    private List<Stack<String>> stacks;
    private List<Command> commands;

    @SneakyThrows
    @Override
    public void setup() {
        this.stacks = new StackReader().loadData();
        this.commands = new CommandReader().loadData();
    }

    @Override
    @Question(description = "After the rearrangement procedure completes, what crate ends up on top of each stack?")
    public String solveFirstPuzzle() {
        commands.forEach(command -> {
            Stack<String> sourceStack = stacks.get(command.getSource() - 1);
            Stack<String> destinationStack = stacks.get(command.getDestination() - 1);
            for (int times = 0; times < command.getQuantity(); times++) {
                String crate = sourceStack.pop();
                destinationStack.push(crate);
            }
        });

        return getResultString(stacks);
    }

    @Override
    @Question(description = "After the rearrangement procedure completes, what crate ends up on top of each stack?")
    public String solveSecondPuzzle() {
        commands.forEach(command -> {
            Stack<String> sourceStack = stacks.get(command.getSource() - 1);
            Stack<String> destinationStack = stacks.get(command.getDestination() - 1);

            Stack<String> clipboard = new Stack<String>();
            for (int times = 0; times < command.getQuantity(); times++) {
                String crate = sourceStack.pop();
                clipboard.push(crate);
            }

            while (!clipboard.isEmpty()) {
                destinationStack.push(clipboard.pop());
            }
        });

        return getResultString(stacks);
    }

    private static String getResultString(List<Stack<String>> stacks) {
        String result = stacks.stream()
                .map(stack -> stack.peek().toString())
                .collect(Collectors.joining());
        return result;
    }
}

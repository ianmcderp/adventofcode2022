package aoc.day5;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommandReaderTest {
    @SneakyThrows
    @Test
    void givenInput_whenLoadCommand_thenVerifyThatCorrect() {
        // given
        CommandReader reader = new CommandReader();

        // when
        List<Command> commands = reader.loadData();

        // then
        assertEquals(4, commands.size());
        assertEquals(1, commands.get(0).getQuantity());
        assertEquals(2, commands.get(0).getSource());
        assertEquals(1, commands.get(0).getDestination());
    }
}

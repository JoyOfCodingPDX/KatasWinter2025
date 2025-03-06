package edu.pdx.cs.joy.mob5;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
public class MinesweeperTest {
    @Test
    void canInstantiateKataClass() {
        assertNotNull(new Minesweeper());
    }
    @Test
    void testMinesweeperSingleField() {
        List<String[]> inputFields = new ArrayList<>();
        inputFields.add(new String[]{
                "*...",
                "....",
                ".*..",
                "...."
        });
        List<String[]> expectedOutput = new ArrayList<>();
        expectedOutput.add(new String[]{
                "Field #1:",
                "*100",
                "2210",
                "1*10",
                "1110"
        });
        List<String[]> outputFields = Minesweeper.processFields(inputFields);
        assertEquals(expectedOutput.size(), outputFields.size());
        assertArrayEquals(expectedOutput.get(0), outputFields.get(0));
    }
    @Test
    void testMinesweeperMultipleFields() {
        List<String[]> inputFields = new ArrayList<>();
        inputFields.add(new String[]{
                "*...",
                "....",
                ".*..",
                "...."
        });
        inputFields.add(new String[]{
                "**...",
                ".....",
                ".*..."
        });
        List<String[]> expectedOutput = new ArrayList<>();
        expectedOutput.add(new String[]{
                "Field #1:",
                "*100",
                "2210",
                "1*10",
                "1110"
        });
        expectedOutput.add(new String[]{
                "Field #2:",
                "**100",
                "33200",
                "1*100"
        });
        List<String[]> outputFields = Minesweeper.processFields(inputFields);
        assertEquals(expectedOutput.size(), outputFields.size());
        for (int i = 0; i < expectedOutput.size(); i++) {
            assertArrayEquals(expectedOutput.get(i), outputFields.get(i));
        }
    }
    @Test
    void testEmptyInput() {
        List<String[]> inputFields = new ArrayList<>();
        List<String[]> outputFields = Minesweeper.processFields(inputFields);
        assertTrue(outputFields.isEmpty(), "Output should be empty for empty input.");
    }
}

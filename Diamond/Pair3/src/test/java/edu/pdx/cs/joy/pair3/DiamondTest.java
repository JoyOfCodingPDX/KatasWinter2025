package edu.pdx.cs.joy.pair12;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiamondTest {
    private String captureOutput(char inputChar) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
	
        Diamond.printDiamond(inputChar);
	
        System.setOut(originalOut);
        return outputStream.toString().trim();
    }

    @Test
    void testDiamondA() {
        assertEquals("A", captureOutput('A'));
    }

    @Test
    void testDiamondB() {
        String expected = 
	    " A\n" +
	    "B B\n" +
	    " A";
        assertEquals(expected, captureOutput('B'));
    }
    
    @Test
    void testDiamondC() {
        String expected = 
	    "  A\n" +
	    " B B\n" +
	    "C   C\n" +
	    " B B\n" +
	    "  A";
        assertEquals(expected, captureOutput('C'));
    }
    
    @Test
    void testDiamondD() {
        String expected = 
	    "   A\n" +
	    "  B B\n" +
	    " C   C\n" +
	    "D     D\n" +
	    " C   C\n" +
	    "  B B\n" +
	    "   A";
        assertEquals(expected, captureOutput('D'));
    }
}

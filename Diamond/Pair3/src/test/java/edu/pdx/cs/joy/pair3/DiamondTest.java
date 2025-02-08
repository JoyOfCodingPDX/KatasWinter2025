package edu.pdx.cs.joy.pair3;

import org.junit.jupiter.api.Test;
import org.hamcrest.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DiamondTest
{

    @Test
    void canInstantiateDiamondClass() {
        new Diamond();
    }

    private String captureOutput(char inputChar) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        Diamond.printDiamond(inputChar);

        System.setOut(originalOut);
        return outputStream.toString().trim();
    }

  @Test
  void diamondtest() {

    String myString = " C";
    assertEquals(myString, Diamond.space(1, 0, 'C'));

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

    @Test
    void testInvalidCharacter() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalErr = System.err;
        System.setErr(new PrintStream(outputStream));

        String[] args = {"1"};
        Diamond.main(args);

        System.setErr(originalErr);
        assertTrue(outputStream.toString().contains("Invalid input: Please enter a letter from A to Z"));
    }

    @Test
    void testMissingArgument() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalErr = System.err;
        System.setErr(new PrintStream(outputStream));

        String[] args = {};
        Diamond.main(args);

        System.setErr(originalErr);
        assertTrue(outputStream.toString().contains("Missing command line arguments"));
    }

    @Test
    void testTooManyArguments() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalErr = System.err;
        System.setErr(new PrintStream(outputStream));

        String[] args = {"A", "B"};
        Diamond.main(args);

        System.setErr(originalErr);
        assertTrue(outputStream.toString().contains("Too many arguments. Please provide a single letter."));
    }

  @Test
  void diamondtest2() {
    String myString = "X   X";
    assertEquals(myString, Diamond.space(0,3,'X'));
  }


  @Test
  void printDiamonftest() {
    Diamond.print_dimond('A');
  }
}

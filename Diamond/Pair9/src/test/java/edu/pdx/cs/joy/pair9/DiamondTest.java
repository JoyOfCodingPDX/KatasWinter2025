package edu.pdx.cs.joy.pair9;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DiamondTest {
  private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
  private final PrintStream originalOut = System.out;

  private final ByteArrayOutputStream errStream = new ByteArrayOutputStream();
  private final PrintStream originalErr = System.err;

  @BeforeEach
  void setUp() {
    System.setOut(new PrintStream(outputStream)); // Capture standard output
    System.setErr(new PrintStream(errStream)); // Capture error output
  }

  @AfterEach
  void tearDown() {
    System.setOut(originalOut); // Restore System.out
    System.setErr(originalErr); // Restore System.err
  }

  @Test
  void canInstantiateKataClass() {
    new Diamond(); // Ensure the class can be instantiated
  }
  @Test
  void testMainWithInvalidNumber() {
    Diamond.main(new String[]{"1"});
    assertTrue(outputStream.toString().contains("Error: Input must be a single letter"));
  }
  @Test
  void testMainWithValidLetter() {
    Diamond.main(new String[]{"C"});
    String expectedOutput =
            "  A\n" +
                    " B B\n" +
                    "C   C\n" +
                    " B B\n" +
                    "  A\n";
    assertEquals(expectedOutput, outputStream.toString());
  }

  @Test
  void testMainWithMultipleLetters() {
    Diamond.main(new String[]{"AB"});
    assertTrue(errStream.toString().trim().contains("Error: Input must be a single letter"));
  }

  @Test
  void testMainWithNoArguments() {
    Diamond.main(new String[]{});
    assertTrue(errStream.toString().trim().contains("Error: Please provide exactly one letter"));
  }
}

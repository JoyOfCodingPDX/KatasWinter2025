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

  @BeforeEach
  void setUp() {
    System.setOut(new PrintStream(outputStream)); // Redirect System.out
  }

  @AfterEach
  void tearDown() {
    System.setOut(originalOut); // Restore System.out
  }

  @Test
  void canInstantiateKataClass() {
    new Diamond(); // Ensure the class can be instantiated
  }
  @Test
  void testMainWithMultipleLetters() {
    Diamond.main(new String[]{"AB"});
    assertTrue(outputStream.toString().contains("Error: Input must be a single letter"));
  }

  @Test
  void testMainWithNoArguments() {
    Diamond.main(new String[]{});
    assertTrue(outputStream.toString().contains("Error: Please provide exactly one letter"));
  }
}

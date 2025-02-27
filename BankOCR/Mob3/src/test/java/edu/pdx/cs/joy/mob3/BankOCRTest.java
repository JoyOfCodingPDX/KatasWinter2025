package edu.pdx.cs.joy.mob3;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class BankOCRTest
{

  @Test
  void canInstantiateKataClass() {
    new BankOCR();
  }

  @Test
  void testValidInput() {
      BankOCR bankOCR = new BankOCR();
      char[][] validInput = {
          "    _  _     _  _  _  _  _ ".toCharArray(),
          "  | _| _||_||_ |_   ||_||_|".toCharArray(),
          "  ||_  _|  | _||_|  ||_| _|".toCharArray()
      };
      assertDoesNotThrow(() -> bankOCR.parseArgs(validInput));
  }

  @Test
  void testLessThanThreeLines() {
      BankOCR bankOCR = new BankOCR();
      char[][] invalidInput = {
          "    _  _     _  _  _  _  _ ".toCharArray(),
          "  | _| _||_||_ |_   ||_||_|".toCharArray()
      };
      Exception exception = assertThrows(RuntimeException.class, () -> bankOCR.parseArgs(invalidInput));
      assertTrue(exception.getMessage().contains("The amount of lines is less than three"));
  }

  @Test
  void testInvalidLineLength() {
      BankOCR bankOCR = new BankOCR();
      char[][] invalidInput = {
          "    _  _     _  _  _  _  _   ".toCharArray(), // added extra space here
          "  | _| _||_||_ |_   ||_||_|".toCharArray(),
          "  ||_  _|  | _||_|  ||_| _|".toCharArray()
      };
      Exception exception = assertThrows(RuntimeException.class, () -> bankOCR.parseArgs(invalidInput));
      assertTrue(exception.getMessage().contains("The lines are not 27 chars longs"));
  }
    @Test
    void testInvalidText() {
        BankOCR bankOCR = new BankOCR();
        char[][] invalidInput = {
                "    _  _     _  _  _  _  _   ".toCharArray(), // added extra space here
                "  A _| _||_||_ |_   ||_||_|".toCharArray(),
                "  ||_  _|  | _||_|  ||_| _|".toCharArray()
        };
        Exception exception = assertThrows(RuntimeException.class, () -> bankOCR.parseArgs(invalidInput));
        assertTrue(exception.getMessage().contains("The characters are not valid"));
    }
}

/*
  four arrays of string
  line_1[27]
  line_2[27]
  line_3[27]
  line_4[27]
 */

/*
  one pattern
  [0, 0, 1]
  [0, 0, 1]
  [0, 0, 1]
  two pattern
  [0, 1, 0]
  [0, 1, 1]
  [1, 1, 0]
 */

/*
 if first or thrid row == "_" error
 if second == " | " errror
 */
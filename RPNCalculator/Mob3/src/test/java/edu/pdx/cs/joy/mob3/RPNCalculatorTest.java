package edu.pdx.cs.joy.mob3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class RPNCalculatorTest
{

  @Test
  void canInstantiateKataClass() {
    new RPNCalculator();
  }

  @Test
  void testForEmptyString(){
    RPNCalculator rcal = new RPNCalculator();
    int value = rcal.parseOperators("");
    assertEquals(value,0);
  }

  @Test
  void testForASingleString(){
    RPNCalculator rcal = new RPNCalculator();
    int value = rcal.parseOperators("1");
    assertEquals(value,1);
  }

  @Test
  void testForTwoStrings(){
    RPNCalculator rcal = new RPNCalculator();
    int value = rcal.parseOperators("1 2");
    assertThrows(IllegalArgumentException.class, "bad argument");
  }
}

package edu.pdx.cs.joy.mob3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
  void testForTwoStrings() {
    RPNCalculator rcal = new RPNCalculator();
    IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
      rcal.parseOperators("1 2");
    });

    assertEquals("bad argument", thrown.getMessage());
  }
  @Test
  void testAddition() {
    assertEquals(5, RPNCalculator.parseOperators("2 3 +"));
  }
}

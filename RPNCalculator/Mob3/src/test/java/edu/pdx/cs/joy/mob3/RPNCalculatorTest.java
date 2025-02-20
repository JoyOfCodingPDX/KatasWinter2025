package edu.pdx.cs.joy.mob3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RPNCalculatorTest
{

  @Test
  void canInstantiateKataClass() {
    new RPNCalculator();
  }

  @Test
  void testAddition() {
    assertEquals(5, RPNCalculator.parseOperators("2 3 +"));
  }
  @Test
  void testSubtraction(){
    assertEquals(-1, RPNCalculator.parseOperators("2 3 -"));
  }

  @Test
  void testMultiplication(){
    assertEquals(6, RPNCalculator.parseOperators("2 3 *"));
  }

  @Test
  void testDivision(){
    assertEquals(2, RPNCalculator.parseOperators("6 3 /"));
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

  // @Test
  // void testForTwoStrings(){
  //   RPNCalculator rcal = new RPNCalculator();
  //   int value = rcal.parseOperators("1 2");
  //   assertThrows(IllegalArgumentException.class, "bad argument");
  // }

}

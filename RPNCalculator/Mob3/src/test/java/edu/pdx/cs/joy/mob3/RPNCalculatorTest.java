package edu.pdx.cs.joy.mob3;

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

}

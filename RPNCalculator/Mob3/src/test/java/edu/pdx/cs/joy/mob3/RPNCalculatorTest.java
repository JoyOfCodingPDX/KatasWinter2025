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
    double value = rcal.parseOperators("");
    assertEquals(value,0);
  }

  @Test
  void testForASingleString(){
    RPNCalculator rcal = new RPNCalculator();
    double value = rcal.parseOperators("1");
    assertEquals(value,1);
  }

  @Test
  void testForTwoStrings() {
    RPNCalculator rcal = new RPNCalculator();
    IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
      rcal.parseOperators("1 2");
    });

    assertEquals("stack empty", thrown.getMessage());
  }
  @Test
  void testAddition() {
    assertEquals(5, RPNCalculator.parseOperators("2 3 +"));
  }
  @Test
  void testSubtraction(){
    assertEquals(2, RPNCalculator.parseOperators("5 3 -"));
  }
  @Test
  void testMultiplication() {
    assertEquals(6, RPNCalculator.parseOperators("2 3 *"));
  }
  @Test
  void testDivision() {
    assertEquals(2, RPNCalculator.parseOperators("6 3 /"));
  }

  @Test
  void test_divide_zero(){
    try {
      RPNCalculator.parseOperators("6 0 /");
      assert(false);
    } catch (Exception e){
      assert(true);
    }
  }

  @Test
  void test_two_plus(){
    assert(6 == RPNCalculator.parseOperators("2 2 2 + +"));
  }

  @Test
  void test_plus_minus(){
    assert(6 == RPNCalculator.parseOperators("6 2 2 - +"));
  }

  @Test
  void test_times_add(){
    assert(6 == RPNCalculator.parseOperators("2 2 2 * +"));
  }

  @Test
  void test_no_operators(){
    try {
      RPNCalculator.parseOperators("2 2 2");
      assert(false);
    } catch (Exception e) {
      assert(true);
    }
  }

}

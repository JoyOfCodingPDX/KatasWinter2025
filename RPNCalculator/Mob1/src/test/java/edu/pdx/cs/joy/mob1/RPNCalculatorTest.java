package edu.pdx.cs.joy.mob1;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
  20 5 /        => 20/5 = 4
  4 2 + 3 -     => (4+2)-3 = 3
  3 5 8 * 7 + * => ((5*8)+7)*3 = 141
 */
public class RPNCalculatorTest
{
  private final Stack<String> s = new Stack<>();

  @Test
  void canInstantiateKataClass() {
    new RPNCalculator(s);
  }
    // remember to press I to be able to type because
    // we are using vim ew

  @Test
  void canAddOnePlusOne() {
    s.push("1");
    s.push("1");
    s.push("+");
    RPNCalculator calc = new RPNCalculator(s);
    assertThat(calc.calculate(), equalTo(2));
  }

  @Test
  void canAddTwoNumbers() {
    RPNCalculator calc = new RPNCalculator(s);
    assertThat(calc.add(3, 2), equalTo(5));
  }

  @Test
  void canSubtract() {
    RPNCalculator calc = new RPNCalculator(s);
    assertThat(calc.sub(3, 2), equalTo(5));
  }


}

package edu.pdx.cs.joy.mob5;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class RPNCalculatorTest
{

  @Test
  void canInstantiateKataClass() {
    new RPNCalculator();
  }

  @Test
  void twentyDivideFiveEqualsFour() {
    Stack<Integer> a_stack = new Stack<>();
    a_stack.push(90000);
    a_stack.push(5);
    a_stack.push(20);
    RPNCalculator calculator = new RPNCalculator();
    assertThat(calculator.calculate(a_stack.pop(),a_stack.pop(),"/"), equalTo(4));
  }
}

package edu.pdx.cs.joy.mob5;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.hamcrest.MatcherAssert.assertThat;

public class RPNCalculatorTest
{

  @Test
  void canInstantiateKataClass() {
    new RPNCalculator();
  }

  @Test
  void twentyDivideFiveEqualsFour() {
    RPNCalculator calculator = new RPNCalculator();
    String[] args = {"20", "5", "/"};
    assertThat(calculator.calculate(args), equals(4));
  }
}

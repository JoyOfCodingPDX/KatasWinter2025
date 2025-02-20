package edu.pdx.cs.joy.mob4;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class RPNCalculatorTest
{
  ByteArrayOutputStream baos = new ByteArrayOutputStream();
  @Test
  void canInstantiateKataClass() {
    new RPNCalculator();
  }

  @Test
  void canAddTwoNumbers() {
    System.setOut(new PrintStream(baos));

    String[] args = {"4", "3", "+"};
    RPNCalculator calculator = new RPNCalculator();
    calculator.main(args);
    assertThat(baos.toString(), containsString("7"));
  }
}

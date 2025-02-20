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

  @Test
  void canSubTwoNumbers() {
    System.setOut(new PrintStream(baos));

    String[] args = {"4", "3", "-"};
    RPNCalculator calculator = new RPNCalculator();
    calculator.main(args);
    assertThat(baos.toString(), containsString("1"));

  }

  @Test
  void canMultTwoNumbers(){
    System.setOut(new PrintStream(baos));

    String[] args = {"5", "3", "*"};
    RPNCalculator calculator = new RPNCalculator();
    calculator.main(args);
    assertThat(baos.toString(), containsString("15"));

  }

  @Test
  void canDivideTwoNumbers(){
    System.setOut(new PrintStream(baos));

    String[] args = {"20", "4", "/"};
    RPNCalculator calculator = new RPNCalculator();
    calculator.main(args);
    assertThat(baos.toString(), containsString("5"));

  }

  @Test
  void canAddThreeNumbers(){
    System.setOut(new PrintStream(baos));

    String[] args = {"2", "3", "+", "4", "+"};
    RPNCalculator calculator = new RPNCalculator();
    calculator.main(args);
    assertThat(baos.toString(), containsString("9"));
  }

  @Test
  void canDoSampleNumbers(){
    System.setOut(new PrintStream(baos));

    String[] args = {"4", "2", "+", "3", "-"};
    RPNCalculator calculator = new RPNCalculator();
    calculator.main(args);
    assertThat(baos.toString(), containsString("3"));
  }

  @Test
  void canDoFourNumbersInARow(){
    System.setOut(new PrintStream(baos));

    String[] args = {"3", "5", "8", "*", "7", "+", "*"};
    RPNCalculator calculator = new RPNCalculator();
    calculator.main(args);
    assertThat(baos.toString(), containsString("141"));
  }
}

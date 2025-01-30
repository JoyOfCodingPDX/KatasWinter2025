package edu.pdx.cs.joy.pair1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

<<<<<<< HEAD:Diamond/Pair1/src/test/java/edu/pdx/cs/joy/pair1/DiamondTest.java
public class DiamondTest
=======
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class KataTest
>>>>>>> d17c12c (Forgot to commit):FizzBuzz/src/test/java/edu/pdx/cs/joy/pairs/KataTest.java
{

  private Kata kata;

  @BeforeEach
  void setUp() {
    kata = new Kata();
  }

  private void assertFizzBuzz(int buzzNumber, String buzzString) {
    assertThat(kata.fizzBuzz(buzzNumber), equalTo(buzzString));
  }

  @Test
  void canInstantiateKataClass() {
    new Diamond();
  }

  @Test
  void fiveBuzzes() {
      assertFizzBuzz(5, "Buzz");
  }

  @Test
  void threeFizzes() {
    assertFizzBuzz(3, "Fizz");
  }

  @Test
  void fifteenFizzesandBuzzes() {
    assertFizzBuzz(15, "FizzBuzz");
  }

}

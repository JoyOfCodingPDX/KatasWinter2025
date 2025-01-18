package edu.pdx.cs.joy.pairs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FizzBuzzTest
{

  private FizzBuzz kata;

  @BeforeEach
  void setUp() {
    kata = new FizzBuzz();
  }
  

  @Test
  void canInstantiateKataClass() {
    new FizzBuzz();
  }


  @Test
  void fiveBuzzes() {
      assertFizzBuzz(5, "Buzz");
  }

  private void assertFizzBuzz(int buzzNumber, String buzzString) {
    assertThat(kata.fizzBuzz(buzzNumber), equalTo(buzzString) );
  }

  @Test
  void threeFizzes() {
    assertThat(kata.fizzBuzz(3), equalTo("Fizz") );
  }

  @Test
  void twentyThreeIs23() {
    assertThat(kata.fizzBuzz(23), equalTo("23") );
  }
}

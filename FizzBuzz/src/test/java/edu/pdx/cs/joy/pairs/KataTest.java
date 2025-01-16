package edu.pdx.cs.joy.pairs;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class KataTest
{

  @Test
  void canInstantiateKataClass() {
    new Kata();
  }

  @Test
  void fiveBuzzes() {
    Kata kata = new Kata();
    assertThat(kata.fizzBuzz(5), equalTo("Buzz") );
  }
}

package edu.pdx.cs.joy.pair12;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

  @Test
  void check2000(int input)
  {
    assertThat(isLeapYear(2000), true);
  }
}

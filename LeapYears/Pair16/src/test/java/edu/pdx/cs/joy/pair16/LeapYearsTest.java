package edu.pdx.cs.joy.pair16;

import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

public class LeapYearsTest
{
  /**TEST successful leap year */
  @Test
  void canInstantiateKataClass() {
    new LeapYears();

    int isLeapYear = 800;

    assertTrue(LeapYears.isDivByFourHundred(isLeapYear));
  }

}

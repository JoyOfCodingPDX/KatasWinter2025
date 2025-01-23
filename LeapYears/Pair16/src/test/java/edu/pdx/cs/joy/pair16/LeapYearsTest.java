package edu.pdx.cs.joy.pair16;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class LeapYearsTest
{
  /**
   * Test successful leap year
   * */
  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

  /**
   * Test that a year not divisible by 400 fails.
   */
  @Test
  void invalidYearDivByFourHundredFails(){
    new LeapYears();
    int isNotLeapYear = 999;
    assertFalse(LeapYears.isDivByFourHundred(isNotLeapYear));
  }

  @Test
  void validYearDivByFourHundredFails(){
    new LeapYears();
    int isLeapYear = 800;
    assertTrue(LeapYears.isDivByFourHundred(isLeapYear));
  }

  @Test
  void invalidYearDivByOneHundredFails(){
    new LeapYears();
    int isNotLeapYear = 999;
    assertFalse(LeapYears.isDivByOneHundred(isNotLeapYear));
  }

  @Test
  void validYearDivByOneHundredFails(){
    new LeapYears();
    int isLeapYear = 800;
    assertTrue(LeapYears.isDivByOneHundred(isLeapYear));
  }

  @Test
  void invalidYearDivByFourFails(){
    new LeapYears();
    int isNotLeapYear = 999;
    assertFalse(LeapYears.isDivByOneHundred(isNotLeapYear));
  }

  @Test
  void validYearDivByFourFails(){
    new LeapYears();
    int isLeapYear = 800;
    assertTrue(LeapYears.isDivByOneHundred(isLeapYear));
  }
}

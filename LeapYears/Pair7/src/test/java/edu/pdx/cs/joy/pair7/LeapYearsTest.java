package edu.pdx.cs.joy.pair7;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

  @Test
  void validLeapYearDiv400() {
    LeapYears leapYears = new LeapYears();
    assertThat(leapYears.isLeapYear(400), equalTo(true));
  }

  @Test
  void isntDivisibleBy400() {
    LeapYears leapYears = new LeapYears();
    assertThat(leapYears.isLeapYear(500), equalTo(false));
  }

  @Test
  void isntIntYearValue() {
    LeapYears leapYears = new LeapYears();
    assertThat(leapYears.isLeapYear(20.00), equalTo(false));
  }
}

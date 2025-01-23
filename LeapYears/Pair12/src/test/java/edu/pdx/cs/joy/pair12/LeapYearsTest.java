package edu.pdx.cs.joy.pair12;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

  @Test
  void check2000()
  {
    LeapYears leapYears = new LeapYears();
    assertThat(leapYears.isLeapYear(2000), equalTo(true));
  }

  @Test
  void check1700() {
    LeapYears leapYears = new LeapYears();
    assertThat(leapYears.isLeapYear(1700), equalTo(false));
  }

  @Test
  void check2008() {
    LeapYears leapYears = new LeapYears();
    assertThat(leapYears.isLeapYear(2008), equalTo(true));
  }

  @Test
  void check2017() {
    LeapYears leapYears = new LeapYears();
    assertThat(leapYears.isLeapYear(2017), equalTo(false));
  }
}

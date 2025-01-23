package edu.pdx.cs.joy.pair11;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    new LeapYears(100);
  }

  @Test
  void checkIfYearsDivisibleBy400AreLeapYears() {
    int year = 4000;
    LeapYears leapyear = new LeapYears(year);
    assertThat(leapyear.year %400, equalTo(0));
  }

  @Test
  void allYearsDivby100Not400Are() {
    int year = 100;
    LeapYears leapyear = new LeapYears(year);
    assertThat(leapyear.year % 100, equalTo(0));
    assertThat(leapyear.year % 400, notEqualTo(0));

  }
}
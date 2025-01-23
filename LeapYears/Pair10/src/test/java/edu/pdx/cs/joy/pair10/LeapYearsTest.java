package edu.pdx.cs.joy.pair10;

import org.junit.jupiter.api.Test;

public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

  @Test
  void year3doesnotleap() {
    assertFalse(LeapYears.isLeapYear(3));
  }

}

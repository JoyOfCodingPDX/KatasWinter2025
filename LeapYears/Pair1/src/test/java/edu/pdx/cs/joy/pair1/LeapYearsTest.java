package edu.pdx.cs.joy.pair1;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeapYearsTest
{
  LeapYears example = new LeapYears();
  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

  @Test
  void canInputYear() {
    example.leapYears(2009);
  }

  @Test //All years divisible by 400 ARE leap years (so, for example, 2000 was indeed a leap year),
  void isDivisibleByFourHundred() {
    assertEquals(example.leapYears(2000),true);
    assertEquals(example.leapYears(2),false);
    assertEquals(example.leapYears(400),true);
    assertEquals(example.leapYears(800),true);
  }
  @Test //All years divisible by 100 but not by 400 are NOT leap years (so, for example, 1700, 1800, and 1900 were NOT leap years, NOR will 2100 be a leap year),
  void isDivisibleBy100butnotby400() {
    assertEquals(example.leapYears(1700),false);
    assertEquals(example.leapYears(1800),false);
    assertEquals(example.leapYears(1900),false);
    assertEquals(example.leapYears(2100),false);
    assertEquals(example.leapYears(400),true);
    assertEquals(example.leapYears(800),true);
  }

  @Test // All years divisible by 4 but not by 100 ARE leap years (e.g., 2008, 2012, 2016),
  void isDivisibleBy4butnotby100() {
    assertEquals(example.leapYears(2008),true);
    assertEquals(example.leapYears(2012),true);
    assertEquals(example.leapYears(2016),true);
  }

  @Test // All years not divisible by 4 are NOT leap years (e.g. 2017, 2018, 2019).
  void isnotdivisiblebyfour() {
    assertEquals(example.leapYears(2017),false);
    assertEquals(example.leapYears(2018),false);
    assertEquals(example.leapYears(2019),false);
  }
}
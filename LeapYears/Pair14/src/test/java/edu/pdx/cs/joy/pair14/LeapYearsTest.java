package edu.pdx.cs.joy.pair14;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

  @Test
  void testAllYearsNotDivisibleBy4() {

    LeapYears lp = new LeapYears();

    int year = 2005;
    assertFalse(lp.checkYear(year));

  }

  @Test
  void testAllYearsDivisibleBy4() {
    LeapYears lp = new LeapYears();

    int year = 2004;
    assertTrue(lp.checkYear(year));
  }

  @Test
  void testAllYearsNotDivisibleBy100() {
    LeapYears lp = new LeapYears();
    int year = 2001;
    assertFalse(lp.checkYear(year));
  }
}

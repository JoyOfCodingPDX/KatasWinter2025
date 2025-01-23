package edu.pdx.cs.joy.pair14;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.is;

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
    assert (lp.checkYear(year) is(true));

  }


}

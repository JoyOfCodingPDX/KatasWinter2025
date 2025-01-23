package edu.pdx.cs.joy.pair11;

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
  void checkIfYearsDivisibleBy400AreLeapYears() {
    int year = 5000;
    LeapYears leapyear = new LeapYears(year);
    assertThat(leapyear.year %400, equalTo(0));
    
  }
}
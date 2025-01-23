package edu.pdx.cs.joy.pair15;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    LeapYears testLeap = new LeapYears(42);
  }

  @Test
  void testGetYear(){
    LeapYears testLeap = new LeapYears(42);
    int result = testLeap.returnYear();
    assertEquals(result, 42);
  }

  @Test
  void isLeapYear(){
    LeapYears isLeapYear = new LeapYears(2000);
    assertEquals(isLeapYear.isLeapYear(), true);
  }

}

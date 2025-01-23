package edu.pdx.cs.joy.pair9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }
  @Test
  void testYearDivisibleByFour(){
    LeapYears testLeap = new LeapYears(64);
    boolean result = testLeap.yearDivisibleByFour();
    assertEquals(result, true);
  }
  @Test
  void testYearDivisibleByFourHundred(){
    LeapYears testLeap = new LeapYears(400);
    boolean result = testLeap.yearDivisibleByFourHundred();
    assertEquals(result, true);
  }
  @Test
  void testYearDivisibleByHundred(){
    LeapYears testLeap = new LeapYears(400);
    boolean result = testLeap.yearDivisibleByHundred();
    assertEquals(result, true);
  }

}

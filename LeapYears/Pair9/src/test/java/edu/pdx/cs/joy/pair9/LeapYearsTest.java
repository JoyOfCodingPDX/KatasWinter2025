package edu.pdx.cs.joy.pair9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    LeapYears leapYears = new LeapYears();
  }
  @Test
  void testYearDivisibleByFour(){
    LeapYears testLeap = new LeapYears();
    boolean result = testLeap.yearDivisibleByFour(400);
    assertEquals(result, true);
  }
  @Test
  void testYearDivisibleByFourHundred(){
    LeapYears testLeap = new LeapYears();
    boolean result = testLeap.yearDivisibleByFourHundred(300);
    assertEquals(result, true);
  }
  @Test
  void testYearDivisibleByHundred(){
    LeapYears testLeap = new LeapYears();
    boolean result = testLeap.yearDivisibleByHundred(200);
    assertEquals(result, true);
  }

}

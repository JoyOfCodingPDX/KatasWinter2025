package edu.pdx.cs.joy.pair9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeapYearsTest
{

  @Test
  void testNegativeNumbers(){
    LeapYears testLeap = new LeapYears();
    boolean isLeap = testLeap.isLeapYear(-3284);
    assertEquals(isLeap, false);
  }

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
    boolean result = testLeap.yearDivisibleByFourHundred(400);
    assertEquals(result, true);
  }
  @Test
  void testYearDivisibleByHundred(){
    LeapYears testLeap = new LeapYears();
    boolean result = testLeap.yearDivisibleByHundred(200);
    assertEquals(result, true);
  }

  @Test
  void testisLeapYear(){
    LeapYears testLeap = new LeapYears();
    boolean isLeap = testLeap.isLeapYear(400);
    assertEquals(isLeap, true);
  }

  @Test
  void testisLeapYearNonLeapValue(){
    LeapYears testLeap = new LeapYears();
    boolean isLeap = testLeap.isLeapYear(2025);
    assertEquals(isLeap, false);
  }
  @Test
  void testIsLeapYearForYearDivisibleByFourButNotHundred(){
    LeapYears testLeap = new LeapYears();
    boolean isLeap = testLeap.isLeapYear(2024);
    assertEquals(isLeap, true);
  }

}

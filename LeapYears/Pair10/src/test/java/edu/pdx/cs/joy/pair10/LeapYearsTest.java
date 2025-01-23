package edu.pdx.cs.joy.pair10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

  @Test
  void year3doesNotLeap() {
    assertFalse(LeapYears.isLeapYear(3));
  }

  @Test
  void year4leaps(){
    assertTrue(LeapYears.isLeapYear(4));
  }

  @Test
  void skipOncePerCentury(){
    assertFalse(LeapYears.isLeapYear(100));
  }

  @Test
  void year2000Leaps(){
    assertTrue(LeapYears.isLeapYear(2000));
  }

  @Test
  void year2007DoesNotLeap(){
    assertFalse(LeapYears.isLeapYear(2007));
  }

}

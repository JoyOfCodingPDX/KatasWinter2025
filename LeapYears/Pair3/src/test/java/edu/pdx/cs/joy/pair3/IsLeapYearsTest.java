package edu.pdx.cs.joy.pair3;

import org.junit.jupiter.api.Test;

public class IsLeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    new IsLeapYears();
  }

  @Test
  void isNotLeapYear(){
    IsLeapYears check = new IsLeapYears();
    assert(false == check.isLeapYear(2001));
  }

  @Test
  void isLeapYear(){
    IsLeapYears check = new IsLeapYears();
    assert(true == check.isLeapYear(2400));
  }

  @Test
  void isNotLeapfor100s(){
    IsLeapYears check = new IsLeapYears();
    assert(false == check.isLeapYear(2100));
  }

    @Test
    void isLeapYearBy4(){
      IsLeapYears check = new IsLeapYears();
      assert(true == check.isLeapYear(2044));
    }

}

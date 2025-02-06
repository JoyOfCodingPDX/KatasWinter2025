package edu.pdx.cs.joy.pair3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IsLeapYearsTest
{

  private IsLeapYears check;

  @BeforeEach
  void startVaribles(){
    check = new IsLeapYears();
  }

  @Test
  void canInstantiateKataClass() {
    new IsLeapYears();
  }

  @Test
  void isNotLeapYear(){
    assert(false == check.isLeapYear(2001));
  }

  @Test
  void isLeapYear(){
    assert(true == check.isLeapYear(2400));
  }

  @Test
  void isNotLeapfor100s(){
    assert(false == check.isLeapYear(2100));
  }

  @Test
  void isLeapYearBy4(){
    IsLeapYears check = new IsLeapYears();
    assert(true == check.isLeapYear(2044));
  }

  @Test
  void isNotLeapBy4(){
    IsLeapYears check = new IsLeapYears();
    assert(false == check.isLeapYear(2025));
  }

}

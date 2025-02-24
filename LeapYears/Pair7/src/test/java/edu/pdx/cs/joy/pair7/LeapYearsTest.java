package edu.pdx.cs.joy.pair7;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

  @Test
  void validLeapYearDiv400() {
    LeapYears leapYears = new LeapYears();
    assertThat(leapYears.isLeapYear(400), equalTo(true));
  }

  @Test
  void isntDivisibleBy400() {
    LeapYears leapYears = new LeapYears();
    assertThat(leapYears.isLeapYear(500), equalTo(false));
  }

  @Test
  void divBy100Not400() {
  LeapYears leapYears = new LeapYears();
  assertThat(leapYears.isLeapYear(2100), equalTo(false));
  assertThat(leapYears.isLeapYear(1700), equalTo(false));
  assertThat(leapYears.isLeapYear(1800), equalTo(false));
  }

  @Test
  void divBy4NotBy100IsLeapYear() {
    LeapYears leapYears = new LeapYears();
    assertThat(leapYears.isLeapYear(2012), equalTo(true));
  }

  @Test
  void notDivBy4IsNotLeapYear() {
    LeapYears leapYears = new LeapYears();
    assertThat(leapYears.isLeapYear(2019), equalTo(false));
  }

  @Test
  void check2024isLeapYear() {
    LeapYears leapYears = new LeapYears();
    assertThat(leapYears.isLeapYear(2024), equalTo(true));
  }

    @Test
  void check2020isLeapYear() {
    LeapYears leapYears = new LeapYears();
    assertThat(leapYears.isLeapYear(2020), equalTo(true));
  }

  void hundredIsLeapYear() {
    LeapYears leapYears = new LeapYears();
    assertThat(leapYears.isLeapYear(100), equalTo(true));
  }

  @Test
  void fourIsLeapYear() {
    LeapYears leapYears = new LeapYears();
    assertThat(leapYears.isLeapYear(4), equalTo(true));
  }

}

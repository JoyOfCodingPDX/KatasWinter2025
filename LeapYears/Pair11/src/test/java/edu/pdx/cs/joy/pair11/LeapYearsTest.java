package edu.pdx.cs.joy.pair11;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.MatcherAssert.Assert;

//import org.junit.jupiter.Assert;
//import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;


public class LeapYearsTest
{
/*
  @BeforeEach
  void SetUp(){
    int[] years = {};
    
  }
*/
  @Test
  void canInstantiateKataClass() {
    new LeapYears(100);
  }

  @Test
  void checkIfYearsDivisibleBy400AreLeapYears() {
    int year = 4000;
    LeapYears leapyear = new LeapYears(year);
    assertThat(leapyear.year %400, equalTo(0));
  }

  @Test
  void allYearsDivby100Not400Are() {
    int year = 100;
    LeapYears leapyear = new LeapYears(year);
    assertThat(leapyear.year % 100, equalTo(0));
    //assertThat(leapyear.year % 400, notEqualTo(0));
  }

  @Test
  void allYearsDivby4Not100Are(){
    int[] years = {2008,2012,2016};
    int[] answers = {8, 12, 16};

    for (int i=0; i<years.length;i++){
      LeapYears leapyear = new LeapYears(years[i]);

      assertThat(leapyear.year %4,equalTo(0));
      assertThat(leapyear.year %100, equalTo(answers[i]));
      //Assert.assertNotEquals(leapyear.year %100,0);
    }
  }

  @Test
  void allYearsNotDivby4NotLeapYear(){
    int[] years = {2017,2018,2019};
    int[] answers = {1,2,3};

    for (int i=0; i<years.length;i++){
      LeapYears leapyear = new LeapYears(years[i]);

      assertThat(leapyear.year %4,equalTo(answers[i]));
  }

}
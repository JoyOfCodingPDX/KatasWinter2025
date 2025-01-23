package edu.pdx.cs.joy.pair11;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Assert;
import static org.hamcrest.Matchers.equalTo;


public class LeapYearsTest
{

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
    assertThat(leapyear.year % 400, notEqualTo(0));
  }

  @Test
  void allYearsDivby4Not100Are(){
    int[] years = {2008,2009,2016};

    for (int i=0; i<years.length;i++){
      LeapYears leapyear = new LeapYears(years[i]);

      assertThat(leapyear.year %4,equalTo(0));
      Assert.assertNotEquals(leapyear.year %100,0);
    }
  }

}
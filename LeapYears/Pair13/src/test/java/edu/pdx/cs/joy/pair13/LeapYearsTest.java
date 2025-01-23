package edu.pdx.cs.joy.pair13;

import org.junit.jupiter.api.Test;

public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    new LeapYears();
    LeapYears.leapyear(2000);
  }

  @Test
  void test_leap_year(){
    // Test leap year
    // All years divisible by 400 ARE leap years (so, for example, 2000 was indeed a leap year),
    // All years divisible by 100 but not by 400 are NOT leap years (so, for example, 1700, 1800, and 1900 were NOT leap years, NOR will 2100 be a leap year),
    // All years divisible by 4 but not by 100 ARE leap years (e.g., 2008, 2012, 2016)
    // All years not divisible by 4 are NOT leap years (e.g. 2017, 2018, 2019).

    // if passes tests returns true or 1
    //int year  = 0;
    //if(year % 4 == 0){

    }
  }
}

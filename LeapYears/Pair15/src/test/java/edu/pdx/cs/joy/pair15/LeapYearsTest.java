package edu.pdx.cs.joy.pair15;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeapYearsTest
{

  LeapYears testLeap = new LeapYears(2008);

  @Test
  void canInstantiateKataClass() {
    LeapYears testLeap = new LeapYears(42);
  }

  @Test
  void testGetYear(){
    int result = testLeap.returnYear();
    assertEquals(result, 2008);
  }

  @Test
  void isLeapYear(){
    assertEquals(testLeap.isLeapYear(), true);
  }

  @Test
  void isFalse(){
    LeapYears falseLeap = new LeapYears(2007);
    assertEquals(falseLeap.isLeapYear(), false);
  }

}

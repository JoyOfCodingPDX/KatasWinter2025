package edu.pdx.cs.joy.pair4;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeapYearsTest {
  class InputResult {
    int year;
    boolean isLeap;

    public InputResult(int year, boolean isLeap) {
      this.year = year;
      this.isLeap = isLeap;
    }
  }

  List<InputResult> years;

//  @Test
//  void sampleTest1(){
    public LeapYearsTest() {
      years = new ArrayList<InputResult>(Arrays.asList(new InputResult[]{}));
  }

  @Test
  void canInstantiateKataClass() {
    LeapYears ly = new LeapYears();
    years = new ArrayList<InputResult>(Arrays.asList(new InputResult[]{
            new InputResult(1700, false),
            new InputResult(1800, false),
            new InputResult(1900, false),
            new InputResult(2000, true),
            new InputResult(2008, false),
            new InputResult(2012, false),
            new InputResult(2016, false),
            new InputResult(2017, false),
            new InputResult(2018, false),
            new InputResult(2019, false),
            new InputResult(2100, false)
    }));
    for (InputResult year : years) {
      assert (ly.test1(year.year) == year.isLeap);
    }
  }
  @Test
  void testForFunctionTwo() {
    LeapYears ly = new LeapYears();
    years = new ArrayList<InputResult>(Arrays.asList(new InputResult[]{
            new InputResult(1704, true),
            new InputResult(1708, true),
            new InputResult(1928, true),
            new InputResult(2000, false),
            new InputResult(2008, true),
            new InputResult(2012, true),
            new InputResult(2016, true),
            new InputResult(2017, false),
            new InputResult(2018, false),
            new InputResult(2019, false),
            new InputResult(2100, false)
    }));
    for (InputResult year : years) {
      assert (ly.test2(year.year) == year.isLeap);
    }
  }

















}

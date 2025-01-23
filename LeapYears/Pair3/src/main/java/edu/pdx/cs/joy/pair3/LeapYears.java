package edu.pdx.cs.joy.pair3;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class LeapYears {

  public boolean IsLeapYear(int year){
    boolean check_leap = year % 400 == 0;
      return check_leap;
  }

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }
}
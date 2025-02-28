package edu.pdx.cs.joy.pair12;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class LeapYears {

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public Boolean isLeapYear(int year) {
    if (year % 400 == 0) {
      return true;
    }
    else if (year % 100 == 0) {
      return false;
    } else return year % 4 == 0;
  }
}
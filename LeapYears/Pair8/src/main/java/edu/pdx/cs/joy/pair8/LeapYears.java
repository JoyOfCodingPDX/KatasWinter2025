package edu.pdx.cs.joy.pair8;

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
    for (String arg : args) {
      int year = Integer.parseInt(arg);
      if (leapYears(year)) {
        System.out.println(year + " is a leap year");
      }
      else {
        System.out.println(year + " is not a leap year");
      }
    }
    System.err.println("Missing command line arguments");
  }

  public static boolean leapYears( int year) {
    return (year % 400 == 0 || year % 4 == 0 && year % 100 != 0);
  }
}
package edu.pdx.cs.joy.pair10;

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

  public static boolean isLeapYear(int year){

    if ((year % 4  ) != 0) return false;
    if ((year % 400) == 0) return true;
    if ((year % 100) == 0) return false;

    return true;
  }
}
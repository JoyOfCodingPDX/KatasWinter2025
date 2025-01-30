package edu.pdx.cs.joy.pair4;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class LeapYears {
  public static boolean test1(int year) {
    return year % 400 == 0;
  }

  public static boolean test2(int year) {
     return year % 4 == 0 ? year % 100 != 0 : false;
//    if (year % 4 == 0) {
//      if (year % 100 != 0) {
//        return true;
//      }
//     else { return false; }
//    }
//    return false;
  }

  @VisibleForTesting
  public static void main(String[] args) {
//    if (args.length < 1) {
//      System.err.println("Missing command line arguments");
//      return;
//    }
    LeapYears leapYears = new LeapYears();
//    boolean result = test1(5);
  }
}
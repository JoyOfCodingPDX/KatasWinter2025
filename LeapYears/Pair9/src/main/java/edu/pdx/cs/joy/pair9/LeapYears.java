package edu.pdx.cs.joy.pair9;

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

  public boolean yearDivisibleByFour(int year){
    return year%4==0;
  }

  public boolean yearDivisibleByFourHundred(int year){
    return year%400==0;
  }

  public boolean yearDivisibleByHundred(int year){
    return year%100==0;
  }
  public boolean isLeapYear(int year){
    if(year<0)return false;
    if (yearDivisibleByFourHundred(year)) {
      return true;
    } else if (yearDivisibleByHundred(year)) {
      return false;
    } else if (yearDivisibleByFour(year)) {
      return true;
    }
    return false;
  }
}
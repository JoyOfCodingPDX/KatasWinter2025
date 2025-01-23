package edu.pdx.cs.joy.pair9;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class LeapYears {

  int year;
  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public LeapYears(int year){
    this.year=year;
  }

  public boolean yearDivisibleByFour(){
    return year%4==0;
  }

  public boolean yearDivisibleByFourHundred(){
    return year%400==0;
  }

  public boolean yearDivisibleByHundred(){
    return year%100==0;
  }
}
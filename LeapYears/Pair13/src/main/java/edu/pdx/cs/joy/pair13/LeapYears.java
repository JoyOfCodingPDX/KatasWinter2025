package edu.pdx.cs.joy.pair13;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class LeapYears {
  public  static void leapyear(int value){
    if (value % 4 == 0 ){
      System.out.print("is a leap year");
    }
  }
  @VisibleForTesting
  // int = 0000 = 0    String = 0000  int = 0986 = 986
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
    // expected command line execution is "./LeapYears 1957"

    // user enters in year place in User_year variable
    //int user_year = Integer.pasrseInt(args[0]);
    int user_year = 2000;
    // Call test function and get return value
    // Integer valid = LeapYearsTest(user_year)
    // if return == 1
    //      OutPut MSG: "Yes the year entered is a leap year"
    // System.out.print("Yes the year entered is a leap year")
    // else
    //      OutPut MSG: "No the year entered is not a leap year"
    // System.out.print("No the year entered is not a leap year")
    leapyear(user_year);
  }
}
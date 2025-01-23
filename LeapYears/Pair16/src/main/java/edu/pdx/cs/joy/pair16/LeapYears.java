package edu.pdx.cs.joy.pair16;

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
    int testYear = Integer.parseUnsignedInt(args[0]);
    determineLeapYear(testYear);

    //System.err.println("Missing command line arguments");
  }

  public static boolean isDivByFourHundred(int year){
    return (year % 400 == 0);
  }

  public static boolean isDivByOneHundred(int year){
    return (year % 100 == 0);
  }

  public static boolean isDivByFour(int year){
    return (year % 4 == 0);
  }

  public static boolean determineLeapYear(int year){

    // Is it divisible by 400?
    if(isDivByFourHundred(year)){
      System.out.println("Leap Year");
      return true;
    }
    // NOT divisible by 400, Check 100
    else if(isDivByOneHundred(year)){
      System.out.println("Not a Leap Year");
      return false;
    }
    else if(isDivByFour(year)) {
      System.out.println("Leap Year");
      return true;
    }
    else{
      System.out.println("Not a Leap Year");
      return false;
    }


  }





}
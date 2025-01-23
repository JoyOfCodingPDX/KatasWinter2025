package edu.pdx.cs.joy.pair15;

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

  public int returnYear(){
    return this.year;
  }

  public boolean isLeapYear(){
    int current = this.year;
    if ( current  % 400 == 0 || current % 4 ==0 ){
      return true;
    } else if ( current % 100 == 0 && current % 400 != 0 ) {
      return false;
    } else if(current % 4 == 0 && current % 100 != 0){
      return true;
    }
    return false;
  }

}
package edu.pdx.cs.joy.pair1;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Diamond {

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public String fizzBuzz(int i) {
    if(i % 3 == 0 && i % 5 == 0) {
      return "FizzBuzz";
    }
    if (i % 5 == 0) {
      return "Buzz";
    }
    if (i % 3 == 0) {
      return "Fizz";
    }

    return String.valueOf(i);
  }
}
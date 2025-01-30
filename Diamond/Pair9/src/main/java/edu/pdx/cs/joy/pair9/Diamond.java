package edu.pdx.cs.joy.pair9;

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
    if (args.length == 0) {
      System.err.println("Error: Please provide exactly one letter as input.");
      return;
    }

    if (args[0].length() != 1 || !Character.isLetter(args[0].charAt(0))) {
      System.err.println("Error: Input must be a single letter (A-Z or a-z).");
      return;
    }
  }
}
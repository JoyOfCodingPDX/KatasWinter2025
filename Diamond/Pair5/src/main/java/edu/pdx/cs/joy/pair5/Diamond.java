package edu.pdx.cs.joy.pair5;

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
    if(args.length != 1) {
      System.err.println("Usage: java -jar edu.pdx.cs.joy.pair5.Diamond <filename>");
    }
    char letter = args[0].charAt(0);
  }

  public static void printDiamond(char letter) {
    if(letter < 'A' || letter > 'Z') {
      System.err.println("No letter provided.");
    }
  }
}

package edu.pdx.cs.joy.pair12;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Diamond {

  static void printDiamond(char letter) {

    StringBuilder diamondString = new StringBuilder();

    int whiteSpace = letter - 'A';

    for (char start = 'A'; start <= letter; start++ ) { // loop until printing middle char
      for (int i = 0; i <= whiteSpace; i++) {
        diamondString.append(" ");
      }
      diamondString.append(start);
    }
  }

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }
}
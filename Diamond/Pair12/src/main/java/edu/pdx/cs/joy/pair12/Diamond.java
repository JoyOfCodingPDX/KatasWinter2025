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


    int whiteSpace = letter - 'A';
    int i = 0;
    for (char start = 'A'; start <= letter; start++ ) { // loop until printing middle char
      String line = "";

      for (int j = 0; j <= whiteSpace; j++) {
        line += " ";
      }
      whiteSpace--;
      System.out.println(line);
    }
  }

  @VisibleForTesting
  public static void main(String[] args) {
    printDiamond('C');
  }
}
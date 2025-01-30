package edu.pdx.cs.joy.pair9;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Diamond {

  private static void printDiamond(char letter) {
    int size = letter - 'A';
    StringBuilder output = new StringBuilder();

    for (int i = 0; i <= size; i++) {
      output.append(getDiamondLine(i, size)).append("\n");
    }
    for (int i = size - 1; i >= 0; i--) {
      output.append(getDiamondLine(i, size)).append("\n");
    }

    System.out.print(output);
  }

  private static String getDiamondLine(int row, int size) {
    char currentLetter = (char) ('A' + row);
    StringBuilder line = new StringBuilder(" ".repeat(size - row));

    line.append(currentLetter);
    if (row > 0) {
      line.append(" ".repeat(row * 2 - 1)).append(currentLetter);
    }

    return line.toString();
  }

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
    char letter = args[0].charAt(0);

    printDiamond(Character.toUpperCase(letter));
  }
}
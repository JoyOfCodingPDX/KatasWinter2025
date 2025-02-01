package edu.pdx.cs.joy.pair4;

import com.google.common.annotations.VisibleForTesting;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Diamond {
  static ArrayList<String> alpha = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
      "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"));

  private static void printRows(int spacesInMiddle, int curr, int index) {
    System.out.println(" ".repeat(index - curr) + alpha.get(curr) + " ".repeat(spacesInMiddle) + alpha.get(curr));
    if (curr == index || index == 0) {
      return;
    }
    printRows(spacesInMiddle + 2, curr + 1,
        index);
    System.out.println(" ".repeat(index - curr) + alpha.get(curr) + " ".repeat(spacesInMiddle) + alpha.get(curr));
  }

  @VisibleForTesting
  public static void main(String[] args) {
    char letter = args[0].charAt(0);
    int index = alpha.indexOf(String.valueOf(letter));
    int curr = 0;
    System.out.println(" ".repeat(index) + alpha.get(0));
    if (index != 0) {
      // print remaining rows
      printRows(1, curr + 1, index);
      System.out.println(" ".repeat(index) + alpha.get(0));
    }
  }
}
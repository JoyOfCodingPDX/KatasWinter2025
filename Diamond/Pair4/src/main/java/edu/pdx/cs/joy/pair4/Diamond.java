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

  private static void printSingleCharRow(int index) {
    System.out.println(" ".repeat(index) + alpha.get(0));
  }

  private static void printDoubleCharRow(int spacesInMiddle, int curr, int index) {
    System.out.println(" ".repeat(index - curr) + alpha.get(curr) + " ".repeat(spacesInMiddle) + alpha.get(curr));
    if (curr == index || index == 0) {
      return;
    }
    printDoubleCharRow(spacesInMiddle + 2, curr + 1, index);
    System.out.println(" ".repeat(index - curr) + alpha.get(curr) + " ".repeat(spacesInMiddle) + alpha.get(curr));
  }

  @VisibleForTesting
  public static void main(String[] args) {
    int index = alpha.indexOf(String.valueOf(args[0].charAt(0)));
    printSingleCharRow(index);
    if (index != 0) {
      printDoubleCharRow(1, 1, index);
      printSingleCharRow(index);
    }
  }
}
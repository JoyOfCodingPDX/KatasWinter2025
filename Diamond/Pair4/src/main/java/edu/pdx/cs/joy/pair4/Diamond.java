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

  private static void printSpaces(int index) {
    for (int i = 0; i < index; i++) {
      System.out.print(" ");
    }
  }

  private static void printTopRow(int index) {
    printSpaces(index);
    System.out.println(alpha.get(0));
  }

  private static void printRows(int spacesBefore, int spacesInMiddle, int curr, int index) {
    printSpaces(spacesBefore);
    System.out.print(alpha.get(curr));
    printSpaces(spacesInMiddle);
    System.out.print(alpha.get(curr));
    System.out.println();
    if (curr == index) {
      return;
    }
    printRows(spacesBefore - 1, spacesInMiddle + 2, curr + 1,
        index);
    printSpaces(spacesBefore);
    System.out.print(alpha.get(curr));
    printSpaces(spacesInMiddle);
    System.out.print(alpha.get(curr));
    System.out.println();
  }

  @VisibleForTesting
  public static void main(String[] args) {
    char letter = args[0].charAt(0);
    int index = alpha.indexOf(String.valueOf(letter));
    Diamond.printTopRow(index);
    if (index != 0) {
      // print remaining rows
      printRows(index - 1, 1, 1, index);
      Diamond.printTopRow(index);
    }
  }
}
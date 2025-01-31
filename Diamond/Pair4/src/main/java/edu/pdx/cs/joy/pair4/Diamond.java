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
   static ArrayList<String> alpha = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"));

  public void print(String letter, int index){
    System.out.print(letter);
    if (index > 0) {
      printSpaces(index);
    }
  }

  private static void printSpaces(int index) {
    for (int i = 0; i < index; i++) {
      System.out.print(" ");
    }
  }

  private static void printTopRow(int index) {
    printSpaces(index);
    System.out.print(alpha);
  }

  private static int getSpacesInMiddle(int curr, boolean building) {
    return building ? curr + 2 : curr - 2;
  }
  private static int getSpacesBeforeAfter(int curr, boolean building) {
    return building ? curr - 1 : curr + 1;
  }


  private static void printRows(int spacesBefore, int spacesInMiddle, int index, boolean building) {
    if(spacesBefore == index - 1 && !building) {
      return;
    }
    printSpaces(spacesBefore);
    System.out.print(alpha);
    printSpaces(spacesInMiddle);
    System.out.println();
    if (spacesBefore <= 0) {
      building = !building;
    }
    printRows(getSpacesBeforeAfter(spacesBefore, building), getSpacesInMiddle(spacesInMiddle, building), index, building);
  }


  @VisibleForTesting
  public static void main(String[] args) {
    char letter = args[0].charAt(0);
    int index = alpha.indexOf(String.valueOf(letter));
    Diamond.printTopRow(index);
    if (index != 0){
      // print remaining rows
      printRows(index - 1, 1, index, true);
    }
    printTopRow(0);
  }
}
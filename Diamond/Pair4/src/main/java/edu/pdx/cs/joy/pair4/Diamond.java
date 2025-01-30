package edu.pdx.cs.joy.pair4;

import com.google.common.annotations.VisibleForTesting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Diamond {

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
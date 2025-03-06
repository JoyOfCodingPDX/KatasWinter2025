package edu.pdx.cs.joy.mob2;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Minesweeper {

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public static char[][] read(String[] strArray) {
    String var = strArray[0];
    String[] nums = var.split(" ");

    int rows = Integer.parseInt(nums[0]);
    int cols = Integer.parseInt(nums[1]);

    char [][] out = new char[rows][cols];

    for (int row = 0; row < rows; row++){
      for(int col = 0; col < cols; col++){
        out[row][col] = strArray[row + 1].charAt(col);
      }
    }
    return out;
  }


}
package edu.pdx.cs.joy.mob4;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Minesweeper {

public static char[][] solve(char[][] grid) {
  int rows = grid.length;
  int cols = grid[0].length;
  char[][] result = new char[rows][cols];
  for (int i = 0; i < rows; i++) {
    for (int j = 0; j < cols; j++) {
      result[i][j] = grid[i][j];
      if (grid[i][j] == '*') {

      }
    }
  }
    return result;
}
  @VisibleForTesting
  public static void main(String[] args)
  {
    char[][] inputGrid={
            {'*','.','.'},
            {'*','.','.'}

    };

    System.err.println("Missing command line arguments");
  }
}
package edu.pdx.cs.joy.mob1;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Minesweeper {

  private char[][] grid;


  public char[][] getGrid() {
    return grid;
  }

  public int getWidth() {
    return grid.length;
  }

  public int getHeight() {
    // second inner
    return grid[0].length;
  }

  public void createGrid(int width, int height) {
    this.grid = new char[width][height];
  }

  public void displayGrid() {

  }

  @VisibleForTesting
  public static void main(String[] args) {
    System.out.println("For room one!");
    System.err.println("Missing command line arguments");

    // 2d Array:
  }

}
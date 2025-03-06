package edu.pdx.cs.joy.mob1;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Minesweeper {

  private String[][] grid;
  public Minesweeper(int height, int width) {
    this.grid = new String[height][width];

    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        this.grid[i][j] = ".";
      }
    }
  }


  public int getWidth() {
    return grid.length;
  }

  public int getHeight() {
    // second inner
    return grid[0].length;
  }

  public void populateGrid(String gridInput) {
    String[] rows = gridInput.split("\n");
    /* 
    for (int i = 0; i < rows.length; i++) {
      if (rows[i].equals("*")) {
        rows[i] = "\uD83D\uDCA3";
      }
    }
    */
    
    for (int i = 0; i < rows.length; i++) {
      for (int j = 0; j < rows[i].length(); j++) {
        grid[i][j] = rows[i].charAt(j) + "";
      }
    }

    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {
        if (grid[i][j].equals(".")) {
          grid[i][j] = "0";
        }
      }
    }

    for (int i = 0; i<grid.length;i++){
      for (int j = 0; j<grid[i].length;j++){
        
        if (i<1){
          if (j<1) { // top left corner
            if (grid[i+1][j]=="*"){
              grid[i][j] = Integer.toString(Integer.parseInt(grid[i][j])+1);
            }
            else if (grid[i][j+1]=="*"){
              grid[i][j] = Integer.toString(Integer.parseInt(grid[i][j])+1);
            }
            else if (grid[i+1][j+1]=="*"){
              grid[i][j] = Integer.toString(Integer.parseInt(grid[i][j])+1);
            }
          }
          else if (j == grid.length - 1){ // top right corner
            if (grid[i+1][j]=="*"){
              grid[i][j] = Integer.toString(Integer.parseInt(grid[i][j])+1);
            }
            else if (grid[i][j-1]=="*"){
              grid[i][j] = Integer.toString(Integer.parseInt(grid[i][j])+1);
            }
            else if (grid[i+1][j-1]=="*"){
              grid[i][j] = Integer.toString(Integer.parseInt(grid[i][j])+1);
            }
          }
          else { // top row
            if (grid[i+1][j]=="*"){
              grid[i][j] = Integer.toString(Integer.parseInt(grid[i][j])+1);
            }
            else if (grid[i][j-1]=="*"){
              grid[i][j] = Integer.toString(Integer.parseInt(grid[i][j])+1);
            }
            else if (grid[i+1][j-1]=="*"){
              grid[i][j] = Integer.toString(Integer.parseInt(grid[i][j])+1);
            }
            else if (grid[i+1][j+1]=="*"){
              grid[i][j] = Integer.toString(Integer.parseInt(grid[i][j])+1);
            }
            else if (grid[i][j+1]=="*"){
              grid[i][j] = Integer.toString(Integer.parseInt(grid[i][j])+1);
            }
          }
        }

      }
    }

  }

  public void displayGrid() {

  }

  @VisibleForTesting
  public static void main(String[] args) {
    System.out.println("For room one!");
    System.err.println("Missing command line arguments");

    // 2d Array:
  }
  public void calculateBombProx(String input) {

  }

}
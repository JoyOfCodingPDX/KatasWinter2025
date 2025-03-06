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

  public static char[][] fillNumbers(char[][] input){
    int row = input.length;
    int col = input[0].length;
    for(int r = 0; r < row; r++){
      for(int c = 0; c < col; c++){
        if(input[r][c] == '.'){
          int mines = 0;
          int x = r -1;
          if(0 <= x && x >= row){
            
          }

          input[r][c] = (char)mines;
        }
        

      }
    }

    return input;
  }


}
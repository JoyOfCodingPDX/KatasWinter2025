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
    int mines = 0;
    for(int r = 0; r < row; r++){
      for(int c = 0; c < col; c++){
        if(input[r][c] == '.'){


          if (r-1 >= 0 && c -1 >=0){ if (input[r-1][c-1] == '*'){mines++;}} // topleft
          if (r-1 >= 0 ){ if (input[r-1][c] == '*'){mines++;}} // topmid
          if (r-1 >= 0 && c +1 <col){ if (input[r-1][c+1] == '*'){mines++;}} // topright

          if (c -1 >=0){ if (input[r][c-1] == '*'){mines++;}}
          if (c +1 <col){ if (input[r][c+1] == '*'){mines++;}}

          if (r+1 < row && c -1 >=0){ if (input[r+1][c-1] == '*'){mines++;}} // botleft
          if (r+1 < row ){ if (input[r+1][c] == '*'){mines++;}} // botmid
          if (r+1 < row && c +1 <col){ if (input[r+1][c+1] == '*'){mines++;}} // botright

          input[r][c] = (char)('0' +mines);
          mines = 0;
        }


      }
    }

    return input;
  }


}
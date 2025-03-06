package edu.pdx.cs.joy.mob4;

import java.text.CharacterIterator;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Minesweeper {


  public boolean valid(int i, int j, int n, int m){
    return i>=0 && j>=0 && i<n && j<m;
  }

public char[][] solve(int rows, int cols, char[][] grid) {

  char[][] result = new char[rows][cols];
  for (int i = 0; i < rows; i++) {
    for (int j = 0; j < cols; j++) {
      // result[i][j] = grid[i][j];
      if (grid[i][j] == '*') {

        if(valid(i-1,j-1,rows, cols) && grid[i-1][j-1]!='*'){
          int val = Character.getNumericValue(grid[i-1][j-1]);
          val++;
          grid[i-1][j-1] = (char) (val + '0'); //'1'+'0'
        }
        if(valid(i-1,j,rows, cols) && grid[i-1][j]!='*'){
          int val = Character.getNumericValue(grid[i-1][j]);
          val++;
          grid[i-1][j] = (char) (val+'0');
        }
        if(valid(i-1,j+1,rows, cols) && grid[i-1][j+1]!='*'){
          int val = Character.getNumericValue(grid[i-1][j+1]);
          val++;
          grid[i-1][j+1] = (char) (val+'0');
        }
        if(valid(i,j-1,rows, cols) && grid[i][j-1]!='*'){
          int val = Character.getNumericValue(grid[i][j-1]);
          val++;
          grid[i][j-1] = (char) (val+'0');
        }
        if(valid(i,j+1,rows, cols) && grid[i][j+1]!='*'){
          int val = Character.getNumericValue(grid[i][j+1]);
          val++;
          grid[i][j+1] = (char) (val+'0');
        }
        if(valid(i+1,j-1,rows, cols) && grid[i+1][j-1]!='*'){
          int val = Character.getNumericValue(grid[i+1][j-1]);
          val++;
          grid[i+1][j-1] = (char) (val+'0');
        }
        if(valid(i+1,j,rows, cols) && grid[i+1][j]!='*'){
          int val = Character.getNumericValue(grid[i+1][j]);
          val++;
          grid[i+1][j] = (char) (val+'0');
        }
        if(valid(i+1,j+1,rows, cols) && grid[i+1][j+1]!='*'){
          int val = Character.getNumericValue(grid[i+1][j+1]);
          val++;
          grid[i+1][j+1] = (char) (val+'0');
        }



      }
    }
  }
  return grid;

    //return result;
}


  @VisibleForTesting
  public static void main(String[] args)
  {
    char[][] inputGrid={
            {'*','0','0'},
            {'*','0','0'}

    };
    
  int rows = inputGrid.length;
  int cols = inputGrid[0].length;
  Minesweeper minesweeper = new Minesweeper();
  inputGrid =minesweeper.solve(rows, cols, inputGrid);
  for(int i=0;i<inputGrid.length;i++){
    for(int j=0;j<inputGrid[0].length;j++){
      System.out.print(inputGrid[i][j]+"\t");
    }
    System.out.println();
  }

    System.err.println("Missing command line arguments");
  }
}
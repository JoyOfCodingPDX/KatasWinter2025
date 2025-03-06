package edu.pdx.cs.joy.mob3;

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
}
 /*
  first function create struture
  array ints [] [];

  ramdon < .25 = -1 // a mine

  -1 = mine
  0 = no mines around
  num > 0 = mines around
  */

  public static String[] parseBoard(String[] data, int width_given, int height_given){
    if (data.length == 0){
      return data;
    }
    int width = data[0].length();
    int height = data.length;
    int[][] board = new int[width][height];

    //TODO: parse input into the board
    for (int x = 0; x < width_given; x++){
      for (int y = 0; y < height_given; y++){
        if (data[x].charAt(y) == '*'){
          board[y][x] = -1;
          //add_around(data, x, y);
        } else {
          if (data[x].charAt(y) == '.'){
            board[y][x] = 0;
          }
        }
      }
    }

    //addaround and stuff
    for (int x = 0; x < width_given; x++){
      for (int y = 0; y < height_given; y++){
        if (board[x][y] == -1){
          //addaround(board, x, y);
          if ((x-1) >= 0) {
            if (board[x-1][y] != -1) {
              board[x-1][y] += 1;
            }
          }
          if ((x+1) < width_given){
            if (board[x+1][y] != -1) {
              board[x+1][y] += 1;
            }
          }
          if ((y-1) >= 0) {
            if (board[x][y-1] != -1) {
              board[x][y-1] += 1;
            }
          }
          if ((y+1) < height_given){
            if (board[x][y+1] != -1) {
              board[x][y+1] += 1;
            }
          }
        }
      }
    }

    // row 1
    // col 1

    return data;
  }


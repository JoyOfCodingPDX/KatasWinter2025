package edu.pdx.cs.joy.mob3;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Minesweeper3 {

  @VisibleForTesting
  public static void main(String[] args) {
    if (args.length == 0) {
      System.err.println("Missing command line arguments");
      throw new IllegalArgumentException("Missing command line arguments");
    }

    if (args.length < 3) {
      System.err.println("Not enough arguments");
      throw new IllegalArgumentException("Not enough arguments");
    }

    String [] data = args[0].split("\n");
    String [] result = parseBoard(data, Integer.parseInt(args[1]), Integer.parseInt(args[2]));

    String finalResult = String.join("\n", result);
    finalResult = finalResult.replaceAll("\r", "");
    finalResult = finalResult.replaceAll("\r", "");
    System.out.println(finalResult.toString());
  }

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
            board[x][y] = -1;
            //add_around(data, x, y);
          } else {
            if (data[x].charAt(y) == '.'){
              board[x][y] = 0;
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
            if ((x-1) >= 0 && (y-1) >= 0){
              if (board[x-1][y-1] != -1) {
                board[x-1][y-1] += 1;
              }
            }
            if ((x-1) >= 0 && (y+1) < height_given){
              if (board[x-1][y+1] != -1) {
                board[x-1][y+1] += 1;
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

            if ((x+1) < width_given && (y-1) >= 0){
              if (board[x+1][y-1] != -1) {
                board[x+1][y-1] += 1;
              }
            }
            if ((x+1) < width_given && (y+1) < height_given){
              if (board[x+1][y+1] != -1) {
                board[x+1][y+1] += 1;
              }
            }

          }
        }
      }

      for (int x = 0; x < width_given; x++){
        for (int y = 0; y < height_given; y++){
          //System.out.print(board[x][y] + " ");
        }
        //System.out.println();
      }
      // row 1
      // col 1
      String[][] Array = new String[width_given][height_given];

      for (int x = 0; x < width_given; x++){
        for (int y = 0; y < height_given; y++){
          if (board[x][y] == -1){
            Array[x][y] = "*";
          } else {
            Array[x][y] = String.valueOf(board[x][y]);
          }
        }
      }
      String[] Finalresult = new String[width_given];
      for (int x = 0; x < width_given; x++){
        Finalresult[x] = String.join("", Array[x]);
      }




      return Finalresult;
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


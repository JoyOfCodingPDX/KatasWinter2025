package edu.pdx.cs.joy.mob5;

import com.google.common.annotations.VisibleForTesting;

import java.util.List;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Minesweeper {

  @VisibleForTesting
  public static void main(String[] args) {
    List<List<String>> matrix = List.of(
            List.of(".", ".", ".", ".", "."),
            List.of(".", ".", ".", ".", "."),
            List.of(".", ".", ".", ".", "."),
            List.of(".", ".", ".", ".", "."),
            List.of(".", ".", ".", ".", ".")
    );

    int xLimit = matrix.get(0).size();
    int yLimit = matrix.size();

    List<List<String>> matrix2 = List.copyOf(matrix);
//    List<List<int>> matrix2 = List.copyOf(matrix);
    for(int i = 0; i < matrix2.size(); i++) {
      for(int j = 0; j < matrix2.get(i).size(); j++) {

      }
    }
  }

  public static int clamp(int value, int limit) {
    return (value < 0) ? 0 : Math.min(value, limit);
  }
}
package edu.pdx.cs.joy.mob5;

import com.google.common.annotations.VisibleForTesting;

import java.util.ArrayList;
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
  }

  public static void MineSweepSolve(List<List<String>> m) {
    List<List<String>> matrix = List.of(
            List.of(".", ".", ".", ".", "."),
            List.of(".", ".", ".", ".", "."),
            List.of(".", ".", ".", ".", "."),
            List.of(".", ".", ".", ".", "."),
            List.of(".", ".", ".", ".", ".")
    );

//    getBox(Coordinate(1, 1), 3, 3, matrix)
    // [ 1, 2, 3, 4]
    // [ 5, 6, 7, 8]
    // [ 9,10,11,12]
    // [13,14,15,16]

    // Result for point at 6 should be
    // Coordinate(1, 1)
    // [ 1, 2, 3]
    // [ 5, 6, 7]
    // [ 9,10,11]

    // Result for point at 1 should be
    // Coordinate(0, 0)
    // [ 1, 2]
    // [ 5, 6]

    int xLimit = matrix.get(0).size();
    int yLimit = matrix.size();

    ArrayList<ArrayList<Coordinate>> coordinateMatrix = new ArrayList<>();
    for(int i = 0; i < matrix.size(); i++) {
      ArrayList<Coordinate> row = new ArrayList<Coordinate>();
      for(int j = 0; j < matrix.get(i).size(); j++) {
        row.add(new Coordinate(i, j));
      }
      coordinateMatrix.add(row);
    }

//    [0, 1, 2].map(n -> n + 1) = [1, 2, 3]

    List<List<Integer>> result = coordinateMatrix.stream().map(row -> row.stream().map(e -> numOfCoordsNearby(e, xLimit, yLimit, matrix)).toList()).toList();
  }

  public static List<List<String>> getBox(Coordinate e, int xLimit, int yLimit, List<List<String>> matrix) {
    int lowerXLimit = clamp(e.x - 1, xLimit);
    int upperXLimit = clamp(e.x + 1, xLimit);
    int lowerYLimit = clamp(e.y - 1, yLimit);
    int upperYLimit = clamp(e.y + 1, yLimit);
    return matrix.subList(lowerYLimit, upperYLimit).stream().map(r -> r.subList(lowerXLimit, upperXLimit)).toList();
  }

  public static int numOfCoordsNearby(Coordinate e, int x, int y, List<List<String>> matrix) {
    return 0;
  }

  public static int clamp(int value, int limit) {
    return (value < 0) ? 0 : Math.min(value, limit);
  }
}


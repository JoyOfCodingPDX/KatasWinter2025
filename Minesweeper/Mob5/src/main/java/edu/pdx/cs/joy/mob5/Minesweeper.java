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
    List<List<String>> matrix = List.of(
            List.of(".", ".", ".", ".", "."),
            List.of(".", ".", ".", ".", "."),
            List.of(".", ".", ".", ".", "."),
            List.of(".", ".", ".", ".", "."),
            List.of(".", ".", ".", ".", ".")
    );

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

    List<List<Integer>> result = coordinateMatrix.stream().map(row -> row.stream().map(e -> numOfCoordsNearby(e, xLimit, yLimit)).toList()).toList();
  }

  public static int numOfCoordsNearby(Coordinate e, int xLimit, int yLimit) {
    ArrayList<Integer> line1 = new ArrayList<>();
    return 0;
  }

  public static int clamp(int value, int limit) {
    return (value < 0) ? 0 : Math.min(value, limit);
  }
}


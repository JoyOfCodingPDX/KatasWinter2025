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

    ArrayList<ArrayList<Pair>> coordinateMatrix = new ArrayList<>();
    for(int i = 0; i < matrix.size(); i++) {
      ArrayList<Pair> row = new ArrayList<Pair>();
      for(int j = 0; j < matrix.get(i).size(); j++) {
        row.add(new Pair(i, j));
      }
      coordinateMatrix.add(row);
    }

    List<List<Integer>> result = coordinateMatrix.stream().map(row -> row.stream().map(e -> numOfCoordsNearby()));
  }

  int numOfCoordsNearby() {
    return 0;
  }

  public static int clamp(int value, int limit) {
    return (value < 0) ? 0 : Math.min(value, limit);
  }
}


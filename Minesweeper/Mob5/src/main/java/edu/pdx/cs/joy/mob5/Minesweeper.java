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

  public static List<List<Integer>> MineSweepSolve(List<List<String>> m) {
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

    return coordinateMatrix.stream().map(row -> row.stream().map(e -> numOfCoordsNearby(e, xLimit, yLimit, matrix)).toList()).toList();
  }

  public static List<List<String>> getBox(Coordinate e, int xLimit, int yLimit, List<List<String>> matrix) {
    int lowerXLimit = clamp(e.x - 1, xLimit);
    int upperXLimit = clamp(e.x + 1, xLimit);
    int lowerYLimit = clamp(e.y - 1, yLimit);
    int upperYLimit = clamp(e.y + 1, yLimit);
    return matrix.subList(lowerYLimit, upperYLimit).stream().map(r -> r.subList(lowerXLimit, upperXLimit)).toList();
  }

  public static int numOfCoordsNearby(Coordinate e, int xLimit, int yLimit, List<List<String>> matrix) {
    List<List<String>> box = getBox(e, xLimit, yLimit, matrix);
    return box.stream().map(row -> row.stream().map(cell -> cell.equals("*") ? 1 : 0).reduce(0, Integer::sum)).reduce(0, Integer::sum);
  }

  public static int clamp(int value, int limit) {
    return (value < 0) ? 0 : Math.min(value, limit);
  }
}


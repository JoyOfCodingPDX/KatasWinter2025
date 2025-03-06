package edu.pdx.cs.joy.mob5;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class MinesweeperTest {

  @Test
  void canInstantiateKataClass() {
    new Minesweeper();
  }


  @Test
  void fourByFour() {
    List<List<String>> mineField = List.of(
            List.of("*", ".", ".", "."),
            List.of(".", ".", ".", "."),
            List.of(".", "*", ".", "."),
            List.of(".", ".", ".", "."),
            List.of(".", ".", ".", ".")
    );

    List<List<String>> mineFieldResult = List.of(
            List.of("*", "1", "0", "0"),
            List.of("2", "2", "1", "0"),
            List.of("1", "*", "1", "0"),
            List.of("1", "1", "1", "0"),
            );

    assertThat(Minesweeper.MineSweepSolve(mineField), mineFieldResult);
  }

  @Test
  void threeBythree() {
    List<List<String>> mineField = List.of(
            List.of("*", "*", ".", ".", "."),
            List.of(".", ".", ".", ".", "."),
            List.of(".", ".", ".", ".", "."),
            List.of(".", "*", ".", ".", "."),
            );
    List<List<String>> mineField = List.of(
            List.of("*", "*", "1", "0", "0"),
            List.of("3", "3", "2", "0", "0"),
            List.of("1", "*", "1", "0", "0"),
            );

    assertThat(Minesweeper.MineSweepSolve(mineField), mineField);
  }

  @Test
  void testGetBox() {
    // A matrix of size 5x5
    List<List<String>> matrix = List.of(
            List.of(".", ".", ".", ".", "."),
            List.of(".", ".", ".", ".", "."),
            List.of(".", ".", ".", ".", "."),
            List.of(".", ".", ".", ".", "."),
            List.of(".", ".", ".", ".", ".")
    );

    // Call the getBox method using the matrix:
    List<List<String>> box = Minesweeper.getBox(Coordinate(1,1), 3, 3, matrix);
    // Expected result is a 3x3 box:
    assertThat(box.length == 3);
  }
}
}

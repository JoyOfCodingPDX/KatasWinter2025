package edu.pdx.cs.joy.mob5;

import org.junit.jupiter.api.Test;

public class MinesweeperTest
{

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
}

package edu.pdx.cs.joy.mob2;

import org.junit.jupiter.api.Test;

public class MinesweeperTest
{

  @Test
  void canInstantiateKataClass() {
    new Minesweeper();
  }

  @Test
  void read4x4Matrix() {
    String matrixSize = "4 4";
    String line1 = "*...";
    String line2 = "....";
    String line3 = ".*..";
    String line4 = "....";
    String []strArray = new String[]{ matrixSize, line1, line2, line3, line4 };

    char [][]expected = new char[][] { line1, line2, line3, line4 };

    char [][]mineSweeperMatrix = minesweeper.read(strArray);
    assertThat(minesweeper.read(strArray), expected);

  }

}

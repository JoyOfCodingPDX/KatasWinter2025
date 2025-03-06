package edu.pdx.cs.joy.mob2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;

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

    char [][]expected = new char[][] { {'*','.','.','.'}, {'.','.','.','.'}, {'.','*','.','.'}, {'.','.','.','.'} };

    System.out.println(Minesweeper.read(strArray)[0]);

    assert(Arrays.deepEquals(Minesweeper.read(strArray), expected));
  }

  @Test
  void expectedArrayShouldReturnArrayWithNumbers() {
    char[][] input = new char[][]{{'*', '.', '.', '.'}, {'.', '.', '.', '.'}, {'.', '*', '.', '.'}, {'.', '.', '.', '.'}};
    char[][] expected = new char[][]{{'*', '1', '0', '0'}, {'2', '2', '1', '0'}, {'1', '*', '1', '0'}, {'1', '1', '1', '0'}};


    System.out.println(Minesweeper.fillNumbers(input)[0]);
    System.out.println(Minesweeper.fillNumbers(input)[1]);
    System.out.println(Minesweeper.fillNumbers(input)[2]);
    System.out.println(Minesweeper.fillNumbers(input)[3]);

    assert(Arrays.deepEquals(Minesweeper.fillNumbers(input), expected));

  }
}

package edu.pdx.cs.joy.mob4;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class MinesweeperTest
{

  @Test
  void canInstantiateKataClass() {
    new Minesweeper();
  }

  @Test
  void testSolve() {
    char[][] inputGrid={
            {'*','.','.'},
            {'*','.','.'}

    };

    char[][] outputGrid={
            {'*','2','0'},
            {'*','2','0'}
    };

    int rows = inputGrid.length;
    int cols = inputGrid[0].length;
    Minesweeper minesweeper = new Minesweeper();
    inputGrid =minesweeper.solve(rows, cols, inputGrid);
    for(int i=0;i<inputGrid.length;i++){
      for(int j=0;j<inputGrid[0].length;j++){
        assertEquals(inputGrid[i][j], outputGrid[i][j]);
      }
    }



  }

  @Test
  void testSingleMine(){
    char[][] inputGrid={
            {'*','.'},
            {'.','.'}
    };
    char[][] outputGrid={
            {'*','1'},
            {'1','1'}
    };

    int rows = inputGrid.length;
    int cols = inputGrid[0].length;
    Minesweeper minesweeper = new Minesweeper();
    inputGrid =minesweeper.solve(rows, cols, inputGrid);
    for(int i=0;i<inputGrid.length;i++){
      for(int j=0;j<inputGrid[0].length;j++){
        assertEquals(inputGrid[i][j], outputGrid[i][j]);
      }
    }
  }
  @Test
  void testNoMine(){
    char[][] inputGrid={
            {'.','.','.'},
            {'.','.','.'}
    };
    char[][] outputGrid={
            {'0','0','0'},
            {'0','0','0'}
    };

    int rows = inputGrid.length;
    int cols = inputGrid[0].length;
    Minesweeper minesweeper = new Minesweeper();
    inputGrid =minesweeper.solve(rows, cols, inputGrid);
    for(int i=0;i<inputGrid.length;i++){
      for(int j=0;j<inputGrid[0].length;j++){
        assertEquals(inputGrid[i][j], outputGrid[i][j]);
      }
    }
  }

  @Test
  void testWithAllMine(){
    char[][] inputGrid={
            {'*','*','*'},
            {'*','*','*'}
    };
    char[][] outputGrid={
            {'*','*','*'},
            {'*','*','*'}
    };

    int rows = inputGrid.length;
    int cols = inputGrid[0].length;
    Minesweeper minesweeper = new Minesweeper();
    inputGrid =minesweeper.solve(rows, cols, inputGrid);
    for(int i=0;i<inputGrid.length;i++){
      for(int j=0;j<inputGrid[0].length;j++){
        assertEquals(inputGrid[i][j], outputGrid[i][j]);
      }
    }
  }

  @Test
  void testEmpty(){
    char[][] inputGrid={
            {}   };
    char[][] outputGrid={
            {}
    };

    int rows = inputGrid.length;
    int cols = inputGrid[0].length;
    Minesweeper minesweeper = new Minesweeper();
    inputGrid = minesweeper.solve(rows, cols, inputGrid);
    assertEquals(outputGrid.length, 0);
  }

}

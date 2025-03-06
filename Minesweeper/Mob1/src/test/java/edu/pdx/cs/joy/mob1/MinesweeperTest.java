package edu.pdx.cs.joy.mob1;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class MinesweeperTest
{

  @Test
  void canInstantiateKataClass() {

    new Minesweeper();


    // inital test ideas:
//    3 x 3
    @Test
    void createGridFromInputNums() {
      Minesweeper minesweeper = new Minesweeper();
      minesweeper.createGrid( 3,  3);

      char[][] grid = minesweeper.getGrid();
      assertThat(grid.getWidth(), 3);
      assertThat(grid.getHeight(), 3);

    }

    // 4 x 4

    // 0 x 0

    // randomized mine dropper?

    // DEAD MIDDLE MINE TEST:
    // 3 x 3

    // . . .
    // . * .
    // . . .

    // assumption that results in

    // 1 1 1
    // 1 * 1
    // 1 1 1

  }

}

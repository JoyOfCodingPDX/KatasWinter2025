package edu.pdx.cs.joy.mob1;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class MinesweeperTest
{

  @Test
  void canInstantiateKataClass() {



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
    // Test input:
    //4 4
    //*...
    //....
    //.*..
    //....
    //3 5
    //**...
    //.....
    //.*...
    //0 0

  }
  // inital test ideas:
//    3 x 3
  @Test
  void createGridFromInputNums() {
    Minesweeper minesweeper = new Minesweeper(3, 3);

    assertThat(minesweeper.getWidth(), equalTo(3));
    assertThat(minesweeper.getHeight(), equalTo(3));

  }
  @Test
  void calculateBombProx() {
    Minesweeper minesweeper = new Minesweeper(4, 4);
    String grid = "*...\n" + "....\n" + ".*..\n" + "....";
  }

}

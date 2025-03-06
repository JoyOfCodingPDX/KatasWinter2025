package edu.pdx.cs.joy.mob3;

import edu.pdx.cs.joy.InvokeMainTestCase;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.StringContains.containsString;

class MinesweeperIT extends InvokeMainTestCase {
  @Test
  void invokeMainWithOneMap(){
    String len = "4";
    String height = "4";
    String board = """
            *...
            ....
            .*..
            ....
            """;
    InvokeMainTestCase.MainMethodResult result = invokeMain(Minesweeper.class, len, height, board);

    String expected = """
            *100
            2210
            1*10
            1110
            """;

    assertThat(result.getTextWrittenToStandardOut(), equalTo(expected));

  }

}

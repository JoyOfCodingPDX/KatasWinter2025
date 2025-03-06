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
    InvokeMainTestCase.MainMethodResult result = invokeMain(Minesweeper3.class, board, len, height);

    String expected = """
            *100
            2210
            1*10
            1110
            """;
    //assert()
    assertThat(result.getTextWrittenToStandardOut().replaceAll("\r", ""), equalTo(expected.replaceAll("\\r", "")));

  }

  @Test
  void invokeMainWithOneArg(){
    try {
      InvokeMainTestCase.MainMethodResult result = invokeMain(Minesweeper3.class, "a");
      assert(false);
    } catch (Exception e){
      assert(true);
    }
  }


}

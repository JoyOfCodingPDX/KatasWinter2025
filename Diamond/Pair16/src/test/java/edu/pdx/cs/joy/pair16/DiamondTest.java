package edu.pdx.cs.joy.pair16;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class DiamondTest
{
  private Diamond diamond;

  public DiamondTest() {
    diamond = new Diamond();
  }

  @BeforeAll
  static void setUp() {
  }

  @Test
  void testingPrintDiamond() {
    //Diamond diamond = new Diamond();
    String letter = diamond.printDiamond("A");
    assert(letter.equals("A"));
  }
}

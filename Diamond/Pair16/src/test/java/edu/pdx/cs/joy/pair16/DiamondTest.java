package edu.pdx.cs.joy.pair16;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class DiamondTest
{

  @BeforeAll
  static void setUp() {
    Diamond diamond = new Diamond();
  }

  @Test
  void testingPrintDiamond() {
    //Diamond diamond = new Diamond();
    String letter = diamond.printDiamond("A");
    assert(letter.equals("A"));
  }
}

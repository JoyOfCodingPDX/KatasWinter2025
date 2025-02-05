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
  void nothing(){}
  /*@Test
  void testingPrintDiamondA() {
    //Diamond diamond = new Diamond();
    String letter = diamond.printDiamond('A');
    assert(letter.equals("A"));
  }*/

  /*@Test
  void testingPrintDiamondC() {
    String letter = diamond.printDiamond('C');
    assert(letter.equals("  A\n B B\nC   C\n B B\n  A"));
  }*/
}

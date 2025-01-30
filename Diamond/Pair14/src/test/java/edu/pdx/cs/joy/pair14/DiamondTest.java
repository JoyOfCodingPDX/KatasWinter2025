package edu.pdx.cs.joy.pair14;

import org.junit.jupiter.api.Test;

public class DiamondTest
{

  @Test
  void canInstantiateKataClass() {
    new Diamond();
  }

  @Test
  void testLine() {
    Diamond d = new Diamond();
    d.drawLine('C');

  }

}

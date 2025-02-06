package edu.pdx.cs.joy.pair3;

import org.junit.jupiter.api.Test;
import org.hamcrest.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiamondTest
{

  @Test
  void diamondtest() {

    String myString = " C";
    assertEquals(myString, Diamond.space(1, 0, 'C'));

  }

  @Test
  void diamondtest2() {
    String myString = "X   X";
    assertEquals(myString, Diamond.space(0,3,'X'));
  }


  @Test
  void printDiamonftest() {
    Diamond.print_dimond('A');
  }
}
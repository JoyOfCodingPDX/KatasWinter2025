package edu.pdx.cs.joy.pair11;

import org.junit.jupiter.api.Test;
import org.hamcrest.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiamondTest
{

  @Test
  void canInstantiateKataClass() {
    new Diamond();
  }

  @Test
  void main() {
  }

  @Test
  void diamond_line_test() {

    String myString = "    A";
    assertEquals(myString, Diamond.diamond_line(4, 0, 'A'));

    myString = "   B     B";
    assertEquals(myString, Diamond.diamond_line(3,5,'B'));
  }


  @Test
  void print_dimond_test() {
    Diamond.print_dimond('F');
  }
}

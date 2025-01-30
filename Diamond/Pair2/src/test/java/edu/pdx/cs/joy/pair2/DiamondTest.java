package edu.pdx.cs.joy.pair2;

import org.junit.jupiter.api.Test;

public class DiamondTest
{

  @Test
  void canInstantiateKataClass() {
    new Diamond();
  }

  @Test
  void test_loop2(){
    Diamond hold = new Diamond();
    hold.loop2('B', 2, 3);
  }

  @Test
  void test_loop1(){
    Diamond hold = new Diamond();
    hold.loop("F");
  }
}

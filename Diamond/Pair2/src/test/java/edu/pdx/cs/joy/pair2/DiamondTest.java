package edu.pdx.cs.joy.pair2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DiamondTest
{

  private  Diamond hold;

  @BeforeEach
  void create_diamond(){
    this.hold = new Diamond();
  }

  @Test
  void canInstantiateKataClass() {
    new Diamond();
  }

  @Test
  void test_loop2(){
    assert(hold.loop2('B', 2, 3) == 1);
  }

  @Test
  void test_loop1(){
    assert(hold.loop("F") == (((int) 'F') -65)*2 +1  );

  }

  @Test
  void test_non_cap(){
    assert(hold.loop("z") == -1);
    assert(hold.loop("1") == -1);
  }

  @Test
  void test_long_str(){
    assert(hold.loop("A11") == -2);
    assert(hold.loop("11A") == -2);
  }

  @Test
  void test_empty(){
    assert(hold.loop("") == -2);
  }

}

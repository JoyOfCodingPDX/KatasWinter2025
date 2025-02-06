package edu.pdx.cs.joy.pair4;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class DiamondTest
{
  @Test
  void canInstantiateKataClass() {
    new Diamond();
  }

  @Test
  void testAscii(){
    int value = (int)'A';
    assertThat(value, equalTo(65));
  }

  @Disabled
  @Test
  void test() {
    String[] arg = {"d"};
    assertEquals((arg[0] + 1),"68");
  }
}

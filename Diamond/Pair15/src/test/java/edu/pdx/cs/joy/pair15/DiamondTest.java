package edu.pdx.cs.joy.pair15;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiamondTest
{


  @Test
  void creatingNewClassWithA(){
    Diamond diamond = new Diamond("A");
  }

  @Test
  void creatingNewClassWithB() {
    Diamond diamond = new Diamond("B");
  }

}

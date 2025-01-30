package edu.pdx.cs.joy.pair6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class DiamondTest
{

  private DiamondTest kata;

  @BeforeEach
  void setUp() {
    kata = new DiamondTest();
  }

  @Test
  void canInstantiateKataClass() {
    new Diamond();
  }

  @Test
  void canMakeTopLetter(){
    Diamond diamond = new Diamond();

    assertThat(toString().equals("A"));
    String input = "A";
    // if(input != )
  }

}

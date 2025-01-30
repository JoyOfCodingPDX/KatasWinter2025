package edu.pdx.cs.joy.pair6;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class DiamondTest
{
  @BeforeEach
  void setUp(){
    diamond = Diamond();
  }

  @Test
  void canInstantiateKataClass() {
    new Diamond();
  }

  @Test
  void canMakeTopLetter(){
    Diamond diamond = new Diamond();

    assertThat(toString().equalsTo("A"));
    String input = "A";
    // if(input != )
  }

}

package edu.pdx.cs.joy.pair6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import static org.hamcrest.MatcherAssert.assertThat;

public class DiamondTest
{

  private Diamond kata;

  @BeforeEach
  void setUp() {
    kata = new Diamond();
  }

  @Test
  void canInstantiateKataClass() {
    new Diamond();
  }

  @Test
  void canMakeTopLetter(){

    assertThat(kata.diamond(String 'A'),equalTo('A'));
    String input = "A";
    // if(input != )
  }

@Test
  void chckTop(){}

}

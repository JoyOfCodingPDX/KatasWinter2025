package edu.pdx.cs.joy.pair6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

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

    assertThat(kata.diamond("A"),is(equalTo("A")));

  }

@Test
void canMakeSecondLetter()
{
  assertThat(kata.diamond("B"),is(equalTo("B")));

//  if(kata.diamonds.)
//  {
//    return kata.diamond("B");
//  }

}

@Test
  void checkTop(){}

}

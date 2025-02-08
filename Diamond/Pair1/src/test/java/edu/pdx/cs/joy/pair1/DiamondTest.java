package edu.pdx.cs.joy.pair1;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestClassOrder;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DiamondTest
{


  @Test
  void canInstantiateKataClass() {
    try{
      Diamond testDiamond = new Diamond();
    } catch(Exception e){
      System.err.println(e);
    }
  }

 /**
  void canPrintTheFirstLetterWhichIsAnA() {
    String[] firstletter = new String["A"];
    Diamond testDiamond = new Diamond();
    assertThat(Diamond.main(firstletter),equalTo("A"));
  }
*/
  @Disabled
  @Test
  void canPrintA() {
    assertThat(Diamond.letterPrintDiamond('A'), equalTo("A\n"));
  }

  /*
  @Test
  void canPrintB() {
    assertThat(Diamond.letterPrintDiamond('B'), equalTo(" A\nB B\n A"));
  }*/

  @Disabled
  @Test
  void canPrintC() {
    assertThat(Diamond.letterPrintDiamond('C'), equalTo(" A\nB B\n A"));
  }
}

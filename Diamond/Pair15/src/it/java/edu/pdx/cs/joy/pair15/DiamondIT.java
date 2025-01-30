package edu.pdx.cs.joy.pair15;

import edu.pdx.cs.joy.InvokeMainTestCase;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

class DiamondIT extends InvokeMainTestCase {

  private MainMethodResult invokeMain(String... args) {return invokeMain( Diamond.class, args );}

  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Diamond.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }

  @Test
  void testOut(){
    String args = "A";
    MainMethodResult result = invokeMain(args);
    assertThat(result.getTextWrittenToStandardOut(), containsString("A"));
    }

    @Test
  void testB(){
    String args = "B";
    MainMethodResult result = invokeMain(args);
    assertThat(result.getTextWrittenToStandardOut(), containsString("  A  B"));
    }

}

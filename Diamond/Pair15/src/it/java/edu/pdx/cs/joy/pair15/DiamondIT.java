package edu.pdx.cs.joy.pair15;

import edu.pdx.cs.joy.InvokeMainTestCase;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

class DiamondIT extends InvokeMainTestCase {

  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Diamond.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }

  @Test
  void testOut(){
    InvokeMainTestCase.MainMethodResult result = invokeMain(Diamond.class);
    String args = "A";
    assertThat(result.getTextWrittenToStandardOut(), containsString("A"));
    }

}

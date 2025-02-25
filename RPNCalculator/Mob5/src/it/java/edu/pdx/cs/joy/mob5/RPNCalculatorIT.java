package edu.pdx.cs.joy.mob5;

import edu.pdx.cs.joy.InvokeMainTestCase;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

class RPNCalculatorIT extends InvokeMainTestCase {

  @Disabled
  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(RPNCalculator.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }

  @Test
  void testMain20Div5Is4(){
    String[] args = {"5", "20","/"};
    InvokeMainTestCase.MainMethodResult result = invokeMain(RPNCalculator.class,args);
    assertThat(result.getTextWrittenToStandardOut(), containsString("= 4"));
  }

  @Disabled
  @Test
  void testSqrt(){
    String[] args = {"2","SQRT"};
    InvokeMainTestCase.MainMethodResult result = invokeMain(RPNCalculator.class,args);
    assertThat(result.getTextWrittenToStandardOut(), containsString("= 4"));
  }
}

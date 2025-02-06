package edu.pdx.cs.joy.pair14;

import edu.pdx.cs.joy.InvokeMainTestCase;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

class LagsIT extends InvokeMainTestCase {

  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Lags.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }

  String [] args = {"AF514", "0" , "5", "10"};
  @Disabled
  @Test
  void willBuildAirline(){
    InvokeMainTestCase.MainMethodResult result = invokeMain(Lags.class, "AF514", "0" , "5", "10");
    assertThat(result.getTextWrittenToStandardOut(), containsString("AF514"));
  }


}

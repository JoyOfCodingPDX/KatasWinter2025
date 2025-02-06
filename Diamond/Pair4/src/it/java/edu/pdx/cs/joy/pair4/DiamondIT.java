package edu.pdx.cs.joy.pair4;

import edu.pdx.cs.joy.InvokeMainTestCase;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

class DiamondIT extends InvokeMainTestCase {

  @Disabled
  @Test
  void testInvalidMain (){
    String[] args = {"aa"};
   InvokeMainTestCase.MainMethodResult result = invokeMain(Diamond.class,args);
   assertThat(result.getTextWrittenToStandardError(),containsString("invalid"));

    String[] args2 = {"a","b"};
    InvokeMainTestCase.MainMethodResult result2 = invokeMain(Diamond.class,args2);
    assertThat(result2.getTextWrittenToStandardError(),containsString("invalid"));
  }

  @Disabled
    @Test
    void testInvalid (){
        String[] args = {"D"};
        InvokeMainTestCase.MainMethodResult result = invokeMain(Diamond.class,args);
        assertThat(result.getTextWrittenToStandardOut(),containsString("asdwajsjdwao"));
    }

}

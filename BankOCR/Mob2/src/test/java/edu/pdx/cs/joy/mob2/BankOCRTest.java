package edu.pdx.cs.joy.mob2;

import org.junit.jupiter.api.Test;
//import static org.hamcrest.*;

import org.junit.jupiter.api.Test;
import java.util.Stack;
import edu.pdx.cs.joy.InvokeMainTestCase;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class BankOCRTest extends InvokeMainTestCase
{
  private MainMethodResult invokeMain(String... args){
    return invokeMain(BankOCR.class,args);
  }

  @Test
  void canInstantiateKataClass() {
    new BankOCR();
  }


  @Test
  void canIDZero(){
    String zero = " _ \n+| |\n|_|\n   ";
    String line1 = " _ ";
    String line2 = "| |";
    String line3 = "|_|";

    InvokeMainTestCase.MainMethodResult result = invokeMain(line1,line2,line3);
    //MainMethodResult invokeMain(line1,line2,line3);
    assertThat(result.getTextWrittenToStandardOut(),containsString("0"));
  }

}

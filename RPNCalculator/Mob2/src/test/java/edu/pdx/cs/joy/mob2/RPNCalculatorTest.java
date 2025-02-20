package edu.pdx.cs.joy.mob2;

import org.junit.jupiter.api.Test;
import java.util.Stack;
import edu.pdx.cs.joy.InvokeMainTestCase;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class RPNCalculatorTest
{
  
  private MainMethodResult invokeMain(String...args){
    return invokeMain(RPNCalculator.class,args);
  }
  

  @Test
  void canInstantiateKataClass() {
    new RPNCalculator();
  }
  /* 
  @Test
  void baseCase(){
    MainMethodResult result = invokeMain("3","5","+");
    assertThat(result.getTextWrittenToStandardOut(),containsString("8"));
  }
    */

}

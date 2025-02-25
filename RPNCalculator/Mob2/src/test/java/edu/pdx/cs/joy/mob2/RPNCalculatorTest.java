package edu.pdx.cs.joy.mob2;

import org.junit.jupiter.api.Test;
import java.util.Stack;
import edu.pdx.cs.joy.InvokeMainTestCase;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class RPNCalculatorTest extends InvokeMainTestCase
{
  
  private MainMethodResult invokeMain(String... args){
    return invokeMain(RPNCalculator.class, args);
  }
  

  @Test
  void canInstantiateKataClass() {
    new RPNCalculator();
  }
  
  @Test
  void baseCase1(){
    MainMethodResult result = invokeMain("3","5","+");
    assertThat(result.getTextWrittenToStandardOut(),containsString("8"));
  }
  
  @Test
  void baseCase2(){
    MainMethodResult result = invokeMain("9","5","-");
    assertThat(result.getTextWrittenToStandardOut(),containsString("4"));
  }

  @Test
  void baseCase3(){
    MainMethodResult result = invokeMain("3","5","*");
    assertThat(result.getTextWrittenToStandardOut(),containsString("15"));
  }

  @Test
  void baseCase4(){
    MainMethodResult result = invokeMain("15","5","/");
    assertThat(result.getTextWrittenToStandardOut(),containsString("3"));
  }

  @Test
  void testSqrt(){
    MainMethodResult result = invokeMain("9","SQRT");
    assertThat(result.getTextWrittenToStandardOut(),containsString("3"));
  }

  @Test
  void testSqrt2(){
    MainMethodResult result = invokeMain("10","SQRT");
    assertThat(result.getTextWrittenToStandardOut(),containsString("3"));
  }

  @Test
  void multipleTest(){
    MainMethodResult result = invokeMain("9","SQRT", "10", "+");
    assertThat(result.getTextWrittenToStandardOut(),containsString("13"));
  }

  @Test
  void multipleTest2(){
    MainMethodResult result = invokeMain("3" , "5","8","*","7","+","*");
    assertThat(result.getTextWrittenToStandardOut(),containsString("141"));
  }
}

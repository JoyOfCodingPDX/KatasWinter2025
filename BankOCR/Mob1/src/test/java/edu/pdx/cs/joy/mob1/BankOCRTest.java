package edu.pdx.cs.joy.mob1;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class BankOCRTest
{

  @Test
  void canInstantiateKataClass() {

    new BankOCR();
  }

  // TEST CASES:
    // ONE DIGIT:
    @Test
    void canTestOneSingleZero() {
      BankOCR bankOCR = new BankOCR();
    /*
       _
      | |
      |_|
       */

      String zero = " _ | ||_|";

      assertThat(bankOCR.parseOCR(zero), equalTo("0"));
    }


}

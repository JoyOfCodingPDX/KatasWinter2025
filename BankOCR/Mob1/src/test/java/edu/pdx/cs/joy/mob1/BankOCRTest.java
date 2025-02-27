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

      String zero = " _ | ||_|";

      assertThat(BankOCR.parseOCR(zero), equalTo("0"));
    }

@Test
    void canTestOneSingleONE(){


      String one = "     |  |";

      assertThat(BankOCR.parseOCR(one), equalTo("1"));
    }
@Test
  void canTestOneSingleTWO(){

    String two = " _  _||_ ";
    assertThat(BankOCR.parseOCR(two), equalTo("2"));
}

@Test
  void canTestNineNumbers() {

    String topLine = "    _  _     _  _  _  _  _ ";
    String midLine = "  | _| _||_||_ |_   ||_||_|";
    String botLine = "  ||_  _|  | _||_|  ||_| _|";

    String returned = BankOCR.somethingCool(topLine, midLine, botLine);

    assertThat(returned, equalTo("123456789"));

  }
}

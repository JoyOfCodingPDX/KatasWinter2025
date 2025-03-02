package edu.pdx.cs.joy.mob4;

import edu.pdx.cs.joy.mob4.BankOCR;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class BankOCRTest
{

  @Test
  void canInstantiateKataClass() {
    new BankOCR();
  }

  @Test
  void canReadANumber() {
    BankOCR bank = new BankOCR();
    String testNumber = "   \n" +
                        "|_|\n" +
                        "  |";

    int result = bank.parseNumber(testNumber);
    assertThat(result, equalTo(4));
  }



}

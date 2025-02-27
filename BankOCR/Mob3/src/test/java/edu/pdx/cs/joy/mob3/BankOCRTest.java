package edu.pdx.cs.joy.mob3;

import org.junit.jupiter.api.Test;

public class BankOCRTest
{

  @Test
  void canInstantiateKataClass() {
    new BankOCR();
  }

}

/*
  four arrays of string
  line_1[27]
  line_2[27]
  line_3[27]
  line_4[27]
 */

/*
  one pattern
  [0, 0, 1]
  [0, 0, 1]
  [0, 0, 1]
  two pattern
  [0, 1, 0]
  [0, 1, 1]
  [1, 1, 0]
 */

/*
 if first or thrid row == "_" error
 if second == " | " errror
 */
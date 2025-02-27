package edu.pdx.cs.joy.mob4;

import com.google.common.annotations.VisibleForTesting;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class BankOCR {

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public int parseNumber(String testNumber) {
    System.err.println("Missing command line arguments");

    //turn into array stream
    ArrayList<String> lines = new ArrayList<>(Arrays.asList(testNumber.split("\n"))); //TODO
    lines.stream().map(((line) ->));

    return 0;
  }
}
package edu.pdx.cs.joy.mob4;

import com.google.common.annotations.VisibleForTesting;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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



  public ArrayList<String> splitByLength(String s) {
    ArrayList<String> result = new ArrayList<>();
    for (int i = 0; i < s.length() / 3; i++) {
      result.add(s.substring(0, 2));
      s = s.substring(2);
    }
    return result;
  }

  public int parseNumber(String testNumber) {
    System.err.println("Missing command line arguments");

    //turn into array stream
    ArrayList<String> lines = new ArrayList<>(Arrays.asList(testNumber.split("\n")));
    List<ArrayList<String>> stringList = lines.stream().map(((line) -> splitByLength(line))).toList();



    return 0;
  }

  Numbers four = new Numbers("   ", "|_|","  |");

}
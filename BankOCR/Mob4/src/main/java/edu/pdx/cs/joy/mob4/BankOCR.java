package edu.pdx.cs.joy.mob4;

import com.google.common.annotations.VisibleForTesting;

import java.sql.Array;
import java.util.*;

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
    //System.err.println("Missing command line arguments");

    Map<Numbers, Integer> map = new HashMap<>();
    Numbers four = new Numbers("   ", "|_|","  |");
    map.put(four, 4);

    //turn into array stream
    ArrayList<String> lines = new ArrayList<>(Arrays.asList(testNumber.split("\n")));
    List<ArrayList<String>> stringList = lines.stream().map(((line) -> splitByLength(line))).toList();

    ArrayList<Numbers> numbers = new ArrayList<>();
    while(!stringList.get(0).isEmpty()){
      Numbers num = new Numbers(stringList.get(0).get(0),stringList.get(1).get(0),stringList.get(2).get(0) );
      numbers.add(num);
      stringList.get(0).remove(0);
      stringList.get(1).remove(0);
      stringList.get(2).remove(0);

    }

    return map.get(four);
  }



}
package edu.pdx.cs.joy.mob1;

import com.google.common.annotations.VisibleForTesting;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class BankOCR {
  private static final Map<String, String> bankOCRMap = new HashMap<>();

  String zero = " _ | ||_|";
  String one  = "     |  |";
  String two  = " _  _||_ ";
  String three= " _  _| _|";
  String four = "   |_|  |";
  String five = " _ |_   |";
  String six  = " _ |_ |_|";
  String seven= " _   |  |";
  String eight= " _ |_||_|";
  String nine = " _ |_| _|";

  public BankOCR(){
    bankOCRMap.put(zero, "0");
    bankOCRMap.put(one, "1");
    bankOCRMap.put(two, "2");
    bankOCRMap.put(three, "3");
    bankOCRMap.put(four, "4");
    bankOCRMap.put(five, "5");
    bankOCRMap.put(six, "6");
    bankOCRMap.put(seven, "7");
    bankOCRMap.put(eight, "8");
    bankOCRMap.put(nine, "9");
  }


  @VisibleForTesting
  public static void main(String[] args) {

  }

  public static String parseOCR(String num) {


    return bankOCRMap.getOrDefault(num, "?");
  }

  public static String somethingCool(String top, String mid, String bot) {
    String[] input = new String[]{"", "", "", "", "", "", "", "", ""};
    String output = "";

    for (int j = 0; j < 27; j+=3) {

      output = output.concat(parseOCR(top.substring(j, j+3) +
              mid.substring(j, j+3) + bot.substring(j, j+3)));
    }
    return output;
  }



}
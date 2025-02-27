package edu.pdx.cs.joy.mob2;

import com.google.common.annotations.VisibleForTesting;

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

    String line1 = args[0];
    String line2 = args[1];
    String line3 = args[2];
    String argString = line1 + "\n" + line2 + "\n" + line3;

    ArrayList<String> numFormats = new ArrayList<>();
    numFormats.add(" _ \n| |\n|_|");
    numFormats.add("  \n  |\n  |");
    numFormats.add(" _\n _|\n _|");
    numFormats.add("  \n|_|\n  |");
    numFormats.add(" _\n|_\n _|");
    numFormats.add(" _\n|_\n|_|");
    numFormats.add(" _\n  |\n  |");
    numFormats.add(" _\n|_|\n|_|");
    numFormats.add(" _\n|_|\n _|");

    String result = new String();
    for(int i = 0; i < args[0].length(); i+=3)
    {
      String digit = args[0].substring(i, i+2) + "\n" + args[1].substring(i, i+2) + "\n" + args[2].substring(i, i+2);

      if (digit.equals(numFormats.get(0))) {
        System.out.println("0");
        result += "0";
      }
      else if (digit.equals(numFormats.get(1))) {
        System.out.println("1");
        result += "1";
      }
      else if (digit.equals(numFormats.get(2))) {
        System.out.println("2");
        result += "2";
      }
      else if (digit.equals(numFormats.get(3))) {
        System.out.println("3");
        result += "3";
      }
      else if (digit.equals(numFormats.get(4))) {
        System.out.println("4");
        result += "4";
      }
      else if (digit.equals(numFormats.get(5))) {
        System.out.println("5");
        result += "5";
      }
      else if (digit.equals(numFormats.get(6))) {
        System.out.println("6");
        result += "6";
      }
      else if (digit.equals(numFormats.get(7))) {
        System.out.println("7");
        result += "7";
      }
      else if (digit.equals(numFormats.get(8))) {
        System.out.println("8");
        result += "8";
      }
      else if (digit.equals(numFormats.get(9))) {
        System.out.println("9");
        result += "9";
      }

    }

    System.out.println(result);

    System.out.println(numFormats.get(0));
    if (argString.equals(numFormats.get(0))) {
      System.out.println("0");
    }

  }
}
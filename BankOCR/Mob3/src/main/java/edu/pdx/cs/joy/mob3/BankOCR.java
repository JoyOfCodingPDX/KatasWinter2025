package edu.pdx.cs.joy.mob3;

import com.google.common.annotations.VisibleForTesting;

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

  public static String parseArgs(char[][] args) {
    if (args.length < 3){
      throw new Exception("The amount of lines is less than three");
    }

    for (int i = 0; i < 3; i++){
      if (args[i].length != 27){
        throw new Exception("The lines are not 27 chars longs");
      }
    }

    // 1 0 0...
    // 0 0 ... 1
    // 1 0 0 0 0 0 0 0 0
    // 0 0 0 0 0 0 0 0 1

    return "";
  }
}
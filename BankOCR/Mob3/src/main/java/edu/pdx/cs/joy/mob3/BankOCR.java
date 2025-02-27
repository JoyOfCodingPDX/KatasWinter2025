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

  public String parseArgs(char[][] args) {
    if (args.length < 3){
        try {
            throw new Exception("The amount of lines is less than three");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    for (int i = 0; i < 3; i++){
      if (args[i].length != 27){
          try {
              throw new Exception("The lines are not 27 chars longs");
          } catch (Exception e) {
              throw new RuntimeException(e);
          }
      }
    }

    boolean[][] parseLines = new boolean[3][27];

    for (int i = 0; i < 3; i++){
      parse_line(parseLines[i], args[i]);
    }

    // 1 0 0...
    // 0 0 ... 1
    // 1 0 0 0 0 0 0 0 0
    // 0 0 0 0 0 0 0 0 1

    return "";
  }

  public static void parse_line(boolean[] parseLine, char[] line) {
    for (int i = 0; i < line.length; i++){
      if ((i + 1)% 2 == 0){
        if (line[i] == '|'){

        }
      }
      if ((i + 1) % 2 == 1){
        if (line[i] == '_'){

        }
      }

      if (line[i] == ' '){
        parseLine[i] = false;
      } else {
        parseLine[i] = true;
      }
    }
  }
}
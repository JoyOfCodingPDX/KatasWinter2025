package edu.pdx.cs.joy.mob3;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class BankOCR {
  boolean[][] patternOne = {{false,false,false},{false,false,true},{false,false,true}};
  boolean[][] patternTwo = {{false,true,false},{false,true,true},{true,true,false}};
  boolean[][] patternThree = {{false,true,false},{false,true,true},{false,true,true}};
  boolean[][] patternFour = {{false,false,false},{true,true,true},{false,false,true}};
  boolean[][] patternFive = {{false,true,false},{true,true,false},{false,true,true}};
  boolean[][] patternSix = {{false,true,false},{true,true,false},{true,true,true}};
  boolean[][] patternSeven = {{false,true,false},{false,false,true},{false,false,true}};
  boolean[][] patternEight = {{false,true,false},{true,true,true},{true,true,true}};
  boolean[][] patternNine = {{false,true,false},{true,true,true},{false,true,true}};

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

  public String parse_boolean_to_string(boolean[][] parsedBools) {
    String result = "";
    for (int i = 0; i < parsedBools[0].length / 3; i++){
      for (int j = 0; j < 3; j++){
        if (this.compare(parsedBools, i, this.patternOne)){
          result += "1";
          break;
        }
        if (this.compare(parsedBools, i, this.patternTwo)){
          result += "2";
          break;
        }
        if (this.compare(parsedBools, i, this.patternThree)){
          result += "3";
          break;
        }
        if (this.compare(parsedBools, i, this.patternFour)){
          result += "4";
          break;
        }
        if (this.compare(parsedBools, i, this.patternFive)){
          result += "5";
          break;
        }
        if (this.compare(parsedBools, i, this.patternSix)){
          result += "6";
          break;
        }
        if (this.compare(parsedBools, i, this.patternSeven)){
          result += "7";
          break;
        }
        if (this.compare(parsedBools, i, this.patternEight)){
          result += "8";
          break;
        }
        if (this.compare(parsedBools, i, this.patternNine)){
          result += "9";
          break;
        }
        result += "0";

      }
    }

    return result;
  }

  public static boolean compare(boolean[][] string, int cur, boolean[][] number){
    boolean status = true;

    for (int i = 0; i < 3; i++){
      for (int j = 0; j < 3; j++){
        if (string[i][j+ (cur * 3)] != number[i][j]){
          return false;
        }
      }
    }

    return status;
  }

  
}
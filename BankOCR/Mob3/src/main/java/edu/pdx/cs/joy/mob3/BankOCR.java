package edu.pdx.cs.joy.mob3;

import javax.management.RuntimeErrorException;

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

      boolean[][] patternOne = {{false,false,false},{false,false,true},{false,false,true}};
      boolean[][] patternTwo = {{false,true,false},{false,true,true},{true,true,false}};
      boolean[][] patternThree = {{false,true,false},{false,true,true},{false,true,true}};
      boolean[][] patternFour = {{false,false,false},{true,true,true},{false,false,true}};
      boolean[][] patternFive = {{false,true,false},{true,true,false},{false,true,true}};
      boolean[][] patternSix = {{false,true,false},{true,true,false},{true,true,true}};
      boolean[][] patternSeven = {{false,true,false},{false,false,true},{false,false,true}};
      boolean[][] patternEight = {{false,true,false},{true,true,true},{true,true,true}};
      boolean[][] patternNine = {{false,true,false},{true,true,true},{false,true,true}};

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
    try{
    for (int i = 0; i < line.length; i++){
      if(line[i] != ' '){
      if ((i + 1)% 2 == 0){
        if (line[i] != '_'){
          throw new RuntimeException("The characters are not valid");
        }
      }
      if ((i + 1) % 2 == 1){
        if (line[i] != '|'){
          throw new RuntimeException("The characters are not valid");
        }
      }
    }

      if (line[i] == ' '){
        parseLine[i] = false;
      } else {
        parseLine[i] = true;
      }
    }
  }
  catch(RuntimeErrorException e){
    throw new RuntimeException(e);
  }
  }

  public static String parse_boolean_to_string(boolean[][] parsedBools) {
    String result = "";
    for (int i = 0; i < parsedBools[0].length / 3; i++){
      for (int j = 0; j < 3; j++){
        
      }
    }

    return result;
  }

  
}
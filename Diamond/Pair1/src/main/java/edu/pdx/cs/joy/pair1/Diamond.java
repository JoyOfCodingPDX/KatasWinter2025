package edu.pdx.cs.joy.pair1;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Diamond {



  public static String letterPrintDiamond(char letter) {
    //int ascii_value = Integer.parseInt(letter);

    int ascii = (int) letter; // this should be between 65-90 for A-Z

    int startingSpaces = ascii - 65; // this sets A as 0, B as 1, C as 2
    int gapSpace = ((2 * startingSpaces) - 1);


    String diamond = "";
    for (int j = 65; j <= ascii; j++) {
      for (int i = startingSpaces; i > 0; i--) {
        diamond = diamond + " ";
      }
      diamond = diamond + (char) j;
      // if end of the line, add newline ?
      for (int k = 0; k < 2* j-1; k++) {
        diamond = diamond + " ";
      }
      if (j != 65) {
        diamond = diamond + (char) j + "\n";
      } else {
        diamond = diamond + "\n";
      }
      //for loop for gap spaces appended

    }

    return diamond;
  }


  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
    //letterPrintDiamond(args[0]);
  }
}
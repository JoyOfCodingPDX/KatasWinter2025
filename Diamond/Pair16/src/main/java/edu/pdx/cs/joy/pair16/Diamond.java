package edu.pdx.cs.joy.pair16;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Diamond {
  private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public int findIndex(char letter) {
    for (int i = 0; i < alphabet.length(); i++) {
      if (letter == alphabet.charAt(i)) {
        return i;
      }
    }
    return -1;
  }

  public String printDiamond(char theLetter)
  {
    String pattern = "";
    int index = findIndex(theLetter);
    int space = index;

    //String result = String.valueOf(ch).repeat(n);

    for (int i = 0; i < index + 1; i++) {
      String line = "";
      line = String.valueOf(" ").repeat(space);
      if(i == 0)
      {
        line += alphabet.charAt(i);
      }
      else
      {
        line += alphabet.charAt(i) + String.valueOf(" ").repeat(i * 2 -1) + alphabet.charAt(i);
      }
      --space;
    }
    return pattern;
  }
}
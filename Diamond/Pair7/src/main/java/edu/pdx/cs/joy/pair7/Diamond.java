package edu.pdx.cs.joy.pair7;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Diamond {

  @VisibleForTesting
  public static void main(String[] args) {
    if (args.length == 0) {
      System.err.println("Missing command line arguments");
    } else {
      int difference = (args[0].charAt(0) - 'A') + 1;
      int currentChar = 'A';

      // Top loop of the diamond
      for (int i = 0; i < difference; i++) {
        String start_padding = " ".repeat(difference-i);
        String inner_padding = "";
        String target;
        if (i != 0) {
          inner_padding = " ".repeat(i * 2 - 1);
          target = start_padding + (char) currentChar + inner_padding + (char) currentChar;
        } else {
          target = start_padding + (char) currentChar + inner_padding;
        }

        System.out.println(target);
        currentChar++;
      }

      // Bottom loop of the diamond
      currentChar--;
      for (int i = difference-2; i >= 0; i--) {
        currentChar--;
        String start_padding = " ".repeat(difference-i);
        String inner_padding = "";
        String target;
        if (i != 0) {
          inner_padding = " ".repeat(i * 2 - 1);
          target = start_padding + (char) currentChar + inner_padding + (char) currentChar;
        } else {
          target = start_padding + (char) currentChar + inner_padding;
        }

        System.out.println(target);
      }
    }
  }

}
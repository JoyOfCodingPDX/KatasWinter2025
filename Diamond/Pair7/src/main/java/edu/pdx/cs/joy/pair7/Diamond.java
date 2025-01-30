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
      int asciiOfA = (int) 'A';
      int asciiOfArg = (int) args[0].charAt(0);
      int difference = asciiOfArg - asciiOfA;

      for (int i = 0; i < difference; i++) {
        String start_padding = "".repeat(difference-i);
        String target = start_padding + args[0];
        String inner_padding = "".repeat(i*2-1);
        System.out.println(target);


      }
    }
  }

}
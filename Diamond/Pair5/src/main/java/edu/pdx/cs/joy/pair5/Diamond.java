package edu.pdx.cs.joy.pair5;

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
    if(args.length != 1) {
      System.err.println("Usage: java -jar edu.pdx.cs.joy.pair5.Diamond <filename>");
    }
    char letter = args[0].charAt(0);

    letter = Character.toUpperCase(letter);
    
    printDiamond(letter);
  }

  public static void printDiamond(char letter) {
    if(letter < 'A' || letter > 'Z') {
      System.err.println("No letter provided.");
    }

    int depth = letter - 'A';

    for(int i = 0; i <= depth; i++) {
      for(int j = i; j < depth; j++) {
        System.out.print(" ");
      }
      System.out.print((char)('A' + i));
      if(i > 0) {
        for(int j = 0; j < 2 * i - 1; j++) {
          System.out.print(" ");
        }
        System.out.print((char)('A' + i));
      }
      System.out.println();
    }

    for(int i = depth - 1; i >= 0; i--) {
      for(int j = depth; j > i; j--) {
        System.out.print(" ");
      }
      System.out.print((char)('A' + i));
      if(i > 0) {
        for(int j = 0; j < 2 * i - 1; j++) {
          System.out.print(" ");
        }
        System.out.print((char)('A' + i));
      }
      System.out.println();
    }
  }

}

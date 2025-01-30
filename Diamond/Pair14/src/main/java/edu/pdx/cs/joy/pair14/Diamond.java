package edu.pdx.cs.joy.pair14;

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
    System.err.println("Missing command line arguments");
  }


  public void drawLine(char b) {
    int position = Character.toUpperCase(b) - 'A' + 1;
    //System.out.println(position);
    //System.out.println(Character.toLowerCase(b));
    int leadingSpaces = position - 1;
    for (int j = 65; j <= 90; j++) {
      for (int i = 0; i < leadingSpaces; i++) {
        System.out.print(" ");
      }
      System.out.println('A');
    }


  }
}
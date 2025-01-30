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
    //System.out.println(position);
    //System.out.println(Character.toLowerCase(b));
    for (int j = 65; j <= 90; j++) {

      int position = Character.toUpperCase(j) - 'A' + 1;
      int leadingSpaces = position - 1;
      int preLeadingSpaces = Character.toUpperCase(b) - 'A' + 1;

//      if (position > 1) {
//        System.out.print((char)j);
//      }

      for (int i = 0; i < leadingSpaces; i++) {
        System.out.print(" ");
      }

      System.out.println((char)j);

      if (j == (int)b) {
        break;
      }
    }


  }
}
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
    int position = Character.toUpperCase(b) - 'A' + 1;
    int betweeenSpaces = -1;
    for (int j = 65; j <= 90; j++) {

      int leadingSpaces = position - 1;

      for (int i = 0; i < leadingSpaces; i++) {
        System.out.print(" ");
      }

      System.out.print((char)j);
      position--;

      if (j > 65) {
        for (int i = 0; i < betweeenSpaces; i++) {
          System.out.print(" ");
        }
        System.out.println((char)j);
      } else {
        System.out.println();
      }
      betweeenSpaces += 2;

      if (j == (int)b) {
        break;
      }
    }


  }


  public void drawLine2(char b) {
    //System.out.println(position);
    //System.out.println(Character.toLowerCase(b));
    int position = Character.toUpperCase(b) - 'A' + 1;
    int betweeenSpaces = -1;
    for (int j = (int) b; j >= 65; j--) {

      //int leadingSpaces = (int)b - 1;

      for (int i = 0; i < leadingSpaces; i++) {
        System.out.print(" ");
      }

      System.out.print((char) j);
      position--;

      if (j > 65) {
        for (int i = 0; i < betweeenSpaces; i++) {
          System.out.print(" ");
        }
        System.out.println((char) j);
      } else {
        System.out.println();
      }
      betweeenSpaces += 2;

      if (j == (int) b) {
        break;
      }
    }

  }

}
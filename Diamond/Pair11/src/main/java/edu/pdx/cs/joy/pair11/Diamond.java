package edu.pdx.cs.joy.pair11;

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
    return;
  }

  public static String diamond_line(int begin, int mid, char letter){

    StringBuilder output = new StringBuilder();

    output.append(" ".repeat(Math.max(0, begin)));
    output.append(letter);

    output.append(" ".repeat(Math.max(0, mid)));
    if (mid > 0){
      output.append(letter);
    }
    return output.toString();
  }
  public static void print_dimond(char letter) {
    int distance = letter - 'A';
    int mid = 0;

    for (char c = 'A'; c <= letter; c++) {
      System.out.println(diamond_line(distance, mid, c));
      mid +=2;
      distance -= 1;
    }
    distance = 1;
    mid -=4;
    for (char c = (char)(letter - 1); c >= 'A'; c--) {
      System.out.println(diamond_line(distance, mid, c));
      mid -= 2;
      distance += 1;
    }
  }



}
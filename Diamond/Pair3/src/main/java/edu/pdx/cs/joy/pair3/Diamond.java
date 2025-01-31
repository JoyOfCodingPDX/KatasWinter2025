package edu.pdx.cs.joy.pair3;

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

  public static String space(int b, int m, char last){

    StringBuilder output = new StringBuilder();
    output.append(" ".repeat(Math.max(0, b)));
    output.append(last);
    output.append(" ".repeat(Math.max(0, m)));
    if (m > 0){
      output.append(last);
    }
    return output.toString();
  }
  public static void print_dimond(char l) {
    int dist = l - 'A';
    int m = 0;

    for (char c = 'A'; c <= l; c++) {
      System.out.println(space(dist, m, c));
      m +=2;
      dist -= 1;
    }
    dist = 1;
    m -=4;
    for (char c = (char)(l - 1); c >= 'A'; c--) {
      System.out.println(space(dist, m, c));
      m -= 2;
      dist += 1;
    }
  }



}
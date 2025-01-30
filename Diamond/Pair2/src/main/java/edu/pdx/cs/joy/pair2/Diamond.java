package edu.pdx.cs.joy.pair2;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Diamond {

  public int loop(String letter){

    int value = (int) letter.charAt(0);
    value = value - 64;
    int loop = 1 + (value -1) * 2;
    for(int x = 0; x < loop; x++){
      loop2((char) (65 + x), value);
    }
    return 1;
  }

  public int loop2(char letter, int number){

    return 1;
  }

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }
}
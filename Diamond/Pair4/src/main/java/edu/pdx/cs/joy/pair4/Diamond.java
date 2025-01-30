package edu.pdx.cs.joy.pair4;

import com.google.common.annotations.VisibleForTesting;

import java.security.SecureRandom;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Diamond {

  @VisibleForTesting
  public static void main(String[] args) {

    int gap = 0;
    if(args.length != 1 || args[0].length() != 1){
      System.err.print("invalid");
    }

    int end = args[0].charAt(0);
    for( int i = 65; i <= end;++i){
      if(i != 65 || i != end){
        char lett = (char) i;
        System.out.print(lett);

        for( int j = 0; j < gap; ++j){
          System.out.print(" ");
        }

        System.out.print(lett);
      }

      ++gap;
      System.out.println();
    }

  }
}
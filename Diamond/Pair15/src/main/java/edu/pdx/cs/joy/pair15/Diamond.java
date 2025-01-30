package edu.pdx.cs.joy.pair15;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Diamond {
  private Character endLetter;
  private char [] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };


  @VisibleForTesting
  public static void main(String[] args) {
    if(args.length != 1){
      //too many inputs?
      return;
    }
    String takingIn = args[0];


  }

  public void parseLetter(String input){
    int spaceAmount;
    input.toUpperCase();
    for(int i = 0; i < alphabet.length; i++){
      if(input.equals(alphabet[i])){
        spaceAmount = i+1;
        print(input, spaceAmount);
      }
    }
  }
  public void print(String input, int spaceAmount) {
    for(int i = 0; i < spaceAmount; i++){
      for(int j = 0; j < spaceAmount; j++){
        System.out.print(" ");
      }
      System.out.print(alphabet[i]);
      int middleSpaceAmount = 1;

    }
  }
}
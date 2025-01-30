package edu.pdx.cs.joy.pair15;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Diamond {
  private String endLetter;
  private char [] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

  public Diamond(String letter) {
    this.endLetter = letter;
  }

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public void parseLetter(Character input){
    int spaceAmount;
    Character.toUpperCase(input);
    for(int i = 0; i < alphabet.length; i++){
      if(input.equals(alphabet[i])){
        spaceAmount = i+1;
        print(input, spaceAmount);
      }
    }
  }
  public void print(Character input, int spaceAmount) {
    for(int i = 0; i < spaceAmount; i++){
      for(int j = 0; j < spaceAmount; j++){
        System.out.print(" ");
      }
      System.out.print(alphabet[i]);
      int middleSpaceAmount = 1;

    }
  }
}
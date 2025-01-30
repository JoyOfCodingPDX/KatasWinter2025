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
    //boolean test = Character.isUpperCase((char) letter.charAt(0));
    if(letter.length() != 1){
      return -2;
    }
    int value = (int) letter.charAt(0);
    if(value < 65 && value > 90){
      return -1;
    }
    value = value - 64;
    int loop = 1 + (value -1) * 2;
    for(int x = 0; x < value; x++){
      loop2((char) (65 + x), value - x, value);
    }
    for(int x = value -2; x >= 0; x--){
      loop2((char) (65+x), value - x, value);
    }
    return loop;
  }

  @VisibleForTesting
  public int loop2(char letter, int displayat, int displaytotal){
    int second_dis = displaytotal - displayat;

    String dis = "";
    for (int x= 1; x < displayat; x++){
      dis += " ";
    }
    dis += letter;
    if (second_dis > 0){
      for(int x=0; x < second_dis; x++){
        dis+= " ";
      }
      for (int x=1; x < displaytotal -displayat ; x++){
        dis+= " ";
      }
      dis+= letter;
    }

    System.out.println(dis);

    return 1;
  }

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }
}
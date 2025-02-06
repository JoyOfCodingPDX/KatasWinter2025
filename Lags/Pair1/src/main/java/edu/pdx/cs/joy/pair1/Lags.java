package edu.pdx.cs.joy.pair1;

import java.util.*;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Lags {
  @VisibleForTesting
  public static int nextElement(List<Integer> start, List<Integer> length, int mark){

    return 1;
  }


  @VisibleForTesting
  public static void main(String[] args) {
    List<String> name = new ArrayList<String>();
    List<Integer> start = new ArrayList<Integer>();
    List<Integer> length = new ArrayList<Integer>();
    List<Integer> weight = new ArrayList<Integer>();
    for(String str : args){
      String[] words = str.split(" ");
      name.add(words[0]);
      start.add(Integer.parseInt(words[1]));
      length.add(Integer.parseInt(words[2]));
      weight.add(Integer.parseInt(words[3]));
    }
  }
}
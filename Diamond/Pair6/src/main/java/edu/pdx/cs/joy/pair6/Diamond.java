package edu.pdx.cs.joy.pair6;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Strings;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Diamond {

  String alphabet[] ={"A","B","C","D","E","F"};

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public String diamond(String s)
  {
    if(s.equals('A'))
    {
      return s;
    }
    if(s.equals('B')
    {
      String s = " A";
      s+= "B B";
      s = " A ";
      return s;
    }
    return s;
  }



}
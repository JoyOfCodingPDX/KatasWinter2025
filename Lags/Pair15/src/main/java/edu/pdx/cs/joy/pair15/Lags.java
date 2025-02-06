package edu.pdx.cs.joy.pair15;

import com.google.common.annotations.VisibleForTesting;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Lags {

  @VisibleForTesting
  public static void main(String[] args) {
    if (args.length <1 ){
      System.err.println("Missing command line arguments");}

    class Bid{
      String name;
      Integer start;
      Integer end;
      Integer value;
    }

    ArrayList<String> input = new ArrayList<String>(List.of(args));
    ArrayList<Bid> bids = new ArrayList<Bid>();

    Stack<Integer> solutionQueue = new Stack<>();

    // name start end $$
    for (int i = 0; i < input.size(); i += 4){

    }
  }
}


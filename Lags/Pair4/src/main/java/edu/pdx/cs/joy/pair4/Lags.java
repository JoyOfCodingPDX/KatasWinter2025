package edu.pdx.cs.joy.pair4;

import java.util.List;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Lags {

  @VisibleForTesting
  public static void main(String[] args) {
    if (args.length == 0){
      System.err.println("Missing command line arguments");
      return;
    }
    List<Args> flights = List.of();
    int loopAmount = args.length / 4;
    for(int i = 0; i < loopAmount; i++) {
      Args arguments = new Args(args[i], Integer.parseInt(args[(4 * i) + 1]), Integer.parseInt(args[(4 * i) + 2]), Integer.parseInt(args[(4 * i) + 3]));
      flights.add(arguments);
    }
    System.out.println(flights);
  }
}
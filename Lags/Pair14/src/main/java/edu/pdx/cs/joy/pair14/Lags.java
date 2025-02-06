package edu.pdx.cs.joy.pair14;

import com.google.common.annotations.VisibleForTesting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Lags {




  @VisibleForTesting
  public static void main(String[] args) {
    if(args.length == 0) {
      System.err.println("Missing command line arguments");
    }
    String[] vals = new String[4];

    for(int i = 0; i< args.length; i++){
      vals[i] = Arrays.toString(args);
    }
    int startTime = Integer.parseInt(vals[1]);
    int endTime = Integer.parseInt(vals[2]);
    int price = Integer.parseInt(vals[3]);

    Flight flight = new Flight(vals[0], startTime, endTime, price);

    System.out.println(flight.getName() + " " + flight.getStartTime() + " " +flight.getEndTime() + " " +flight.getPrice());





  }
}
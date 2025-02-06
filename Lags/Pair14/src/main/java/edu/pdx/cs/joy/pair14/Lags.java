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

    String name1 = args[0];
    int startTime1 = Integer.parseInt(args[1]);
    int endTime1 = Integer.parseInt(args[2]);
    int price1 = Integer.parseInt(args[3]);
    int startTime2 = Integer.parseInt(args[5]);
    int endTime2 = Integer.parseInt(args[6]);
    int price2 = Integer.parseInt(args[7]);
    int startTime3 = Integer.parseInt(args[9]);
    int endTime3 = Integer.parseInt(args[10]);
    int price3 = Integer.parseInt(args[11]);
    int startTime4 = Integer.parseInt(args[13]);
    int endTime4 = Integer.parseInt(args[14]);
    int price4 = Integer.parseInt(args[15]);

    Flight flight1 = new Flight(name1, startTime1, endTime1, price1);
    Flight flight2 = new Flight(args[4], startTime2, endTime2, price2);
    Flight flight3 = new Flight(args[8], startTime3, endTime3, price3);
    Flight flight4 = new Flight(args[12], startTime4, endTime4, price4);

    Collection<Flight> flights = new ArrayList<>();
    flights.add(flight1);
    flights.add(flight2);
    flights.add(flight3);
    flights.add(flight4);

    Flight lowest = null;
    for(Flight aFlight : flights){
      if(lowest == null){
        lowest = aFlight;
      }
      if(aFlight.getStartTime() < lowest.getStartTime()){
        lowest = aFlight;
      }
    }
    System.out.println(lowest.getName());

  }
}
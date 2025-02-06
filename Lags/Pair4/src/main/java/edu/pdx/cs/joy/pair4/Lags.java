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

  static List<Flight> parse(String[] args) {
    List<Flight> flights = new java.util.ArrayList<>(List.of());
    int loopAmount = args.length / 4;
    for (
            int i = 0;
            i < loopAmount; i++) {
      Flight arguments = new Flight(args[i], Integer.parseInt(args[(4 * i) + 1]), Integer.parseInt(args[(4 * i) + 2]), Integer.parseInt(args[(4 * i) + 3]));
      flights.add(arguments);
    }
    return flights;
  }

  @VisibleForTesting
  public static void main(String[] args) {
    if (args.length == 0) {
      System.err.println("Missing command line arguments");
      return;
    }
    List<Flight> flights = parse(args);
    solve(flights);
  }

  public static List<Flight> solve(List<Flight> flights) {
    Flight flight = flights.get(flights.size() - 1);
    List<Flight> candidateFlights = flights.stream().filter((Flight currentFlight) -> flight.endTime <= currentFlight.startTime).toList();
//    candidateFlights.stream().map((candidateFlight) -> new List) // Combination of flights
//    List<List<Flight>> = //
    return List.of();
  }
}
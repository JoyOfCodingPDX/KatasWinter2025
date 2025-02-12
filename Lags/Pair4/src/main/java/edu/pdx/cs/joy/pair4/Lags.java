package edu.pdx.cs.joy.pair4;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
    List<List<Flight>> combinations = getCandidateFlights(flights);
    Optional<List<Flight>> result = combinations.stream().sorted((flightList1, flightList2) -> Integer.valueOf(flightList2.stream().mapToInt(flight -> flight.money).reduce(0, (f1, f2) -> f1 + f2)).compareTo(flightList1.stream().mapToInt(flight -> flight.money).reduce(0, (f1, f2) -> f1 + f2))).findFirst();
    if (result.isEmpty()) {
      System.out.println("No values provided");
    } else {
      System.out.println("The best set of flights to take is " + getFlightSequence(result.get()));
    }
  }

  public static List<List<Flight>> getCandidateFlights(List<Flight> flights) {
    Flight flight = flights.get(flights.size() - 1);
    List<List<Flight>> candidateSequences = flights
    .stream()
    .filter((Flight currentFlight) -> flight.endTime <= currentFlight.startTime)
    .map((candidateFlight) -> {
      List<Flight> result = new ArrayList<>(flights);
      result.add(candidateFlight);
      return result;
    }).toList();
    return candidateSequences;
  }

  public static String getFlightSequence(List<Flight> flights) {
    return String.join(" -> ", flights.stream().map((f) -> f.id).toList());
  }
}
package edu.pdx.cs.joy.pair9;

import java.util.List;

import com.google.common.annotations.VisibleForTesting;


class FlightRequest {
  String id;
  int start;
  int end;
  int price;

  public FlightRequest(String id, int start, int duration, int price) {
      this.id = id;
      this.start = start;
      this.end = start + duration;
      this.price = price;
  }
}

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Lags {
  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public int findMaxProfit(List<FlightRequest> requests) {
      return 0;
  }
}
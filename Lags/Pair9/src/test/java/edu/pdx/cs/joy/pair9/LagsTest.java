package edu.pdx.cs.joy.pair9;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LagsTest
{

  @Test
  void canInstantiateKataClass() {
    new Lags();
  }

  @Test
  void testBasicCase() {
    List<FlightRequest> requests = Arrays.asList(
            new FlightRequest("AF514", 0, 5, 10),
            new FlightRequest("CO5", 3, 7, 14),
            new FlightRequest("AF515", 5, 4, 7),
            new FlightRequest("BA01", 6, 3, 8)
    );
    Lags lags = new Lags();
    assertEquals(18, lags.findMaxProfit(requests));
  }
  @Test
  void testNoRequests() {
    List<FlightRequest> requests = Collections.emptyList();
    Lags lags = new Lags();
    assertEquals(0, lags.findMaxProfit(requests));
  }
  @Test
  void testSingleRequest() {
    List<FlightRequest> requests = Collections.singletonList(
            new FlightRequest("FL1", 0, 5, 10)
    );
    Lags lags = new Lags();
    assertEquals(10, lags.findMaxProfit(requests));  // Expected: 10
  }
  @Test
  void testMixedOverlappingAndNonOverlapping() {
    List<FlightRequest> requests = Arrays.asList(
            new FlightRequest("FL1", 0, 4, 10),
            new FlightRequest("FL2", 3, 3, 15),
            new FlightRequest("FL3", 5, 3, 20),
            new FlightRequest("FL4", 6, 2, 25)
    );
    Lags lags = new Lags();
    assertEquals(40, lags.findMaxProfit(requests));  // Expected: FL1 + FL4 = 10+25=35
  }

  @Test
  void testNoOverlappingRequests() {
    List<FlightRequest> requests = Arrays.asList(
            new FlightRequest("FL1", 0, 3, 10),
            new FlightRequest("FL2", 4, 3, 20),
            new FlightRequest("FL3", 8, 2, 30)
    );
    Lags lags = new Lags();
    assertEquals(60, lags.findMaxProfit(requests));  // Expected: 10+20+30=60
  }
}

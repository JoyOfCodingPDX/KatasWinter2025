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
}

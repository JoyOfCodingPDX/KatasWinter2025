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
    List<Lags> requests = Arrays.asList(
            new Lags("AF514", 0, 5, 10),
            new Lags("CO5", 3, 7, 14),
            new Lags("AF515", 5, 4, 7),
            new Lags("BA01", 6, 3, 8)
    );
    assertEquals(18, FlightScheduler.findMaxProfit(requests));  // Expected: 18
  }
  @Test
  void testNoRequests() {
    List<Lags> requests = Collections.emptyList();
    assertEquals(0, FlightScheduler.findMaxProfit(requests));  // Expected: 0 (no flights)
  }

}

package edu.pdx.cs.joy.pair11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LagsTest
{
    private Lags lag;

    @BeforeEach
    void setUp() {
        lag = new Lags();
        lag.flights.add(new Lags.Flight("AF514", 0, 5, 10));
        lag.flights.add(new Lags.Flight("CO5", 3, 7, 14));
        lag.flights.add(new Lags.Flight("AF515", 5, 4, 7));
        lag.flights.add(new Lags.Flight("BA01", 6, 3, 8));
    }

    @Test
        void canInstantiateKataClass() {
            Lags lag = new Lags();
        }

        @Disabled
    @Test
        void testGetMaxProfitBasic() {
		int result = lag.getMaxProfit(new ArrayList<>());
        	assertEquals(18, result); 
        }
 @Test
  void testGetMaxProfitNoFlights() {
    List<Lags.Flight> flights = new ArrayList<>();
    int result = Lags.getMaxProfit(flights);
    assertEquals(0, result);
  }
}

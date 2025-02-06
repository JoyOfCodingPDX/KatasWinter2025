package edu.pdx.cs.joy.pair11;
import java.util.Vector;

import org.junit.jupiter.api.Test;

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

    @Test
        void testGetMaxProfitBasic() {
        }
}

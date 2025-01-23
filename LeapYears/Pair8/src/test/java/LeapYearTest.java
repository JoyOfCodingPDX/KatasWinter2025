import org.junit.jupiter.api.Test;

import static edu.pdx.cs.joy.pair8.LeapYears.leapYears;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearTest {
    @Test
    void yearsDivisibleBy400Are() {
        int year = 2000;
        assertTrue(leapYears(year));
    }

    @Test
    void yearsDivisibleBy100ButNot400Not() {
        assertFalse(leapYears(1700));
        assertFalse(leapYears(1800));
        assertFalse(leapYears(1900));
        assertFalse(leapYears(2100));
    }

    @Test
    void yearsDivisibleBy4AndNot100Are() {
        assertTrue(leapYears(2008));
        assertTrue(leapYears(2012));
        assertTrue(leapYears(2016));
    }

    @Test
    void yearsDivisibleBy4AreNot() {
        assertFalse(leapYears(2017));
        assertFalse(leapYears(2018));
        assertFalse(leapYears(2019));
    }


}

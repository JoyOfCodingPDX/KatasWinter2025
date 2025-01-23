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
    void yearsDivisibleBy4AndNot100Are(int year) {
        assertTrue(year % 4 == 0 && year % 100 != 0);
    }

    @Test
    void yearsDivisibleBy4AreNot(int year) {
        assertFalse(year % 4 == 0);
    }


}

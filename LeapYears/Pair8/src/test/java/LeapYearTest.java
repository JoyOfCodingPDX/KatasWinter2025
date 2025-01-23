import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearTest {
    void yearsDivisibleBy400Are(int year) {
        assertTrue(year % 400 == 0);
    }

    void yearsDivisibleBy100ButNot400Not(int year) {
        assertFalse(year % 100 == 0 && year % 400 != 0);
    }

    void yearsDivisibleBy4AndNot100Are(int year) {
        assertTrue(year % 400 == 0);
    }
}

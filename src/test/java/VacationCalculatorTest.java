import org.junit.jupiter.api.*;
import ru.netology.services.VacationCalculator;

import static org.junit.jupiter.api.Assertions.*;


class VacationCalculatorTest {

    @Test
    void testFirstCase() {
        VacationCalculator calculator = new VacationCalculator();
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        int expectedMonths = 3;
        int actualMonths = calculator.calculate(income, expenses, threshold);
        assertEquals(expectedMonths, actualMonths);
    }

    @Test
    void testSecondCase() {
        VacationCalculator calculator = new VacationCalculator();
        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;
        int expectedMonths = 2;
        int actualMonths = calculator.calculate(income, expenses, threshold);
        assertEquals(expectedMonths, actualMonths);
    }
}
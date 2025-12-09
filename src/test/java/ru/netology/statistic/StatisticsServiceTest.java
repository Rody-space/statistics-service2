package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void findMax_SingleElement() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {42};
        long expected = 42;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMax_MaxInMiddle() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {1, 2, 5, 3, 4};
        long expected = 5;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMax_AllSame() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {3, 3, 3, 3};
        long expected = 3;  // Указано ожидаемое значение


        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}

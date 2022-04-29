package ru.netology.statistic;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @org.junit.jupiter.api.Test
    void findMax() {StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {5, 12, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);

    }
}
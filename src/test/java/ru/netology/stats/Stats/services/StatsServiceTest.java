package ru.netology.stats.Stats.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldFindMinSales() {
        StatsServiceTest service = new StatsServiceTest();

        int[] month = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedMonth = 3;
        int actualMonth = service.minSales(long[] sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }
}
}

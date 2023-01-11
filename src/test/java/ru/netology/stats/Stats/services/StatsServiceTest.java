package ru.netology.stats.Stats.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldFindMinSales() {
        StatsService service = new StatsService();

        int[] month = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedMonth = 9;
        int actualMonth = service.minSales(month);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }
}


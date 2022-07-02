package ru.netology.stats.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void StatsServiceTest() {
        StatsService service = new StatsService();
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSumSales = 180;
        int actualSumSales = service.sumSales(arr);

        Assertions.assertEquals(expectedSumSales, actualSumSales);

        int expectedAverageSumSales = 15;
        int actualAverageSumSales = service.averageSumSales(arr);

        Assertions.assertEquals(expectedAverageSumSales, actualAverageSumSales);

        int expectedNumbMonthMaxSales = 6;
        int actualNumbMonthMaxSales = service.numbMonthMaxSales(arr);

        Assertions.assertEquals(expectedNumbMonthMaxSales, actualNumbMonthMaxSales);

        int expectedNumbMonthMinSales = 9;
        int actualNumbMonthMinSales = service.numbMonthMinSales(arr);

        Assertions.assertEquals(expectedNumbMonthMinSales, actualNumbMonthMinSales);

        int expectedBelowAverage = 5;
        int actualBelowAverage = service.belowAverage(arr);

        Assertions.assertEquals(expectedBelowAverage, actualBelowAverage);

        int expectedAboveAverage = 5;
        int actualAboveAverage = service.aboveAverage(arr);

        Assertions.assertEquals(expectedAboveAverage, actualAboveAverage);
    }
}

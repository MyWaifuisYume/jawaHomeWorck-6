package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldSumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.sumSales(sales);
        long expected = 180;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAverageSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.averageSale(sales);
        long expected = 15;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMonthMaximumSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.monthMaximumSale(sales);
        long expected = 8;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldMonthMinimumSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.monthMinimumSale(sales);
        long expected = 9;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNumberMonthBelowAverageSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.numberMonthBelowAverageSale(sales);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNumberMonthAboveAverageSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.numberMonthAboveAverageSale(sales);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }
}

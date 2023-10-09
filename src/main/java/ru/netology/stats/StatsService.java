package ru.netology.stats;
public class StatsService {
    public long sumSales(long[] sales){
        long totalSales = 0;
        for (long sale : sales) {
            totalSales += sale;
        }
        return totalSales;
    }
    public long averageSale(long[] sales) {
        long totalSales = sumSales(sales);
        long average = totalSales / sales.length;
        return average;
    }

    public int monthMaximumSale(long[] sales) {
        int monthMax = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMax]) {
                monthMax = i;
            }
        }
        return monthMax + 1;
    }
    public int monthMinimumSale(long[] sales) {
        int monthMin = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[monthMin]) {
                monthMin = i;
            }
        }
        return monthMin + 1;
    }
    public int numberMonthBelowAverageSale(long[] sales) {
        int mothBelowAverage = 0;
        long average = averageSale(sales);
        for (long sale : sales) {
            if (sale < average) {
                mothBelowAverage++;
            }
        }
        return mothBelowAverage;
    }

    public int numberMonthAboveAverageSale(long[] sales) {
        int mothAboveAverage = 0;
        long average = averageSale(sales);
        for (long sale : sales) {
            if (sale > average) {
                mothAboveAverage++;
            }
        }
        return mothAboveAverage;
    }
}


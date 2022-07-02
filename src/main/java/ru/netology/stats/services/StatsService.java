package ru.netology.stats.services;


public class StatsService {
    public int sumSales(int[] sales){
        int sum = 0;
        for (int i = 0; i < sales.length; i++ ){
             sum += sales[i];
        }
        return sum;
    }
    public int averageSumSales(int[] sales){
        int sum = sumSales(sales);
        int average = sum / sales.length;
        return average;
    }
    public int numbMonthMaxSales(int[] sales){
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++ ){
            if (sales[i] > sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int numbMonthMinSales(int[] sales){
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++ ){
            if (sales[i] < sales[minMonth]) {
                sales[minMonth] = i;
            }
        }
        return sales[minMonth] + 1 ;
    }
    public int belowAverage(int[] sales) {
        int average = averageSumSales(sales);
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                count++;
            }
        }
        return count;
    }
    public int aboveAverage(int[] sales) {
        int average = averageSumSales(sales);
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                count++;
            }
        }
        return count;
    }
}

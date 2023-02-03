package ru.netology.javaqa.StatsService;

public class StatsService {
    //задание 1
    public long sumSales(long[] sales) {
        long sumMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            sumMonth = sumMonth + sales[i];

        }
        return sumMonth;
    }

    //задание 2
    public long averageSales(long[] sales) {
        long sumMonth = sumSales(sales);
        long averageSumMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            averageSumMonth = sumMonth / sales.length;
        }
        return averageSumMonth;

    }

    // задание 3:
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    //задание 4:
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    //задание 5:
    public int belowAverage(long[] sales) {
        int belowMonth = 0;
        long averageSumMonth = averageSales(sales);
        for (long sale : sales) {

            if (sale < averageSumMonth) {
                belowMonth++;
            }
        }
        return belowMonth;
    }

    public int aboveAverage(long[] sales) {
        int aboveMonth = 0;
        long averageSumMonth = averageSales(sales);
        for (long sale : sales) {
            if (sale > averageSumMonth) {
                aboveMonth++;
            }
        }
        return aboveMonth;
    }

}

package ru.netology.stats.Stats.services;
public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }
//    public int getTotalSales(long[] sales) {
//        long totalSales = sales [0];
//        for (long t : sales); {
//            if (long t < totalSales) {
//                totalSales = t;
//            }
//        }
//        return totalSales;
//    }
}



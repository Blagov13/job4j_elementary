package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        double dolg = amount;
        while (dolg > 0) {
            year++;
            dolg = (dolg + dolg * percent / 100) - salary;
        }
        return year;
    }
}

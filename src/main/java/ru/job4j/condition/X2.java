package ru.job4j.condition;

public class X2 {
    public static int calc(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int rsl = X2.calc(a, b, c, x);
        System.out.println(rsl);
        a = 0;
        int rsl1 = X2.calc(a, b, c, x);
        System.out.println(rsl1);
        a = 1;
        c = 0;
        int rsl2 = X2.calc(a, b, c, x);
        System.out.println(rsl2);
        c = 1;
        x = 0;
        int rsl3 = X2.calc(a, b, c, x);
        System.out.println(rsl3);
    }
}

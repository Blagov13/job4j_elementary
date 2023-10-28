package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));
        return rsl;
    }

    public static void main(String[] args) {
        short x1 = 1;
        short x2 = 2;
        short y1 = 1;
        short y2 = 0;
        double result = Point.distance(x1, y1, x2, y2);
        System.out.println("result " + "(" + x1 + ", " + y1 + ") " + "(" + x2 + ", " + y2 + ") "  + result);
    }
}

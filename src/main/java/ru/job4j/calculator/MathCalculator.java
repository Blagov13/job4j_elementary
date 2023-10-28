package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;
public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double min(double first, double second) {
        return minus(first, second)
                + divide(first, second);
    }

    public static double div(double first, double second) {
        return divide(first, second)
                + sum(first, second)
                + multiply(first, second)
                + minus(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + min(10, 20));
        System.out.println("Результат расчета равен: " + div(10, 20));
    }
}

package ru.job4j.condition;

public class AlertDivByZero {
    public static void possibleDiv(int number) {
        if (number <= 0) {
            System.out.println("This is negative number");
        }
    }

    public static void main(String[] args) {
        AlertDivByZero.possibleDiv(0);
        AlertDivByZero.possibleDiv(4);
        AlertDivByZero.possibleDiv(-1);
    }
}

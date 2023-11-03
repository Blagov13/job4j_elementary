package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        int i = left.length - 1;
        int j = right.length - 1;
        if (left[i] == right[j]) {
            return true;
        }
        return false;
    }
}

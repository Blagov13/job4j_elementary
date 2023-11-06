package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == symbol) {
                counter += 1;
            } else {
                if (counter <= 1) {
                    result = result + input.charAt(i - 1);
                } else {
                    result = result + input.charAt(i - 1) + counter;
                    counter = 1;
                    symbol = input.charAt(i);
                }
            }
        }
        return result;
    }
}

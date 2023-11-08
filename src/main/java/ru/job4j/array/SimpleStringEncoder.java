package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                counter += 1;
            } else {
                if (counter <= 1) {
                    result += input.charAt(i);
                } else {
                    result = result + input.charAt(i) + counter;
                    symbol = input.charAt(i);
                    counter = 1;
                }
            }
        }
        if (counter <= 1) {
            result += input.charAt(input.length() - 1);
        } else {
            result = result + input.charAt(input.length() - 1) + counter;
        }
        return result;
    }
}


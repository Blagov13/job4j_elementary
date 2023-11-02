package ru.job4j.loop;

public class PrimeNumber {
        public static int calc(int finish) {
            int result = 1;
            for (int i = 2; i <= finish; i++) {
                boolean isPrime = true;
                if (CheckPrimeNumber.check(i)) {
                    if (isPrime) {
                        ++result;
                    }

                }
            }
            return result;
        }
}

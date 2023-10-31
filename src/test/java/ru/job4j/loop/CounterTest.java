package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CounterTest {
    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumNumbersFromTwoToThreeFive() {
        int start = 2;
        int finish = 3;
        int result = Counter.sum(start, finish);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }
}

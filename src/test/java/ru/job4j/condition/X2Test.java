package ru.job4j.condition;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class X2Test {
    @Test
    void whenA1B1C1X1Then3() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 3;
        int rsl = X2.calc(a, b, c, x);
        assertThat(rsl).isEqualTo(expected);
        a = 0;
        expected = 2;
        int rsl1 = X2.calc(a, b, c, x);
        assertThat(rsl1).isEqualTo(expected);
        a = 1;
        c = 0;
        expected = 2;
        int rsl2 = X2.calc(a, b, c, x);
        assertThat(rsl2).isEqualTo(expected);
        c = 1;
        x = 0;
        expected = 1;
        int rsl3 = X2.calc(a, b, c, x);
        assertThat(rsl3).isEqualTo(expected);
    }

}

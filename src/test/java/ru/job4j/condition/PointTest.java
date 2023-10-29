package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class PointTest {
    @Test
    void when13to24then141() {
        double expected = 1.41;
        int x1 = 1;
        int y1 = 3;
        int x2 = 2;
        int y2 = 4;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when01to23then141() {
        double expected = 1.41;
        int x1 = 0;
        int y1 = 2;
        int x2 = 1;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when40to12then412() {
        double expected = 4.12;
        int x1 = 4;
        int y1 = 1;
        int x2 = 0;
        int y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}

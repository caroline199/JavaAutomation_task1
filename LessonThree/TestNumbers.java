package LessonThree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestNumbers {
    @Test
    void testSumPositive() {
        org.example.Numbers numbers = new org.example.Numbers(2, 2);

        Assertions.assertEquals(4, numbers.getSum());
    }
    @Test
    void testDiffPositive() {
        org.example.Numbers numbers = new org.example.Numbers(4, 2);

        Assertions.assertEquals(2, numbers.getDiff());
    }
    @Test
    void testMultiplicationPositive() {
        org.example.Numbers numbers = new org.example.Numbers(3, 3);

        Assertions.assertEquals(9, numbers.getMult());
    }
    @Test
    void testDivPositive() {
        org.example.Numbers numbers = new org.example.Numbers(1, 1);

        Assertions.assertEquals(1, numbers.getDivOnY());
    }
}
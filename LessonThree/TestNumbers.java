package LessonThree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestNumbers {
    @Test
    void testValues() {
        Numbers numbers = new Numbers(1, 2);

        Assertions.assertEquals(3, numbers.getSum());
    }
}
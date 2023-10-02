package homework_3.task_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class test_even_odd_number {
    private final NumberUtils numberUtils = new NumberUtils();

    @Test

    public void testEvenOddNumber_evenNumber() {
        int number = 10;
        boolean result = numberUtils.evenOddNumber(number);
        Assertions.assertTrue(result);
    }

    @Test

    public void testEvenOddNumber_oddNumber() {
        int number = 15;
        boolean result = numberUtils.evenOddNumber(number);
        Assertions.assertFalse(result);
    }
}
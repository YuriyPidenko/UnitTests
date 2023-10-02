package homework_3.task_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class tet_number_in_interval {
    private final NumberUtils numberUtils = new NumberUtils();

    @Test

    public void testNumberInInterval_numberInRange() {
        int number = 50;
        boolean result = numberUtils.numberInInterval(number);
        Assertions.assertTrue(result);
    }

    @Test

    public void testNumberInInterval_numberOutOfRange() {
        int number = 110;
        boolean result = numberUtils.numberInInterval(number);
        Assertions.assertFalse(result);

    }
}
package homework_1.task_1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;



public class calculatorTest {

  @Test

  public void testCalculateDiscount() {

    calculator calculator = new calculator();

    

    // Тест 1: проверка корректного расчета скидки

    double result1 = calculator.calculateDiscount(100.0, 10.0);

    assertThat(result1).isEqualTo(90.0);

    

    // Тест 2: проверка расчета скидки для суммы покупки равной 0

    double result2 = calculator.calculateDiscount(0.0, 20.0);

    assertThat(result2).isEqualTo(0.0);

    

    // Тест 3: проверка выброса исключения при отрицательной сумме покупки

    assertThatThrownBy(() -> calculator.calculateDiscount(-100.0, 15.0))

      .isInstanceOf(ArithmeticException.class)

      .hasMessage("Invalid arguments");

    

    // Тест 4: проверка выброса исключения при отрицательном проценте скидки

    assertThatThrownBy(() -> calculator.calculateDiscount(200.0, -10.0))

      .isInstanceOf(ArithmeticException.class)

      .hasMessage("Invalid arguments");

    

    // Тест 5: проверка выброса исключения при проценте скидки больше 100

    assertThatThrownBy(() -> calculator.calculateDiscount(150.0, 120.0))

      .isInstanceOf(ArithmeticException.class)

      .hasMessage("Invalid arguments");

    }

private Object assertThat(double result1) {
    return null;
 }
}

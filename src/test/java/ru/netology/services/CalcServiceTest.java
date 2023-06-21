package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.CalcService;

public class CalcServiceTest {

    @Test
    public void shouldCalcExact() {
        CalcService service = new CalcService();
        int expected = 3;
        int actual = service.calculate(10000, 3000, 20000);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcInexact() {
        CalcService service = new CalcService();

        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);
        Assertions.assertEquals(expected, actual);
    }
}

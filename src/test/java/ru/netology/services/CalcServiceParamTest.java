package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class CalcServiceParamTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/MonthService.svc")
    public void shouldCalcExact(int expected, int income, int expenses, int threshold) {
        CalcService service = new CalcService();
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
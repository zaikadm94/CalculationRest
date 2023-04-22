package ru.netology.javaqamvn.services;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class CalculateServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/data.csv")
    void testPozitiveScenario(int expected, int income, int expenses, int threshold) {
        CalculateService service = new CalculateService();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }
}

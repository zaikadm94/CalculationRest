package ru.netology.javaqamvn.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class CalculateServiceTest {
    @Test
    void test() {
        CalculateService services = new CalculateService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;
        int actual = services.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);

    }
}

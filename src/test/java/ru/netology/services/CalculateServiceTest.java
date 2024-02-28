package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculateServiceTest {

    @Test
    void holidayOne() {

        CalculateService service = new CalculateService();

        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expectedHoliday = 3;

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expectedHoliday, actual);
    }

    @Test
    void holidayTwo() {
        CalculateService service = new CalculateService();

        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expectedHoliday = 2;

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expectedHoliday, actual);
    }
}

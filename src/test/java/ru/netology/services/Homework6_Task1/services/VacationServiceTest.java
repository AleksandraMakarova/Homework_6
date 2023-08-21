package ru.netology.services.Homework6_Task1.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
// import ru.netology.services.Homework6_Task1.services.VacationService;

public class VacationServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/data.csv")
    public void test(int income, int expenses, int threshold, int expected) {
        VacationService service = new VacationService();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    void income_10_000() {
//        VacationService service = new VacationService();
//
//        // подготавливаем данные:
//        int income = 10_000;
//        int expenses = 3_000;
//        int threshold = 20_000;
//        int expected = 3;
//
//        // вызываем целевой метод:
//        int actual = service.calculate(income, expenses, threshold);
//
//        // производим проверку (сравниваем ожидаемый и фактический):
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    void income_100_000() {
//        VacationService service = new VacationService();
//
//        // подготавливаем данные:
//        int income = 100_000;
//        int expenses = 60_000;
//        int threshold = 150_000;
//        int expected = 2;
//
//        // вызываем целевой метод:
//        int actual = service.calculate(income, expenses, threshold);
//
//        // производим проверку (сравниваем ожидаемый и фактический):
//        Assertions.assertEquals(expected, actual);
//    }
//
}

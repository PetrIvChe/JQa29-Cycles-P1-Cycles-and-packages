package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {
            "first range, 100, 200, 5",
            "second range, 200, 300, 3",
            "third range, 500, 1000, 9",
            "fourth range, 1000, 2500, 19",
            "fives range, 100, 10000, 90"
    })
    void shouldReturnNumberOfSquaresInRange(String testName, int startOfRange, int endOfRange, int expected) {
        SQRService service = new SQRService();
        int actual = service.calculateSquareInRange(startOfRange, endOfRange);

        assertEquals(expected, actual);
    }
}
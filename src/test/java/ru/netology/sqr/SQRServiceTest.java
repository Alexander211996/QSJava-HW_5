package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {
    @ParameterizedTest
    @CsvSource (value = {"LowLimitTest, 10, 200, 300, 3",
    "SimpleTest, 19, 200, 300, 3",
    "UpperLimitTest, 20, 200, 300, 3"
    })
    void shouldCalculateSqrQuantity(String testName, int i, int lowLimit, int upperLimit, int expected) {
        SQRService service = new SQRService();

        int k = 0;

        int actual = service.sqrQuantity (lowLimit, upperLimit);

        assertEquals(expected, actual);
    }

}

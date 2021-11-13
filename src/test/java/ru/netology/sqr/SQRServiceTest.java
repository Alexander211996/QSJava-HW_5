package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {
    @ParameterizedTest
    @CsvSource (value = {"LowLimitEqual, 10, 200, 300, 3",
    "SimpleTest, 15, 200, 300, 3",
    "UpperLimitEqual, 20, 200, 300, 3"
    })
    void shouldCalculateSqrQuantity(String testName, int i, int LowLimit, int UpperLimit, int expected) {
        SQRService service = new SQRService();

        int K = 0;

        int actual = service.sqrQuantity (K);

        assertEquals(expected, actual);
    }

}
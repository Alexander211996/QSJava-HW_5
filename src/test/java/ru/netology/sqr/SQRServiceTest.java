package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {
    @org.junit.jupiter.api.Test
    void sqrQuantity() {
        SQRService service = new SQRService();

        int K = 0;
        int i = 22;
        long expected = 3;

        long actual = service.sqrQuantity (K, i);

        assertEquals(expected, actual);
    }

}
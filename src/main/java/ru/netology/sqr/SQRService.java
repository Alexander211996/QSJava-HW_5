package ru.netology.sqr;

public class SQRService {
    public int sqrQuantity(int lowLimit, int upperLimit) {
        int k = 0;
        int i = 10;

        for (; i >= 10 && i <= 99; i++) {
            if ((i * i >= lowLimit) && (i * i <= upperLimit)) {
                k++;
            }

        }
        return k;
    }
}

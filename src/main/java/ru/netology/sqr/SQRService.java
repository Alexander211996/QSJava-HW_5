package ru.netology.sqr;

public class SQRService {
    public int sqrQuantity(int K) {
        K = 0;
        int i = 10;
        int LowLimit = 200;
        int UpperLimit = 300;

        for (; i >= 10 && i <= 99; i++) {
            if ((i * i >= LowLimit) && (i * i <= UpperLimit)) {
                K++;
            }

        }
        return K;
    }
}
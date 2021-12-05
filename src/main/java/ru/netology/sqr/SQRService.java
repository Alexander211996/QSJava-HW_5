package ru.netology.sqr;

public class SQRService {
    public int sqrQuantity(int LowLimit, int UpperLimit) {
        int K = 0;
        int i = 10;
        LowLimit = 200;
        UpperLimit = 300;

        for (; i >= 10 && i <= 99; i++) {
            if ((i * i >= LowLimit) && (i * i <= UpperLimit)) {
                K++;
            }

        }
        return K;
    }
}

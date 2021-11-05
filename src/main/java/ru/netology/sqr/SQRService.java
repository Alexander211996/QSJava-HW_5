package ru.netology.sqr;

public class SQRService {
    public long sqrQuantity(int k, int K) {
        K = 0;
        for (int i = 10; i >= 10 && i <= 99; i++) {
            if (i * i >= 200 && i * i <= 300) {
                K++;
            }

        }
        return K;
    }
}
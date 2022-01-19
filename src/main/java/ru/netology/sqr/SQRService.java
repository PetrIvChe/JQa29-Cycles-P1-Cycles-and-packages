package ru.netology.sqr;

public class SQRService {
    public int calculateSquareInRange(int startOfRange, int endOfRange) {
        int count = 0;
        int i;
        for (i = 10; i <= 99; i++) {
            if (i * i >= startOfRange && i * i <= endOfRange) {

                count++;

            }
        }
        return count;
    }
}

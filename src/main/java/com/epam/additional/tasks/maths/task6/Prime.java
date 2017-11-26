package com.epam.additional.tasks.maths.task6;

public class Prime {
    boolean isPrimeNumber(long n) {
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;
        for (long i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
package org.example.flexibility.calculator;

public final class NumberUtils {
    private NumberUtils() {
        // Prevent instantiation
    }

    public static int countEvenNumbers(int... values) {
        int evenNumbers = 0;
        for (int value : values) {
            if (value % 2 == 0) {
                evenNumbers++;
            }
        }
        return evenNumbers;
    }
}

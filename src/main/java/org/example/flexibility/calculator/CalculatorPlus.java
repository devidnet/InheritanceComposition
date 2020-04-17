package org.example.flexibility.calculator;

public class CalculatorPlus {

    public String getEvenNumberMessage(int... numbers) {
        return "The even number(s) is/are: " + NumberUtils.countEvenNumbers(numbers);
    }
}

package org.example.flexibility.calculator;

public class CalculatorPlus {

    public String getEvenNumberMessage(int... numbers) {
        return getMessageTemplate() + NumberUtils.countEvenNumbers(numbers);
    }

    private String getMessageTemplate() {
        return "The even number(s) is/are: ";
    }
}

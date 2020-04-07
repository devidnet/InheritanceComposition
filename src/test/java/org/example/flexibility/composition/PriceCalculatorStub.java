package org.example.flexibility.composition;

import java.util.List;

public class PriceCalculatorStub implements IPriceCalculator {
    @Override
    public double calculate(double basePrice, List<IIngredient> ingredients) {
        return 100.0;
    }
}

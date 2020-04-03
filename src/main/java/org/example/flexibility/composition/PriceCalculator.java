package org.example.flexibility.composition;

import java.util.List;

public class PriceCalculator implements IPriceCalculator {

    @Override
    public double calculate(double basePrice, List<IIngredient> ingredients) {
        Double totalPrice = basePrice;
        for (IIngredient ingredient : ingredients) {
            Double ingredientPrice = ingredient.getPrice();
            totalPrice += ingredientPrice;
        }
        return totalPrice;
    }
}

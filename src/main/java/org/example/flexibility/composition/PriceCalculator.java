package org.example.flexibility.composition;

import java.util.List;

public class PriceCalculator implements IPriceCalculator {

    private IPizzaSize pizzaSize;

    public PriceCalculator() {
    }

    public PriceCalculator(IPizzaSize pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    @Override
    public double calculate(double basePrice, List<IIngredient> ingredients) {
        Double totalPrice = basePrice;
        for (IIngredient ingredient : ingredients) {
            Double ingredientPrice = ingredient.getPrice();
            totalPrice += ingredientPrice;
        }
        return totalPrice * pizzaSize.getMultiplier();
    }
}

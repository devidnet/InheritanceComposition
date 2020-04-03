package org.example.flexibility.composition;

import java.util.List;

public interface IPriceCalculator {
    double calculate(double basePrice, List<IIngredient> ingredients);
}

package org.example.flexibility.composition;

import org.example.flexibility.inheritance.Ingredient;

import java.util.List;

public final class Pizza implements IPizza {
    Double price;
    IDough dough;
    IBaker baker;
    IPriceCalculator priceCalculator;
    List<IIngredient> ingredients;

    public Pizza(IDough dough, IBaker baker, IPriceCalculator priceCalculator, List<IIngredient> ingredients) {
        this.price = 5.0;
        this.dough = dough;
        this.baker = baker;
        this.priceCalculator = priceCalculator;
        this.ingredients = ingredients;
    }

    @Override
    public void prepare() {
        dough.prepare();
        for (IIngredient ingredient : ingredients) {
            ingredient.add();
        }
        baker.bake();
    }

    @Override
    public IDough getDough() {
        return dough;
    }

    @Override
    public List<IIngredient> getIngredients() {
        return ingredients;
    }

    @Override
    public IBaker getBaker() {
        return baker;
    }

    @Override
    public Double getPrice() {
        return priceCalculator.calculate(price, ingredients);
    }
}

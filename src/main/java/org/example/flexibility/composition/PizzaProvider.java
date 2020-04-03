package org.example.flexibility.composition;

import java.util.ArrayList;
import java.util.List;

public class PizzaProvider {

    public IPizza getHawaian() {
        IDough dough = new Dough();
        IBaker baker = new Baker();
        IPriceCalculator priceCalculator = new PriceCalculator();
        List<IIngredient> ingredients = getHawaianIngredients();
        IPizza pizza = new Pizza(dough, baker, priceCalculator, ingredients);

        return pizza;
    }

    public IPizza getHawaianMicroWave() {
        IDough dough = new Dough();
        IBaker baker = new MicroWaveBaker();
        IPriceCalculator priceCalculator = new PriceCalculator();
        List<IIngredient> ingredients = getHawaianIngredients();
        IPizza pizza = new Pizza(dough, baker, priceCalculator, ingredients);

        return pizza;
    }

    public IPizza getMargherita() {
        IDough dough = new Dough();
        IBaker baker = new Baker();
        IPriceCalculator priceCalculator = new PriceCalculator();
        List<IIngredient> ingredients = getMargheritaIngredients();
        IPizza pizza = new Pizza(dough, baker, priceCalculator, ingredients);

        return pizza;
    }

    public IPizza getMargheritaIntegral() {
        IDough dough = new IntegralDough();
        IBaker baker = new Baker();
        IPriceCalculator priceCalculator = new PriceCalculator();
        List<IIngredient> ingredients = getMargheritaIngredients();
        IPizza pizza = new Pizza(dough, baker, priceCalculator, ingredients);

        return pizza;
    }

    private List<IIngredient> getMargheritaIngredients() {
        List<IIngredient> ingredients = new ArrayList<>();
        ingredients.add(new Ingredient("Tomato sauce", 5.0));
        ingredients.add(new Ingredient("Cheese", 5.0));
        ingredients.add(new Ingredient("Tomato", 2.0));

        return  ingredients;
    }

    private List<IIngredient> getHawaianIngredients() {
        List<IIngredient> ingredients = new ArrayList<>();
        ingredients.add(new Ingredient("Cheese", 5.0));
        ingredients.add(new Ingredient("Pineapple", 2.0));
        ingredients.add(new Ingredient("Peach", 2.0));
        ingredients.add(new Ingredient("Tomato sauce", 5.0));
        ingredients.add(new Ingredient("Ham", 3.0));

        return ingredients;
    }
}

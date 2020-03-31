package org.example.flexibility.inheritance;

public class MargheritaPizza extends BasePizza {

    public MargheritaPizza() {
        ingredients.add(new Ingredient("Tomato sauce", 5.0));
        ingredients.add(new Ingredient("Cheese", 5.0));
        ingredients.add(new Ingredient("Tomato", 2.0));
    }
}

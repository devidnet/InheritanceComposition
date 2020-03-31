package org.example.flexibility.inheritance;


public class HawaianPizza extends BasePizza {

    public HawaianPizza() {
        ingredients.add(new Ingredient("Cheese", 5.0));
        ingredients.add(new Ingredient("Pineapple", 2.0));
        ingredients.add(new Ingredient("Peach", 2.0));
        ingredients.add(new Ingredient("Tomato sauce", 5.0));
        ingredients.add(new Ingredient("Ham", 3.0));
    }
}

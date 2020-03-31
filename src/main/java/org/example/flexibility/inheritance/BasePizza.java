package org.example.flexibility.inheritance;

import java.util.*;

public abstract class BasePizza {
    private double price;
    protected List<Ingredient> ingredients;

    public BasePizza() {
        price = 5.0;
        this.ingredients = new ArrayList<>();
    }

    public void prepare() {
        prepareDough();
        for (Ingredient ingredient : ingredients) {
            ingredient.add();
        }
        bake();
    }

    public double getPrice() {
        double totalPrice = price;
        for (Ingredient ingredient : ingredients) {
            Double ingredientPrice = ingredient.getPrice();
            totalPrice += ingredientPrice;
        }
        return totalPrice;
    }

    protected void prepareDough() {
        System.out.println("Preparing dough");
    }

    protected void bake() {
        System.out.println("Baking pizza");
    }
}

package org.example.flexibility.composition;

public class Ingredient implements IIngredient {
    private Double price;
    private String description;

    public Ingredient(String description, Double price) {
        this.description = description;
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void add() {
        System.out.println("Adding " + description);
    }
}

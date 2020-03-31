package org.example.flexibility.inheritance;


public class Ingredient {
    private Double price;
    private String description;

    public Ingredient(String description, Double price) {
        this.description = description;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public void add() {
        System.out.println("Adding " + description);
    }
}

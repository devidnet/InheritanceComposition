package org.example.flexibility.composition;

public enum PizzaSize implements IPizzaSize {
    PERSONAL(1.0),
    MEDIUM(1.5),
    LARGE(2.0);

    private double multiplier;
    PizzaSize(double multiplier) {
        this.multiplier = multiplier;
    }
    @Override
    public double getMultiplier() {
        return multiplier;
    }
}

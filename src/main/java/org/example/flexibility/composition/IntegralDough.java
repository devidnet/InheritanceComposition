package org.example.flexibility.composition;

public final class IntegralDough implements IDough {
    @Override
    public void prepare() {
        System.out.println("Preparing integral dough");
    }
}

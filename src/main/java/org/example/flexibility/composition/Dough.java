package org.example.flexibility.composition;

public class Dough implements IDough {
    @Override
    public void prepare() {
        System.out.println("Preparing dough");
    }
}

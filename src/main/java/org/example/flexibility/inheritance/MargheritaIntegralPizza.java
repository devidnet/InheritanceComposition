package org.example.flexibility.inheritance;

public class MargheritaIntegralPizza extends MargheritaPizza {

    @Override
    protected void prepareDough() {
        System.out.println("Preparing integral dough");
    }
}

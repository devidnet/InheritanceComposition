package org.example.flexibility.inheritance;

public class HawaianMicroWavePizza extends HawaianPizza {
    @Override
    protected void bake() {
        System.out.println("Baking pizza in microwave");
    }
}

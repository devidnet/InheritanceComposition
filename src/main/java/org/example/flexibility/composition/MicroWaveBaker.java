package org.example.flexibility.composition;

public class MicroWaveBaker implements IBaker {
    @Override
    public void bake() {
        System.out.println("Baking pizza in microwave");
    }
}

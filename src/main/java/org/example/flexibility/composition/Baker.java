package org.example.flexibility.composition;

public final class Baker implements IBaker {
        @Override
        public void bake() {
            System.out.println("Baking pizza");
        }
}

package org.example.flexibility.inheritance;

public class App {
    public static void main(String[] args) {
        // Hawaian
        BasePizza hawaianPizza = new HawaianPizza();
        hawaianPizza.prepare();
        System.out.println("Hawaian Price: " + hawaianPizza.getPrice());
        System.out.println(System.lineSeparator());

        // Hawaian in microwave
        BasePizza hawaianMicroWavePizza = new HawaianMicroWavePizza();
        hawaianMicroWavePizza.prepare();
        System.out.println("Hawaian Price: " + hawaianMicroWavePizza.getPrice());
        System.out.println(System.lineSeparator());

        // Margherita
        BasePizza margheritaPizza = new MargheritaPizza();
        margheritaPizza.prepare();
        System.out.println("Margherita Price: " + margheritaPizza.getPrice());
        System.out.println(System.lineSeparator());

        // Margherita Integral
        BasePizza margheritaIntegralPizza = new MargheritaIntegralPizza();
        margheritaIntegralPizza.prepare();
        System.out.println("Margherita Integral Price: " + margheritaIntegralPizza.getPrice());
        System.out.println(System.lineSeparator());
    }
}

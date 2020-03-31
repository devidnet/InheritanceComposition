package org.example.flexibility.composition;

public class App {
    public static void main(String[] args) {
        PizzaProvider pizzaProvider = new PizzaProvider();

        // Hawaian
        IPizza hawaianPizza = pizzaProvider.getHawaian();
        hawaianPizza.prepare();
        System.out.println("Hawaian Price: " + hawaianPizza.getPrice());
        System.out.println(System.lineSeparator());

        // Hawaian
        IPizza hawaianMicroWavePizza = pizzaProvider.getHawaianMicroWave();
        hawaianMicroWavePizza.prepare();
        System.out.println("Hawaian in microwave Price: " + hawaianMicroWavePizza.getPrice());
        System.out.println(System.lineSeparator());

        // Margherita
        IPizza margheritaPizza = pizzaProvider.getMargherita();
        margheritaPizza.prepare();
        System.out.println("Margherita Price: " + margheritaPizza.getPrice());
        System.out.println(System.lineSeparator());

        // Margherita Integral
        IPizza margheritaIntegralPizza = pizzaProvider.getMargheritaIntegral();
        margheritaIntegralPizza.prepare();
        System.out.println("Margherita Integral Price: " + margheritaIntegralPizza.getPrice());
        System.out.println(System.lineSeparator());
    }
}

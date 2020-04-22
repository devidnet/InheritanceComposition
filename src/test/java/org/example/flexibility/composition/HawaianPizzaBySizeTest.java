package org.example.flexibility.composition;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class HawaianPizzaBySizeTest {

    @Test
    public void test_PreparePersonalHawaianPizza() {
        // Given
        PizzaProvider pizzaProvider = new PizzaProvider();
        IPizza pizza = pizzaProvider.getHawaianPersonal();

        // When
        //pizza.prepare();
        double pizzaPrice = pizza.getPrice();

        // Then
        assertThat(pizzaPrice, is(22.0));
    }

    @Test
    public void test_PrepareMediumHawaianPizza() {
        // Given
        PizzaProvider pizzaProvider = new PizzaProvider();
        IPizza pizza = pizzaProvider.getHawaianMedium();

        // When
        //pizza.prepare();
        double pizzaPrice = pizza.getPrice();

        // Then
        assertThat(pizzaPrice, is(33.0));
    }

    @Test
    public void test_PrepareLargeHawaianPizza() {
        // Given
        PizzaProvider pizzaProvider = new PizzaProvider();
        IPizza pizza = pizzaProvider.getHawaianLarge();

        // When
        //pizza.prepare();
        double pizzaPrice = pizza.getPrice();

        // Then
        assertThat(pizzaPrice, is(44.0));
    }
}

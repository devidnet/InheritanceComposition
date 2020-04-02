package org.example.flexibility.inheritance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HawaianPizzaTest extends BaseTest {

    @Test
    void prepare_WhenPizzaIsRequested_PrintsMessagesCorrectly() {
        // Arrange
        StringBuilder expectedOutput = new StringBuilder();
        expectedOutput.append("Preparing dough");
        expectedOutput.append(System.lineSeparator());
        expectedOutput.append("Adding Cheese");
        expectedOutput.append(System.lineSeparator());
        expectedOutput.append("Adding Pineapple");
        expectedOutput.append(System.lineSeparator());
        expectedOutput.append("Adding Peach");
        expectedOutput.append(System.lineSeparator());
        expectedOutput.append("Adding Tomato sauce");
        expectedOutput.append(System.lineSeparator());
        expectedOutput.append("Adding Ham");
        expectedOutput.append(System.lineSeparator());
        expectedOutput.append("Baking pizza");
        expectedOutput.append(System.lineSeparator());
        HawaianPizza pizza = new HawaianPizza();

        // Act
        pizza.prepare();

        // Assert
        Assertions.assertEquals(expectedOutput.toString(), getOutput());
    }

    @Test
    void getPrice_WhenPizzaPriceIsRequest_PizzaPriceIncludingIngredientsPrices() {
        // Arrange
        double expected = 22.0;
        HawaianPizza pizza = new HawaianPizza();

        // Act
        double result = pizza.getPrice();

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void prepareDough() {
    }

    @Test
    void bake() {
    }
}
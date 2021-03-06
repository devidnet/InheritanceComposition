package org.example.flexibility.inheritance;

import org.junit.Assert;
import org.junit.Test;

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
        Assert.assertEquals(expectedOutput.toString(), getOutput());
    }

    @Test
    void getPrice_WhenPizzaPriceIsRequest_PizzaPriceIncludingIngredientsPrices() {
        // Arrange
        double expected = 22.0;
        HawaianPizza pizza = new HawaianPizza();

        // Act
        double result = pizza.getPrice();

        // Assert
        Assert.assertEquals(expected, result);
    }

    @Test
    void bake_WhenBakingPizzaIsRequested_PrintsMessageCorrectly() {
        // Arrange
        StringBuilder expectedOutput = new StringBuilder();
        expectedOutput.append("Baking pizza");
        expectedOutput.append(System.lineSeparator());
        HawaianPizza pizza = new HawaianPizza();

        // Act
        pizza.bake();

        // Assert
        Assert.assertEquals(expectedOutput.toString(), getOutput());
    }

    @Test
    void prepareDough_WhenPizzaDoughIsRequested_PrintsMessageCorrectly() {
        // Given
        StringBuilder expectedOutput = new StringBuilder();
        expectedOutput.append("Preparing dough");
        expectedOutput.append(System.lineSeparator());
        HawaianPizza pizza = new HawaianPizza();

        // When
        pizza.prepareDough();

        // Then
        Assert.assertEquals(expectedOutput.toString(), getOutput());
    }
}
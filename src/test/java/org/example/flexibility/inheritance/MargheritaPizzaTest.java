package org.example.flexibility.inheritance;

import org.junit.Assert;
import org.junit.Test;

class MargheritaPizzaTest extends BaseTest {

    @Test
    void prepare_WhenPizzaIsRequested_PrintsMessagesCorrectly() {
        // Arrange
        StringBuilder expectedOutput = new StringBuilder();
        expectedOutput.append("Preparing dough");
        expectedOutput.append(System.lineSeparator());
        expectedOutput.append("Adding Tomato sauce");
        expectedOutput.append(System.lineSeparator());
        expectedOutput.append("Adding Cheese");
        expectedOutput.append(System.lineSeparator());
        expectedOutput.append("Adding Tomato");
        expectedOutput.append(System.lineSeparator());
        expectedOutput.append("Baking pizza");
        expectedOutput.append(System.lineSeparator());
        MargheritaPizza pizza = new MargheritaPizza();

        // Act
        pizza.prepare();

        // Assert
        Assert.assertEquals(expectedOutput.toString(), getOutput());
    }

    @Test
    void getPrice_WhenPizzaPriceIsRequest_PizzaPriceIncludingIngredientsPrices() {
        // Arrange
        double expected = 17.0;
        MargheritaPizza pizza = new MargheritaPizza();

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
        MargheritaPizza pizza = new MargheritaPizza();

        // Act
        pizza.bake();

        // Assert
        Assert.assertEquals(expectedOutput.toString(), getOutput());
    }

    @Test
    void prepareDough_WhenPizzaDoughIsRequested_PrintsMessageCorrectly() {
        // Arrange
        StringBuilder expectedOutput = new StringBuilder();
        expectedOutput.append("Preparing dough");
        expectedOutput.append(System.lineSeparator());
        MargheritaPizza pizza = new MargheritaPizza();

        // Act
        pizza.prepareDough();

        // Assert
        Assert.assertEquals(expectedOutput.toString(), getOutput());
    }
}
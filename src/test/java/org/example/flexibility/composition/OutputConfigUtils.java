package org.example.flexibility.composition;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.mockito.Mockito.verify;

public final class OutputConfigUtils {
    private static final PrintStream SYSTEM_OUT = System.out;
    private static ByteArrayOutputStream testOut;

    private OutputConfigUtils() {
        // Prevents instantiation
    }

    public static void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    public static void restoreOutput() {
        System.setOut(SYSTEM_OUT);
    }

    public static String getOutput() {
        return testOut.toString();
    }

    @RunWith(MockitoJUnitRunner.class)
    public static class PizzaTest {

        @Mock
        IDough dough;

        @Mock
        IBaker baker;

        @Mock
        List<IIngredient> ingredients;

        @Mock
        IPriceCalculator priceCalculator;

        @InjectMocks
        Pizza pizza;

        @Test
        public void getPrice_WhenPizzaWithoutIngredientsRequestsPrice_ReturnsTotalPrice_Stub() {
            // Arrange
            double expected = 100.0;
            PriceCalculatorStub priceCalculator = new PriceCalculatorStub();
            Pizza pizza = new Pizza(null, null, priceCalculator, null);

            // Act
            double result = pizza.getPrice();

            // Assert
            Assert.assertEquals(expected, result, 0.0);
        }

        @Test
        public void getPrice_WhenPizzaWithoutIngredientsRequestsPrice_ReturnsTotalPrice_Mock() {
            // Arrange

            // Act
            pizza.getPrice();

            // Assert
            verify(priceCalculator).calculate(5.0, ingredients);
        }
    }
}

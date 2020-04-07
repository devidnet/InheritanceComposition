package org.example.flexibility.composition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class PizzaTest {

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
    void getPrice_WhenPizzaWithoutIngredientsRequestsPrice_ReturnsTotalPrice_Stub() {
        // Arrange
        double expected = 5.0;
        PriceCalculatorStub priceCalculator = new PriceCalculatorStub();
        Pizza pizza = new Pizza(null, null, priceCalculator, null);

        // Act
        double result = pizza.getPrice();

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getPrice_WhenPizzaWithoutIngredientsRequestsPrice_ReturnsTotalPrice_Mock() {
        // Arrange

        // Act
        pizza.getPrice();

        // Assert
        verify(priceCalculator).calculate(5.0, ingredients);
    }
}
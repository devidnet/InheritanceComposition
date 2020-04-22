package org.example.flexibility.composition;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class PriceCalculatorBySizeTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {PizzaSize.PERSONAL, 10.0},
                {PizzaSize.MEDIUM, 15.0},
                {PizzaSize.LARGE, 20.0}
        });
    }

    private PizzaSize input;
    private double output;

    public PriceCalculatorBySizeTest(PizzaSize input, double output) {
        this.input = input;
        this.output = output;
    }

    @Test
    public void test_CalculatePrice() {
        // Given
        double basePrice = 5.0;
        List<IIngredient> ingredients = new ArrayList<>();
        ingredients.add(new Ingredient("Item1", 2.5));
        ingredients.add(new Ingredient("Item2", 2.5));
        PriceCalculator calculator = new PriceCalculator(input);

        // When
        double price = calculator.calculate(5.0, ingredients);

        //Then
        MatcherAssert.assertThat(price, Matchers.is(output));
    }
}

package org.example.flexibility.exceptions;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;

import org.example.flexibility.calculator.CalculatorPlus;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ExceptionTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void test_Rule() {
        thrown.expect(NullPointerException.class);
        thrown.expectMessage(isEmptyOrNullString());

        CalculatorPlus calc = new CalculatorPlus();
        calc.getEvenNumberMessage(null);
    }

    @Test
    public void test_TryCatch() {
        try {
            CalculatorPlus calc = new CalculatorPlus();
            calc.getEvenNumberMessage(null);

            Assert.fail();
        } catch (NullPointerException exception) {
            assertThat(exception.getMessage(), isEmptyOrNullString());
        }
    }

    @Test(expected = NullPointerException.class)
    public void test_ExpectedAttribute() {
        CalculatorPlus calc = new CalculatorPlus();
        calc.getEvenNumberMessage(null);
    }

    @Test(expected = NullPointerException.class)
    public void test_MockingException() {
        int[] params = {1, 2, 3, 4};
        CalculatorPlus calc = mock(CalculatorPlus.class);
        //when(calc.getEvenNumberMessage(params)).thenThrow(NullPointerException.class);
        //doThrow(NullPointerException.class).when(calc).getEvenNumberMessage(params);

        calc.getEvenNumberMessage(params);
    }
}

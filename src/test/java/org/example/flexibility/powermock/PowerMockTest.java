package org.example.flexibility.powermock;

import org.example.flexibility.calculator.CalculatorPlus;
import org.example.flexibility.calculator.NumberUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

@RunWith(PowerMockRunner.class)
@PrepareForTest(NumberUtils.class)
public class PowerMockTest {

    @Test
    public void test_methodWithStaticMethodCall() {
        // Arrange
        int[] numbers = {1, 2, 3, 4, 5, 6};
        String expected = "The even number(s) is/are: 5";
        PowerMockito.mockStatic(NumberUtils.class);
        PowerMockito.when(NumberUtils.countEvenNumbers(numbers)).thenReturn(5);
        CalculatorPlus calculatorPlus = new CalculatorPlus();

        // Act
        String actual = calculatorPlus.getEvenNumberMessage(numbers);

        // Assert
        Assert.assertEquals(expected, actual);
        PowerMockito.verifyStatic(Mockito.times(2));
        NumberUtils.countEvenNumbers(numbers);
    }

    @Test
    public void test_privateMethod() throws Exception {
        // Arrange
        String expected = "The even number(s) is/are: ";
        CalculatorPlus calculatorPlus = PowerMockito.mock(CalculatorPlus.class);

        // Act
        String result = Whitebox.invokeMethod(calculatorPlus, "getMessageTemplate");

        // Assert
        Assert.assertEquals(expected, result);
    }
}

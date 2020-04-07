package org.example.flexibility.mockito;

import org.example.flexibility.composition.IPriceCalculator;
import org.example.flexibility.composition.Pizza;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.mockito.Mockito.*;

import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;

@ExtendWith(MockitoExtension.class)
public class MockingTest {

    @Test
    public void test1() {
        // Arrange
        int expected = 100;
        ArrayList myList = mock(ArrayList.class);
        when(myList.size()).thenReturn(100);

        // Act
        int result = myList.size();

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void test2() {
        // Arrange
        int expected = 100;
        ArrayList myList = spy(ArrayList.class);
        myList.add("Foo");
        when(myList.size()).thenReturn(100);

        // Act
        int result = myList.size();

        // Assert
        Assertions.assertEquals(expected, result);
        Assertions.assertEquals("Foo", myList.get(0));
    }
}

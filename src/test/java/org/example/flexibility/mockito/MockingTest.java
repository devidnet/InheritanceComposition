package org.example.flexibility.mockito;

import static org.mockito.Mockito.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;

@RunWith(MockitoJUnitRunner.class)
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
        Assert.assertEquals(expected, result);
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
        Assert.assertEquals(expected, result);
        Assert.assertEquals("Foo", myList.get(0));
    }
}

package org.example.flexibility.mockito;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;
import static org.mockito.BDDMockito.*;

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

    @Test
    public void test1_BDD() {
        // Given - Arrange
        ArrayList myList = mock(ArrayList.class);
        given(myList.size()).willReturn(100);

        // When - Act
        int result = myList.size();

        // Then - Assert
        then(myList).should(only()).size();
        assertThat(result, is(100));
    }
}

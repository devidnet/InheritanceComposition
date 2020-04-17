package org.example.flexibility.composition;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class BakerTest {

    @After
    public void restoreOutput() {
        OutputConfigUtils.restoreOutput();
    }

    @Test
    public void bake_WhenBakePizzaIsCalled_PrintsMessageCorrectly() {
        // Arrange
        StringBuilder expectedOutput = new StringBuilder();
        expectedOutput.append("Baking pizza");
        expectedOutput.append(System.lineSeparator());
        OutputConfigUtils.setUpOutput();
        Baker baker = new Baker();

        // Act
        baker.bake();

        // Assert
        Assert.assertEquals(expectedOutput.toString(), OutputConfigUtils.getOutput());
    }
}
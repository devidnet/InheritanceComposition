package org.example.flexibility.composition;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

class BakerTest {

    @AfterEach
    public void restoreOutput() {
        OutputConfigUtils.restoreOutput();
    }

    @Test
    void bake_WhenBakePizzaIsCalled_PrintsMessageCorrectly() {
        // Arrange
        StringBuilder expectedOutput = new StringBuilder();
        expectedOutput.append("Baking pizza");
        expectedOutput.append(System.lineSeparator());
        OutputConfigUtils.setUpOutput();
        Baker baker = new Baker();

        // Act
        baker.bake();

        // Assert
        Assertions.assertEquals(expectedOutput.toString(), OutputConfigUtils.getOutput());
    }
}
package org.example.flexibility.inheritance;


import org.junit.After;
import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public abstract class BaseTest {

    private final PrintStream systemOut;
    private ByteArrayOutputStream testOut;

    public BaseTest() {
        systemOut = System.out;
    }

    @Before
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    @After
    public void restoreOutput() {
        System.setOut(systemOut);
    }

    public String getOutput() {
        return testOut.toString();
    }
}

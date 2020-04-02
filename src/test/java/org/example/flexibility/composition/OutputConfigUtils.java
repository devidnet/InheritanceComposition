package org.example.flexibility.composition;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public final class OutputConfigUtils {
    private static final PrintStream SYSTEM_OUT = System.out;
    private static ByteArrayOutputStream testOut;

    private OutputConfigUtils() {
        // Prevents instantiation
    }

    public static void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    public static void restoreOutput() {
        System.setOut(SYSTEM_OUT);
    }

    public static String getOutput() {
        return testOut.toString();
    }
}

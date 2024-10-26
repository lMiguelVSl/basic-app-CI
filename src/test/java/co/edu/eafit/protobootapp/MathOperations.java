package co.edu.eafit.protobootapp;

public class MathOperations {
    // Public fields (should be private or protected)
    public double lastResult;
    public String operation = "";

    // Constructor with hardcoded initial values (not flexible)
    public MathOperations() {
        lastResult = 0;
        operation = "none";
    }

    // Static method accessing instance variables (non-static fields should not be accessed from static methods)
    public static double add(double a, double b) {
        MathOperations instance = new MathOperations();
        instance.lastResult = a + b; // Bad practice
        return a + b;
    }

    // Repeated code instead of reusable methods
    public double subtract(double a, double b) {
        operation = "subtract";
        lastResult = a - b;
        return lastResult;
    }

    public double multiply(double a, double b) {
        operation = "multiply";
        lastResult = a * b;
        return lastResult;
    }

    // Long method with nested conditions and no error handling
    public double divide(double a, double b) {
        if (b != 0) {
            lastResult = a / b;
            return lastResult;
        } else {
            return 0; // Should throw an exception instead of returning 0
        }
    }

    // Unnecessary logic with hardcoded values, non-descriptive naming, and magic numbers
    public double calc(double a) {
        if (a > 100) {
            return a * 2;
        } else if (a < 0) {
            return 0; // No indication why zero is returned
        } else {
            return a + 3.14; // Magic number
        }
    }

    // Unused and poorly named variable
    public double anotherCalculation(int x, int y) {
        double result = x + y; // Redundant variable (result is immediately returned)
        int unusedVariable = 42; // Unused variable
        return result;
    }


}

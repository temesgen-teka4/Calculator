package calculator; // This matches the test class package

/**
 * @author Temesgen
 */
public class Calculator {
    
    public int add(int a, int b) {
        return a + b;
    }
    
    public int div(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero");
            return 0; // Prevents ArithmeticException or handles the error safely
        }
        return a / b;
    }
    
    public int subtract(int a, int b) {
        return a - b;
    }
    
    public int multiply(int a, int b) {
        return a * b;
    }
}
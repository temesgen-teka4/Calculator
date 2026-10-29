package calculator; // Change this to match your package name if different

import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleTest {

    // Define the expected return values based on the Triangle class constants
    private static final int INVALID = 4;
    private static final int SCALENE = 1;
    private static final int ISOSCELES = 2;
    private static final int EQUILATERAL = 3;

    @Test
    public void testInvalidWithZeroOrNegative() {
        assertEquals(INVALID, Triangle.classify(0, 5, 5));
        assertEquals(INVALID, Triangle.classify(5, -3, 5));
    }

    @Test
    public void testInvalidTriangleInequality() {
        // Sum of two sides is less than the third side
        assertEquals(INVALID, Triangle.classify(1, 2, 10));
    }

    @Test
    public void testEquilateralTriangle() {
        // All sides equal
        assertEquals(EQUILATERAL, Triangle.classify(5, 5, 5));
    }

    @Test
    public void testScaleneTriangle() {
        // All sides different and valid
        assertEquals(SCALENE, Triangle.classify(3, 4, 5));
    }

    @Test
    public void testIsoscelesAB() {
        // Side a and b are equal
        assertEquals(ISOSCELES, Triangle.classify(5, 5, 3));
    }

    @Test
    public void testIsoscelesAC() {
        // Side a and c are equal
        assertEquals(ISOSCELES, Triangle.classify(5, 3, 5));
    }

    @Test
    public void testIsoscelesBC() {
        // Side b and c are equal
        assertEquals(ISOSCELES, Triangle.classify(3, 5, 5));
    }
}
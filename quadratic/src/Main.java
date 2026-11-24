import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // If your class only has a parameterized constructor, use: new Quadratic(2.0,
        // -4.0, -6.0);
        Quadratic eq = new Quadratic(2, -4, -6);

        System.out.println("=== Case 1: Two Real Roots, Opens Upward (2x^2 - 4x - 6) ===");
        System.out.println("a: " + eq.getA());
        System.out.println("b: " + eq.getB());
        System.out.println("c: " + eq.getC());
        System.out.println("Discriminant: " + eq.getDiscriminant()); // Expected: 64.0
        System.out.println("Has Real Roots: " + eq.hasRealRoots()); // Expected: true
        System.out.println("Roots: " + Arrays.toString(eq.getRoots())); // Expected: [3.0, -1.0]
        System.out.println("Vertex: " + Arrays.toString(eq.getVertex())); // Expected: [1.0, -8.0]
        System.out.println("Y-Intercept: " + eq.getYIntercept()); // Expected: -6.0
        System.out.println("Is Maximum: " + eq.isMaximum()); // Expected: false

        // Called directly because these three methods have a void return type
        System.out.print("Standard Form: ");
        eq.getStandardForm();
        System.out.print("Factored Form: ");
        eq.getFactoredForm();
        System.out.print("Vertex Form: ");
        eq.getVertexForm();

        // 2. Test one repeated real root and a parabola with a maximum point (opens
        // downward)
        eq.setA(-1.0);
        eq.setB(4.0);
        eq.setC(-4.0);

        System.out.println("\n=== Case 2: One Real Root, Opens Downward (-x^2 + 4x - 4) ===");
        System.out.println("Discriminant: " + eq.getDiscriminant()); // Expected: 0.0
        System.out.println("Has Real Roots: " + eq.hasRealRoots()); // Expected: true
        System.out.println("Roots: " + Arrays.toString(eq.getRoots())); // Expected: [2.0] or [2.0, 2.0]
        System.out.println("Vertex: " + Arrays.toString(eq.getVertex())); // Expected: [2.0, 0.0]
        System.out.println("Y-Intercept: " + eq.getYIntercept()); // Expected: -4.0
        System.out.println("Is Maximum: " + eq.isMaximum()); // Expected: true

        System.out.print("Standard Form: ");
        eq.getStandardForm();
        System.out.print("Factored Form: ");
        eq.getFactoredForm();
        System.out.print("Vertex Form: ");
        eq.getVertexForm();

        // 3. Test a parabola with no real roots (negative discriminant)
        eq.setA(1.0);
        eq.setB(2.0);
        eq.setC(5.0);

        System.out.println("\n=== Case 3: No Real Roots (x^2 + 2x + 5) ===");
        System.out.println("Discriminant: " + eq.getDiscriminant()); // Expected: -16.0
        System.out.println("Has Real Roots: " + eq.hasRealRoots()); // Expected: false
        System.out.println("Roots: " + Arrays.toString(eq.getRoots())); // Expected: [] or null
        System.out.println("Vertex: " + Arrays.toString(eq.getVertex())); // Expected: [-1.0, 4.0]
        System.out.println("Y-Intercept: " + eq.getYIntercept()); // Expected: 5.0
        System.out.println("Is Maximum: " + eq.isMaximum()); // Expected: false

        System.out.print("Standard Form: ");
        eq.getStandardForm();
        System.out.print("Factored Form: ");
        eq.getFactoredForm();
        System.out.print("Vertex Form: ");
        eq.getVertexForm();
    }
}
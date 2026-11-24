public class Quadratic {

    private double a;
    private double b;
    private double c;

    public Quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public boolean isMaximum() {
        return a < 0;
    }

    public boolean hasRealRoots() {
        return b * b - 4 * a * c >= 0;
    }

    public double[] getRoots() {
        double root1 = (-b + Math.sqrt(getDiscriminant())) / (2 * a);
        double root2 = (-b - Math.sqrt(getDiscriminant())) / (2 * a);

        return new double[] { root1, root2 };
    }

    public void getFactoredForm() {
        double[] roots = getRoots();

        System.out.println("y = (x - (" + roots[0] + "))(x - (" + roots[1] + "))");
    }

    public void getStandardForm() {
        System.out.println("y = " + a + "x^2 " + b + "x " + c);
    }

    public double getYIntercept() {
        return c;
    }

    public double[] getVertex() {
        double x = -b / (2 * a);
        double y = a * (x * x) + b * x + c;

        return new double[] { x, y };
    }

    public void getVertexForm() {
        double[] vertex = getVertex();

        System.out.println("y = " + a + "(x - (" + vertex[0] + "))" + vertex[1]);
    }
}

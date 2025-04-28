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

    public void setB(double b) {
        this.b = b;
    }
    
    public void setC(double c) {
        this.c = c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double[] getRoots() {
        double[] roots = new double[2];
        double discriminant = getDiscriminant();

        if (discriminant < 0) {
            return null;
        } else {
            roots[0] = (-b + Math.sqrt(discriminant)) / (2 * a);
            roots[1] = (-b - Math.sqrt(discriminant)) / (2 * a);
            return roots;
        }
    }

    public void getFactoredForm() {
        double[] roots = getRoots();

        if(roots != null) {
            System.out.println("f(x) = " + a + "(x - " + roots[0] + ")" + "(x - " + roots[1] + ")");
        } else {
            System.out.println("No factored form :(");
        }
    }

    public void getStandardForm() {
        System.out.println("f(x) = " + a + "x^2 " + b + "x " + c);
    }

    public double[] getVertex() {
        double h = -b / (2 * a);
        double k = (4 * a * c - b * b) / (4 * a);

        return new double[] {h , k};
    }

    public void getVertexForm() {
        double[] vertex = getVertex();

        System.out.println("f(x) = " + a + "(x - " + vertex[0] + ")^2 " + vertex[1]);
    }

    public double getYIntercept() {
        return c;
    }

    public boolean hasRealRoots() {
        return getDiscriminant() >= 0;
    }

    public boolean isMaximum() {
        return a > 0;
    }
}

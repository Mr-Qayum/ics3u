import java.util.Scanner;

public class HelperMethods {

    public static void quadraticFormula(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

        if (discriminant < 0) {
            System.out.println("There are no real roots!");
        } else if (discriminant > 0) {
            System.out.println("Root 1 is: " + root1);
            System.out.println("Root 2 is: " + root2);
        } else {
            System.out.println("The double root is: " + root1);
        }
    }

    public static double piApproximation(int n) {
        double sum = 0.0;

        for (int i = 0; i <= n; i++) {
            sum += Math.pow(-1, i) / (2 * i + 1);
        }

        return 4 * sum;
    }

    public static void asymptoteFinder(int m, int n) {
        if (m == n) {
            System.out.println("The asymptote is horizontal!");
        } else if (m < n) {
            System.out.println("The asymptote is the x-axis!");
        } else {
            switch (m - n) {
                case 1:
                    System.out.println("The asymptote is linear!");
                    break;
                case 2:
                    System.out.println("The asymptote is quadratic!");
                    break;
                case 3:
                    System.out.println("The asymptote is cubic!");
                    break;
                case 4:
                    System.out.println("The asymptote is quartic!");
                    break;
                case 5:
                    System.out.println("The asymptote is quintic!");
                    break;
                case 6:
                    System.out.println("The asymptote is sextic!");
                    break;
                case 7:
                    System.out.println("The asymptote is septic!");
                    break;
                case 8:
                    System.out.println("The asymptote is octic!");
                    break;
                case 9:
                    System.out.println("The asymptote is nonic!");
                    break;
                case 10:
                    System.out.println("The asymptote is decic!");
                    break;
                default:
                    System.out.println("Degree not supported!");
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner stringScanner = new Scanner(System.in);
        Scanner numberScanner = new Scanner(System.in);

        loop: while (true) {
            System.out.println("*******************************");
            System.out.println("Please enter an option:");
            System.out.println("1. Quadratic Formula");
            System.out.println("2. PI Approximation");
            System.out.println("3. Asymptote Finder");
            System.out.println("4. Quit");
            System.out.println("*******************************");

            int option = numberScanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Please enter an a value:");
                    double a = numberScanner.nextDouble();
                    System.out.println("Please enter a b value:");
                    double b = numberScanner.nextDouble();
                    System.out.println("Please enter a c value:");
                    double c = numberScanner.nextDouble();
                    quadraticFormula(a, b, c);
                    break;
                case 2:
                    System.out.println("Please enter an n value:");
                    int n = numberScanner.nextInt();
                    System.out.println("The PI approximation is: " + piApproximation(n));
                    break;
                case 3:
                    System.out.println("Please enter an m value:");
                    int num = numberScanner.nextInt();
                    System.out.println("Please enter an n value:");
                    int den = numberScanner.nextInt();
                    asymptoteFinder(num, den);
                    break;
                case 4:
                    break loop;
            }
        }
        stringScanner.close();
        numberScanner.close();
    }
}

import java.util.Scanner;

public class HelperMethods {

    public static void quadraticFormula(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            System.out.println("No real roots!");
        } else if (discriminant > 0) {
            double rootOne = (-b + Math.sqrt(discriminant)) / (2 * a);
            double rootTwo = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Your first root is: " + rootOne);
            System.out.println("Your second root is: " + rootTwo);
        } else {
            double root = (-b + Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Your unique root is: " + root);
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
            System.out.println("The asymptote is horizontal");
        } else if (n > m) {
            System.out.println("The asymptote is the x-axis");
        } else {
            switch (m - n) {
                case 1:
                    System.out.println("The asymptote is linear");
                    break;
                case 2:
                    System.out.println("The asymptote is qudratic");
                    break;
                case 3:
                    System.out.println("The asymptote is cubic");
                    break;
                case 4:
                    System.out.println("The asymptote is quartic");
                    break;
                case 5:
                    System.out.println("The asymptote is quintic");
                    break;
                case 6:
                    System.out.println("The asymptote is sextic");
                    break;
                case 7:
                    System.out.println("The asymptote is heptic");
                    break;
                case 8:
                    System.out.println("The asymptote is octic");
                    break;
                case 9:
                    System.out.println("The asymptote is nonic");
                    break;
                case 10:
                    System.out.println("The asymptote is decic");
                    break;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        loop: while (true) {
            System.out.println("Please enter a choice:");
            System.out.println("1. Quadratic Formula");
            System.out.println("2. PI Approximation");
            System.out.println("3. Asmymptote Finder");
            System.out.println("4. Quit");

            switch (keyboard.nextInt()) {
                case 1:
                    System.out.println("Please enter an a value:");
                    double a = keyboard.nextDouble();
                    System.out.println("Please enter a b value:");
                    double b = keyboard.nextDouble();
                    System.out.println("Please enter a c value:");
                    double c = keyboard.nextDouble();
                    quadraticFormula(a, b, c);
                    break;
                case 2:
                    System.out.println("Please enter an n value:");
                    System.out.println("Your PI approximation is:" + piApproximation(keyboard.nextInt()));
                    break;
                case 3:
                    System.out.println("Please enter an m value:");
                    int m = keyboard.nextInt();
                    System.out.println("Please enter an n value:");
                    int n = keyboard.nextInt();
                    asymptoteFinder(m, n);
                    break;
                case 4:
                    break loop;
                default:
                    System.out.println("Please learn to count!");
            }
        }
        keyboard.close();
    }
}
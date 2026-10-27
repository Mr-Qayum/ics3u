import java.util.Scanner;

public class HelperMethods {

    public static void quadraticFormula(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

        System.out.println("Discriminant: " + discriminant);

        if (discriminant > 0) {
            System.out.println("There are two distinct real roots:");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant < 0) {
            System.out.println("There are no real roots:");
        } else {
            System.out.println("There is one real root:");
            System.out.println("Root: " + root1);
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
                    System.out.println("The asymptote is quadratic");
                    break;
                case 3:
                    System.out.println("The asymptote is cubic");
                    break;
                case 4:
                    System.out.println("The asymptote is quartic");
                    break;
                case 5:
                    System.out.println("The asymptote is quinitc");
                    break;
                case 6:
                    System.out.println("The asymptote is sextic");
                    break;
                case 7:
                    System.out.println("The asymptote is septic");
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
                default:
                    System.out.println("The asymptote is too big :(");
                    break;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to Helper Methods!");

        loop: while (true) {
            System.out.println("Please select one of the following options:");
            System.out.println("1. Quadratic Formula");
            System.out.println("2. PI Approximation");
            System.out.println("3. Asymptote Finder");
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
                    int n = keyboard.nextInt();

                    System.out.println("The PI approximation is: " + piApproximation(n));
                    break;
                case 3:
                    System.out.println("Please enter an m value:");
                    int num = keyboard.nextInt();
                    System.out.println("Please enter an n value:");
                    int den = keyboard.nextInt();

                    asymptoteFinder(num, den);
                    break;
                case 4:
                    break loop;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }

        keyboard.close();
    }
}

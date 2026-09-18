import java.util.Scanner;

public class QuadraticFormula {

    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to Quadratic Formula!");
        System.out.println("Please enter an a value:");
        double a = keyboard.nextDouble();
        System.out.println("Please enter a b value:");
        double b = keyboard.nextDouble();
        System.out.println("Please enter a c value:");
        double c = keyboard.nextDouble();

        double discriminant = b * b - 4 * a * c;
        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

        System.out.println("Discriminant: " + discriminant);
        System.out.println("Root 1: " + root1);
        System.out.println("Root 2: " + root2);
        keyboard.close();
    }
}

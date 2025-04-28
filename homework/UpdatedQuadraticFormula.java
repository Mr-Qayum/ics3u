import java.util.Scanner;

public class UpdatedQuadraticFormula {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter an a value:");
        double a = keyboard.nextDouble();
        System.out.println("Please enter a b value:");
        double b = keyboard.nextDouble();
        System.out.println("Please enter a c value:");
        double c = keyboard.nextDouble();
        double discriminant = b * b - 4 * a * c;
        keyboard.close();

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
}
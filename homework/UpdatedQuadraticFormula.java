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
        keyboard.close();

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
}

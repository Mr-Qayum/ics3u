import java.util.Scanner;

public class HeronsFormula {

    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to Herons Formula!");
        System.out.println("Please enter side a:");
        double a = keyboard.nextDouble();
        System.out.println("Please enter side b:");
        double b = keyboard.nextDouble();
        System.out.println("Please enter side c:");
        double c = keyboard.nextDouble();

        double area = Math.sqrt(4 * a * a * b * b - Math.pow(a * a + b * b - c * c, 2)) / 4;

        System.out.println("The area of the triangle is: " + area);
        keyboard.close();
    }
}

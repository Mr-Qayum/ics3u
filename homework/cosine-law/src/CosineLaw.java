import java.util.Scanner;

public class CosineLaw {

    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to Cosine Law!");
        System.out.println("Please enter side a:");
        double a = keyboard.nextDouble();
        System.out.println("Please enter side b:");
        double b = keyboard.nextDouble();
        System.out.println("Please enter angle C (in degrees):");
        double angleC = keyboard.nextDouble();

        double c = Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(Math.toRadians(angleC)));

        System.out.println("Side c is: " + c);
        keyboard.close();
    }
}

import java.util.Scanner;

public class CosineLaw {
    
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter side a of a triangle:");
        double a = keyboard.nextDouble();
        System.out.println("Please enter a side b of a triangle:");
        double b = keyboard.nextDouble();
        System.out.println("Please enter angle C of a triangle in degrees:");
        double angleC = keyboard.nextDouble();

        double c = a * a + b * b - 2 * a * b * Math.cos(Math.toRadians(angleC));

        System.out.println("Side c is: " + Math.sqrt(c));

        keyboard.close();
    }
}

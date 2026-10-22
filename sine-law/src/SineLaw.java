import java.util.Scanner;

public class SineLaw {

    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to Sine Law!");
        System.out.println("Please enter side a:");
        double a = keyboard.nextDouble();
        System.out.println("Please enter side b:");
        double b = keyboard.nextDouble();
        System.out.println("Please enter angle A (in degrees):");
        double angleA = keyboard.nextDouble();

        double ratio = b * Math.sin(Math.toRadians(angleA)) / a;
        double angleB = Math.toDegrees(Math.asin(ratio));

        System.out.println("Angle B (in degrees) is: " + angleB);
        keyboard.close();
    }
}

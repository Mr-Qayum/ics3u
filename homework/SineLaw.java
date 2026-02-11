import java.util.Scanner;

public class SineLaw {
    
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter side a of a triangle:");
        double a = keyboard.nextDouble();
        System.out.println("Please enter a side b of a triangle:");
        double b = keyboard.nextDouble();
        System.out.println("Please enter angle A of a triangle in degrees:");
        double angleA = keyboard.nextDouble();

        double angleB = Math.asin(b * Math.sin(Math.toRadians(angleA)) / a);

        System.out.println("Angle B in degrees is: " + Math.toDegrees(angleB));

        keyboard.close();
    }
}

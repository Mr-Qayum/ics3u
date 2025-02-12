import java.util.Scanner;

public class SineLaw {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter side a:");
        double a = keyboard.nextDouble();
        System.out.println("Please enter side b:");
        double b = keyboard.nextDouble();
        System.out.println("Please enter angle A:");
        double angleA = keyboard.nextDouble();
        keyboard.close();

        double angleB = Math.asin(b * Math.sin(Math.toRadians(angleA)) / a);
        System.out.println("Angle B is: " + Math.toDegrees(angleB));
    }
}

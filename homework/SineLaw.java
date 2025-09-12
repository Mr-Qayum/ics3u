import java.util.Scanner;

public class SineLaw {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter side a:");
        double sideA = keyboard.nextDouble();
        System.out.println("Please enter side b:");
        double sideB = keyboard.nextDouble();
        System.out.println("Please enter angle A (degrees):");
        double angelA = keyboard.nextDouble();
        keyboard.close();
        
        double angleB = Math.asin(sideB * Math.sin(Math.toRadians(angelA)) / sideA);
        
        System.out.println("Angle B is: " + Math.toDegrees(angleB));
    }
}

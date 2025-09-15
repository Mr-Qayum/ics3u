import java.util.Scanner;

public class CosineLaw {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter side a:");
        double sideA = keyboard.nextDouble();
        System.out.println("Please enter side b:");
        double sideB = keyboard.nextDouble();
        System.out.println("Please enter angle C (degrees):");
        double angleC = keyboard.nextDouble();
        keyboard.close();

        double sideC = Math.sqrt(sideA * sideA + sideB * sideB - 2 * sideA * sideB * Math.cos(Math.toRadians(angleC)));

        System.out.println("Side c is: " + sideC);
    }
}

import java.util.Scanner;

public class CosineLaw {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter side a:");
        double a = keyboard.nextDouble();
        System.out.println("Please enter side b:");
        double b = keyboard.nextDouble();
        System.out.println("Please enter angle C:");
        double angleC = keyboard.nextDouble();
        keyboard.close();

        double c = Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(Math.toRadians(angleC)));
        System.out.println("Side c is: " + c);
    }
}

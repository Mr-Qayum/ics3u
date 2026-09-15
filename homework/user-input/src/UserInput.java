import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a decimal:");
        double input = scanner.nextDouble();

        System.out.println("Your casted decimal is: " + (int) input);
        scanner.close();
    }
}

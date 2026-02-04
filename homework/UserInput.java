import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Use this to read an integer
        System.out.println("Please enter a decimal number:");

        System.out.println("The decimal you entered, converted to an integer, is: " + (int) keyboard.nextDouble());
        keyboard.close();
    }
}

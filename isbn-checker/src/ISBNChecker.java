import java.util.Scanner;

public class ISBNChecker {

    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to ISBN Checker!");

        System.out.println("Please enter a valid ISBN-13 number:");
        String isbnNumber = keyboard.nextLine();
        int sum = 0;

        if (isbnNumber.length() != 13) {
            System.out.println("Your ISBN-13 number is not the correct length!");
            System.exit(1);
        }

        for (int i = 0; i < isbnNumber.length(); i++) {
            char current = isbnNumber.charAt(i);

            if (Character.isDigit(current)) {
                int digit = Character.getNumericValue(current);
                sum += i % 2 == 0 ? digit : 3 * digit;
            } else {
                System.out.println("Your ISBN-13 number contained invalid characters!");
                System.exit(1);
            }
        }

        System.out.println("The ISBN number entered is valid: " + (sum % 10 == 0));

        keyboard.close();
    }
}

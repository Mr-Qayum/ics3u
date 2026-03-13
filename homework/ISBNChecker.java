import java.util.Scanner;

public class ISBNChecker {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String choice = "";

        primary: do {
            int sum = 0;

            System.out.println("Please enter an ISBN-13 number:");
            String isbnNumber = keyboard.nextLine();

            if (isbnNumber.length() != 13) {
                System.out.println("Learn to count!");
                continue primary;
            }

            for (int i = 0; i < isbnNumber.length(); i++) {
                if (Character.isDigit(isbnNumber.charAt(i))) {
                    sum += Character.getNumericValue(isbnNumber.charAt(i)) * (i % 2 == 0 ? 1 : 3);
                } else {
                    System.out.println("Learn your numbers!");
                    continue primary;
                }
            }

            System.out.println("Valid ISBN-13 number: " + (sum % 10 == 0));

            System.out.println("Do you want to check another ISBN? (y/n):");
            choice = keyboard.nextLine().toLowerCase();
        } while (!choice.equals("n"));

        keyboard.close();
    }
}
import java.util.Scanner;

public class ISBNChecker {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        double checkSum = 0;

        System.out.println("Please enter an ISBN number:");
        String isbn = keyboard.nextLine();
        keyboard.close();

        if (isbn.length() != 13) {
            System.out.println("Invalid ISBN number!");
        } else {
            for (int i = 0; i < isbn.length(); i++) {
                char digit = isbn.charAt(i);

                if (!Character.isDigit(digit)) {
                    System.out.println("Invalid character found!");
                    break;
                }

                int number = Character.getNumericValue(digit);
                checkSum += i % 2 == 0 ? number : 3 * number;
            }

            System.out.println("Valid ISBN number: " + (checkSum % 10 == 0));
        }
    }
}

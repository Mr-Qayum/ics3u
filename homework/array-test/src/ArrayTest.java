import java.util.Scanner;

public class ArrayTest {

    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        String[] words = new String[10];

        System.out.println("Welcome to Array Test!");

        loop: while (true) {
            System.out.println("Please select one of the following options:");
            System.out.println("1. Enter 10 Strings");
            System.out.println("2. Display all Strings");
            System.out.println("3. Display specific String");
            System.out.println("4. Quit");

            switch (keyboard.nextInt()) {
                case 1:
                    for (int i = 0; i < words.length; i++) {
                        System.out.println("Please enter String " + (i + 1) + ":");
                        words[i] = keyboard.next();
                    }
                    break;
                case 2:
                    for (int i = 0; i < words.length; i++) {
                        System.out.println(words[i]);
                    }
                    break;
                case 3:
                    System.out.println("Please enter an index number from 1-10:");
                    System.out.println(words[keyboard.nextInt() - 1]);
                    break;
                case 4:
                    break loop;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }

        keyboard.close();
    }
}

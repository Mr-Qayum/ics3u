import java.util.Scanner;

public class BooleanTest {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter input a (as a boolean):");
        boolean a = keyboard.nextBoolean();

        System.out.println("Please enter input b (as a boolean):");
        boolean b = keyboard.nextBoolean();

        System.out.println("Please enter input c (as a boolean):");
        boolean c = keyboard.nextBoolean();

        System.out.println("Please enter input d (as a boolean):");
        boolean d = keyboard.nextBoolean();

        System.out.println("The result is: " + (a && b || c && d || c && a || a && d || d && b || b && c));
        keyboard.close();
    }
}

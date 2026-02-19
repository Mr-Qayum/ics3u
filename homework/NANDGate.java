import java.util.Scanner;

public class NANDGate {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter input a (as a boolean):");
        boolean a = keyboard.nextBoolean();

        System.out.println("Please enter input b (as a boolean):");
        boolean b = keyboard.nextBoolean();

        System.out.println("The a NAND b is: " + !(a && b));
        keyboard.close();
    }
}

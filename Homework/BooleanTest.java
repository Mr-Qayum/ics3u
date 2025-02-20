import java.util.Scanner;

public class BooleanTest {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter input A:");
        boolean a = keyboard.nextBoolean();
        System.out.println("Please enter input B:");
        boolean b = keyboard.nextBoolean();
        System.out.println("Please enter input C:");
        boolean c = keyboard.nextBoolean();
        System.out.println("Please enter input D:");
        boolean d = keyboard.nextBoolean();
        keyboard.close();

        boolean result = a && b || c && d || a && c || a && d || b && d || b && c;
        System.out.println("The output is: " + result);
    }
}

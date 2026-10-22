import java.util.Scanner;

public class BooleanTest {

    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to Boolean Test!");
        System.out.println("Please enter input a:");
        boolean a = keyboard.nextBoolean();
        System.out.println("Please enter input b:");
        boolean b = keyboard.nextBoolean();
        System.out.println("Please enter input c:");
        boolean c = keyboard.nextBoolean();
        System.out.println("Please enter input d:");
        boolean d = keyboard.nextBoolean();
        boolean output = a && b || c && d || a && c || a && d || b && d || b && c;

        System.out.println("The logic is: " + output);
        keyboard.close();
    }
}

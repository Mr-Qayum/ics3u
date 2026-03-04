import java.util.Scanner;

public class PiApproximation {

    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        do {
            double sum = 0.0;

            System.out.println("Please enter an n value:");
            int n = keyboard.nextInt();
            keyboard.nextLine();

            for (int i = 0; i <= n; i++) {
                sum += Math.pow(-1, i) / (2 * i + 1);
            }

            System.out.println("Your PI approximation is: " + (4 * sum));

            System.out.println("Do you want to try again? [y/n]");
        } while (keyboard.next().toLowerCase().charAt(0) != 'n');

        keyboard.close();
    }
}

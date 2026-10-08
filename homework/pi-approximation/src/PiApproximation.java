import java.util.Scanner;

public class PiApproximation {

    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to Pi Approximation!");

        prompt: while (true) {
            System.out.println("Please enter an n value:");
            int n = keyboard.nextInt();
            double sum = 0.0;

            for (int i = 0; i <= n; i++) {
                sum += Math.pow(-1, i) / (2 * i + 1);
            }

            System.out.println("The PI approximation is: " + 4 * sum);

            System.out.println("Would you like to try again? [y/n]");

            if (keyboard.next().toLowerCase().charAt(0) == 'n') {
                break prompt;
            }
        }

        keyboard.close();
    }
}

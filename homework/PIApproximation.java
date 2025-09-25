import java.util.Scanner;

public class PIApproximation {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        approximation: while (true) {
            double sum = 0.0;
            System.out.println("Please enter an n value:");
            int n = keyboard.nextInt();

            for (int i = 0; i <= n; i++) {
                sum += Math.pow(-1, i) / (2 * i + 1);
            }

            System.out.println("The PI approximation is: " + 4 * sum);
            System.out.println("Would you like to run another approximation? [true/false]");

            if (!keyboard.nextBoolean()) {
                break approximation;
            }
        }

        keyboard.close();
    }
}

import java.util.Scanner;

public class PiApproximation {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter an n value:");
            int n = keyboard.nextInt();
            double sum = 0.0;
    
            for (int i = 0; i <= n; i++) {
                sum += Math.pow(-1, i) / (2 * i + 1);
            }

            System.out.println("Your pi approximation is: " + 4 * sum);
            System.out.println("Do you want to try again? [y/n]");

            if (keyboard.next().charAt(0) == 'n') {
                keyboard.close();
                break;
            }
        }
    }
}
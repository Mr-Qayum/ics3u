import java.util.Scanner;

public class PowerRule {

    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to Power Rule!");

        System.out.println("Please enter the coefficients (separated by spaces):");
        String[] functionCoefficients = keyboard.nextLine().split(" ");
        System.out.println("Please enter the exponents (separated by spaces):");
        String[] functionExponents = keyboard.nextLine().split(" ");
        final int NUM_OF_TERMS = functionCoefficients.length;

        String firstDerivative = "f'(x) = ";
        String secondDerivative = "f''(x) = ";
        double[] firstDerivCoefficients = new double[functionCoefficients.length];
        double[] secondDerivativeCoefficients = new double[functionCoefficients.length];
        int[] firstDerivativeExponents = new int[functionExponents.length];
        int[] secondDerivativeExponents = new int[functionExponents.length];

        // Convert coefficients and exponents to doubles and integers respectively
        for (int i = 0; i < NUM_OF_TERMS; i++) {
            firstDerivCoefficients[i] = Double.parseDouble(functionCoefficients[i]);
            firstDerivativeExponents[i] = Integer.parseInt(functionExponents[i]);
        }

        // Calculate the first derivative
        for (int i = 0; i < NUM_OF_TERMS; i++) {
            firstDerivCoefficients[i] = firstDerivCoefficients[i] * firstDerivativeExponents[i];
            firstDerivativeExponents[i] = firstDerivativeExponents[i] - 1;
        }

        // Calculate the second derivative
        for (int i = 0; i < NUM_OF_TERMS; i++) {
            secondDerivativeCoefficients[i] = firstDerivCoefficients[i] * firstDerivativeExponents[i];
            secondDerivativeExponents[i] = firstDerivativeExponents[i] - 1;
        }

        // Build the first derivative string
        for (int i = 0; i < NUM_OF_TERMS; i++) {
            String coefficient = "";
            String exponent = "";

            if (firstDerivCoefficients[i] == 0) {
                continue;
            } else if (firstDerivCoefficients[i] < 0) {
                coefficient = "- " + Double.toString(Math.abs(firstDerivCoefficients[i]));
            } else {
                coefficient = "+ " + Double.toString(firstDerivCoefficients[i]);
            }

            if (firstDerivativeExponents[i] <= 0) {
                exponent = "";
            } else if (firstDerivativeExponents[i] == 1) {
                exponent = "x";
            } else {
                exponent = "x^" + firstDerivativeExponents[i];
            }

            firstDerivative += coefficient + exponent + " ";
        }

        // Build the second derivative string
        for (int i = 0; i < NUM_OF_TERMS; i++) {
            String coefficient = "";
            String exponent = "";

            if (secondDerivativeCoefficients[i] == 0) {
                continue;
            } else if (secondDerivativeCoefficients[i] < 0) {
                coefficient = "- " + Double.toString(Math.abs(secondDerivativeCoefficients[i]));
            } else {
                coefficient = "+ " + Double.toString(secondDerivativeCoefficients[i]);
            }

            if (secondDerivativeExponents[i] <= 0) {
                exponent = "";
            } else if (secondDerivativeExponents[i] == 1) {
                exponent = "x";
            } else {
                exponent = "x^" + secondDerivativeExponents[i];
            }

            secondDerivative += coefficient + exponent + " ";
        }

        System.out.println("Your first derivative is: " + firstDerivative);
        System.out.println("Your second derivative is: " + secondDerivative);

        keyboard.close();
    }
}

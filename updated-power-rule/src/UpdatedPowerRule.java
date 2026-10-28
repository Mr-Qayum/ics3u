import java.util.Scanner;

public class UpdatedPowerRule {

    public static void powerRule(int degree, double[] coefficients, int[] exponents) {
        for (int j = 0; j < degree; j++) {
            for (int i = 0; i < coefficients.length; i++) {
                coefficients[i] = coefficients[i] * exponents[i];
                exponents[i] = exponents[i] - 1;
            }
        }
    }

    public static void buildDerivative(double[] coefficients, int[] exponents) {
        for (int i = 0; i < coefficients.length; i++) {
            String coefficient = "";
            String exponent = "";

            if (coefficients[i] == 0) {
                continue;
            } else if (coefficients[i] < 0) {
                coefficient = "- " + Double.toString(Math.abs(coefficients[i]));
            } else {
                coefficient = "+ " + Double.toString(coefficients[i]);
            }

            if (exponents[i] <= 0) {
                exponent = "";
            } else if (exponents[i] == 1) {
                exponent = "x";
            } else {
                exponent = "x^" + exponents[i];
            }

            System.out.print(coefficient + exponent + " ");
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to Updated Power Rule!");

        System.out.println("Please enter the coefficients (separated by spaces):");
        String[] functionCoefficients = keyboard.nextLine().split(" ");
        System.out.println("Please enter the exponents (separated by spaces):");
        String[] functionExponents = keyboard.nextLine().split(" ");
        System.out.println("Please enter the derivative degree:");
        int degree = keyboard.nextInt();

        double[] coefficients = new double[functionCoefficients.length];
        int[] exponents = new int[functionExponents.length];

        for (int i = 0; i < coefficients.length; i++) {
            coefficients[i] = Double.parseDouble(functionCoefficients[i]);
            exponents[i] = Integer.parseInt(functionExponents[i]);
        }

        System.out.print("The derivate of degree " + degree + " is: ");
        powerRule(degree, coefficients, exponents);
        buildDerivative(coefficients, exponents);

        keyboard.close();
    }
}

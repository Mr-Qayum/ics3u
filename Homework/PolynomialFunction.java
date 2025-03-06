import java.util.Scanner;

public class PolynomialFunction {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        String function = "f(x) = ";
        double sum = 0.0;
        
        System.out.println("Enter the coefficients");
        String coefficients = keyboard.nextLine();
        System.out.println("Enter the exponents");
        String exponents = keyboard.nextLine();
        System.out.println("Enter the an x value");
        double x = keyboard.nextDouble();
        keyboard.close();

        String[] coeffSt = coefficients.split(" ");
        String[] expSt = exponents.split(" ");

        for (int i = 0; i < coeffSt.length; i++) {
            double coefficient = Double.parseDouble(coeffSt[i]);
            int exponent = Integer.parseInt(expSt[i]);

            function += (coefficient > 0 ? "+" : "") + coefficient + "x^" + exponent + " ";
            sum += coefficient * Math.pow(x, exponent);
        }

        System.out.println("Your polynomial function is: " + function);
        System.out.println("Your polynomial at x = " + x + " is: f(" + x + ") = " + sum);
    }
}

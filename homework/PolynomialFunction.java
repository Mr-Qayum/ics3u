import java.util.Scanner;

public class PolynomialFunction {
    public static void main(String[] args) throws Exception {
        Scanner stringScanner = new Scanner(System.in);
        Scanner integerScanner = new Scanner(System.in);

        System.out.println("Please enter the coefficients:");
        String[] coefficients = stringScanner.nextLine().split(" ");
        System.out.println("Please enter the degrees:");
        String[] degrees = stringScanner.nextLine().split(" ");
        System.out.println("Please enter an x-value:");
        double x = integerScanner.nextDouble();
        double result = 0.0;

        System.out.print("Your polynomial function is: f(x)=");
        for (int i = 0; i < coefficients.length; i++) {
            double coeff = Double.parseDouble(coefficients[i]);
            result += coeff * Math.pow(x, Double.parseDouble(degrees[i]));
            System.out.print((coeff >= 0 ? "+" : "") + coefficients[i] + "x^" + degrees[i] + " ");
        }

        System.out.println("\nYour polynomial at x = " + x + " is: f(" + x + ") = " + result);

        stringScanner.close();
        integerScanner.close();
    }
}

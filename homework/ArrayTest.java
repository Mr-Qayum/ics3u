import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) throws Exception {
        Scanner stringScanner = new Scanner(System.in);
        Scanner integerScanner = new Scanner(System.in);
        String[] inputs = new String[10];

        loop: while (true) {
            System.out.println("Please enter an option:");
            System.out.println("1. Enter 10 Strings");
            System.out.println("2. Display all Strings");
            System.out.println("3. Display specific String");
            System.out.println("4. Quit");

            int option = integerScanner.nextInt();

            switch (option) {
                case 1:
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Please enter String " + (i + 1));
                        inputs[i] = stringScanner.nextLine();
                    }
                    break;
                case 2:
                    for (int i = 0; i < 10; i++) {
                        System.out.println(inputs[i]);
                    }
                    break;
                case 3:
                    System.out.println("Please enter an input index [1-10]:");
                    System.out.println(inputs[integerScanner.nextInt() - 1]);
                    break;
                case 4:
                    break loop;
            }
        }
        stringScanner.close();
        integerScanner.close();
    }
}

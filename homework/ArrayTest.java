import java.util.Scanner;

public class ArrayTest {
  public static void main(String[] args) throws Exception {
    final int STRING_NUMBER = 10;
    Scanner keyboard = new Scanner(System.in);
    String[] data = new String[STRING_NUMBER];

    loop: while (true) {
      System.out.println("Please select an option:");
      System.out.println("1. Enter " + STRING_NUMBER + " Strings");
      System.out.println("2. Display all Strings");
      System.out.println("3. Select specific String");
      System.out.println("4. Exit");

      int choice = keyboard.nextInt();
      keyboard.nextLine();

      switch (choice) {
        case 1:
          for (int i = 0; i < STRING_NUMBER; i++) {
            System.out.println("Please enter String number " + (i + 1));
            data[i] = keyboard.nextLine();
          }
          break;
        case 2:
          for (int i = 0; i < STRING_NUMBER; i++) {
            System.out.println(data[i]);
          }
          break;
        case 3:
          System.out.println("Which String do you want?");
          choice = keyboard.nextInt();
          System.out.println(data[choice - 1]);
          break;
        case 4:
          keyboard.close();
          break loop;
      }
    }
  }
}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileIO {

    public static void main(String[] args) {
        try (
                BufferedReader inputStream = new BufferedReader(new FileReader("numbers.txt"));
                PrintWriter outputStream = new PrintWriter("average.txt")) {
            String line;
            double sum = 0.0;
            int count = 0;

            while ((line = inputStream.readLine()) != null) {
                sum += Double.parseDouble(line);
                count++;
            }

            outputStream.print(sum / count);
        } catch (IOException exception) {
            System.out.println("Error reading file");
        }
    }
}
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {
    public static void main(String[] args) throws Exception {
        BufferedReader inputStream = null;
        FileWriter outputStream = null;
        String line = "";
        double sum = 0.0;
        int count = 0;

        try {
            inputStream = new BufferedReader(new FileReader("numbers.txt"));
            outputStream = new FileWriter("average.txt");

            while ((line = inputStream.readLine()) != null) {
                sum += Double.parseDouble(line);
                count++;
            }

            outputStream.write("Your average is: " + (sum / count));
        } catch (FileNotFoundException e) {
            System.out.println("Error opening file");
        } catch (IOException e) {
            System.out.println("Error creating file");
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}

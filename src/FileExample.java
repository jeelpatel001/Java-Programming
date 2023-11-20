import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {

        // Example: Reading from a file using FileInputStream
        try (FileInputStream fis = new FileInputStream("input.txt")) {
            int byteRead;
            while ((byteRead = fis.read()) != -1) {
                System.out.print((char) byteRead); // Print characters from the file
            }
        } catch (IOException e) {
            System.err.println("Error reading from the file: " + e.getMessage());
        }

        // Example: Writing to a file using FileOutputStream
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            String data = "Hello, this is an example of FileOutputStream!";
            byte[] byteArray = data.getBytes();
            fos.write(byteArray); // Write data to the file
            System.out.println("\nData written to " + "output.txt");
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    }
}

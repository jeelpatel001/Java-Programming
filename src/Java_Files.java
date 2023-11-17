import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Java_Files {
    public static void main(String[] args) {

//         Create File
/*
        File file = new File("Jeel.txt");
        try {
            file.createNewFile();
            System.out.println("File Was Created");
        } catch (IOException e){
            System.out.println("Error ");
            e.printStackTrace();
        }
*/

//         Write in file
/*
        try {
            FileWriter fileWriter = new FileWriter("Jeel.txt");
            fileWriter.write("Hello My name is Jeel");
            fileWriter.close();

        } catch (IOException e){
            e.printStackTrace();
        }
*/
//        Read file
/*
        File file = new File("Jeel.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
*/
//        Delete File
/*
        File file = new File("Jeel.txt");
        if (file.delete()){
            System.out.println("Your file was Deleted");
        }
*/
    }
}

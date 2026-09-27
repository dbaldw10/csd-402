import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Baldwin_Mod9_2 {

    public static void main(String[] args) {

        File file = new File("data.file");
        Random random = new Random();
        try {

            if (file.createNewFile()) {
                System.out.println("data.file was created.");
            } else {
                System.out.println("data.file already exists.");
            }

            // true allows data to be appended instead of overwritten
            FileWriter fileWriter = new FileWriter(file, true);
            PrintWriter output = new PrintWriter(fileWriter);
            System.out.println();
            System.out.println("Adding 10 random numbers to the file:");

            for (int i = 0; i < 10; i++) {

                int randomNumber = random.nextInt(100) + 1;

                output.print(randomNumber + " ");

                System.out.print(randomNumber + " ");
            }
            output.println();
            output.close();

            System.out.println();
            System.out.println();
            System.out.println("Contents of data.file:");

            Scanner fileReader = new Scanner(file);

            while (fileReader.hasNextLine()) {
                System.out.println(fileReader.nextLine());
            }

            fileReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while working with the file.");
            e.printStackTrace();
        }
    }
}
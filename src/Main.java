import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (FileWriter fileWriter = new FileWriter("leters.txt")) {
            for (char i = 'A'; i <= 'Z'; i++) {
                String a = i + "" + Character.toLowerCase(i) + "\n";
                fileWriter.append(a);
            }
            for (char i = '0'; i <= '9'; i++) {
                fileWriter.write(i + "\n");
            }
        } catch (IOException e) {
            System.out.println("ERORR");
        }
        try (FileReader fileReader = new FileReader("leters.txt")) {
            Scanner scanner = new Scanner(fileReader);
            int i = 1;
            while (scanner.hasNext()) {
                System.out.println(i + " . " + scanner.nextLine());
                i++;
            }
        } catch (IOException e) {
            System.out.println("ERORR");
        }
    }
}
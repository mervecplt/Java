import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            FileWriter dosyam = new FileWriter("test.txt", true);
            dosyam.write("C Sharp\n");
            // dosyam.write("Bozzzzz\n");
            dosyam.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            // TODO: handle exception
        }

    }
}
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            BufferedReader dosyam = new BufferedReader(new FileReader("test.txt"));
            String satir;

            while ((satir = dosyam.readLine()) != null) {
                System.out.println(satir);
            }

            // dosyam.write("Bozzzzz\n");
            dosyam.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            // TODO: handle exception
        }

    }
}
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            File dosya = new File("testt.txt");
            if (dosya.exists()) {
                System.out.println("Dosya mevcut");
            } else {
                System.out.println("Dosya mevcut degil");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            // TODO: handle exception
        }

    }
}
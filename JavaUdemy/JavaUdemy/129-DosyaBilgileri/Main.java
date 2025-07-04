import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            File dosya = new File("test.txt");
            if (dosya.exists()) {
                System.out.println("Dosya adi: " + dosya.getName());
                System.out.println("Dosya yolu: " + dosya.getAbsolutePath());
                System.out.println("Dosya boyutu(byte): " + dosya.length());
            } else {
                System.out.println("Dosya mevcut degil");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            // TODO: handle exception
        }

    }
}
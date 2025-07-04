import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            File dosya = new File("test.txt");
            if (dosya.delete()) {
                System.out.println("Dosya silindi");
            } else {
                System.out.println("Dosya silinemedi");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            // TODO: handle exception
        }

    }
}